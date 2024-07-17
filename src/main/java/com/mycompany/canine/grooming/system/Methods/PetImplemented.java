package com.mycompany.canine.grooming.system.Methods;

import com.mycompany.canine.grooming.system.BD.Conection;
import com.mycompany.canine.grooming.system.Clases.Owner;
import com.mycompany.canine.grooming.system.Clases.Pet;
import com.mycompany.canine.grooming.system.interfaces.DaoPet;
import java.sql.*;

public class PetImplemented implements DaoPet {

    //First we get the instances of the connection class
    Conection conex = Conection.getInstance();

    //about writing the method
    @Override
    public void registerPet(Pet pet, Owner owner) {
        //sql query to insert the pet
        final String SQL_PET = "INSERT INTO pet"
                + " (name,race,color,allergic,special_attention,observations,idOwner) "
                + "VALUES (?,?,?,?,?,?,?) ";

        //sql query to insert the owner
        final String SQL_OWNER = "INERT INTO owner "
                + "(idOwner,name,cellOwner) "
                + "VALUES ((SELECT pet id_owner ORDER BY id_owner DESC LIMIT 1),?,?)";

        try {

            //we connect to the database
            Connection connect = conex.Connect();
            PreparedStatement psPet = connect.prepareStatement(SQL_PET);
            PreparedStatement psOwner = connect.prepareStatement(SQL_OWNER);

            /*We set the fields of the SQL queries for both pet and owner*/
            psPet.setString(1, pet.getName());
            psPet.setString(2, pet.getRace());
            psPet.setString(3, pet.getColor());
            psPet.setString(4, pet.getAllergic());
            psPet.setString(5, pet.getSpecial_attention());
            psPet.setString(6, pet.getObservations());
            psPet.setInt(7, owner.getId_Owner());

            psOwner.setString(1, owner.getName());
            psOwner.setInt(2, owner.getCellOwner());

            //we execute the queries
            psPet.executeUpdate();
            psOwner.executeUpdate();

            conex.closeConnection();
            System.out.println("pet and owner inserted ¡congratulations! ");
        } catch (SQLException e) {
            //we show if there is any error
            System.out.println("error in the insert pet method: " + e.toString());
        }

    }

}
