package com.mycompany.canine.grooming.system.Methods;

import com.mycompany.canine.grooming.system.BD.Conection;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Props {

    public static void loadDataIntoTable(DefaultTableModel defaultTableModel, JTable table) {
        Conection conection = Conection.getInstance();
        final String SQL_SELECT = """
                                  SELECT pet.customer_number,
                                  pet.name,
                                  pet.race,
                                  pet.color,
                                  pet.allergic,
                                  pet.special_attention,
                                  pet.observations ,
                                  owner.name,
                                  owner.cellOwner
                                  FROM pet 
                                  INNER JOIN owner 
                                  ON owner.idOwner = pet.customer_number""";

        try {

            //a try catch for possible exceptions
            Connection connect = conection.Connect();
            try (PreparedStatement prPet = connect.prepareStatement(SQL_SELECT); ResultSet rsPet = prPet.executeQuery()) {

                ResultSetMetaData data = rsPet.getMetaData();

                int numberColumns = data.getColumnCount();

                //we load the data
                while (rsPet.next()) {
                    Object object[] = new Object[numberColumns];
                    for (int i = 0; i < numberColumns; i++) {
                        object[i] = rsPet.getObject(i + 1);
                    }
                    defaultTableModel.addRow(object);
                }

                table.setModel(defaultTableModel);

                conection.closeConnection();
                prPet.close();
                rsPet.close();
            }

        } catch (SQLException e) {
            //show the exception
            System.out.println("error when loading table: " + e.toString());
        }
    }
}
