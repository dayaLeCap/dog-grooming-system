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
    public void registerPet(Owner owner, Pet pet) {

        //sql query to insert the owner
        String SQL_OWNER = "INSERT INTO owner "
                + "(name,cellOwner) "
                + "VALUES (?,?)";

        //sql query to insert the pet
        String SQL_PET = "INSERT INTO pet"
                + " (name,race,color,allergic,special_attention,observations,id_owner) "
                + "VALUES (?,?,?,?,?,?,(SELECT idOwner FROM owner ORDER BY idOwner DESC LIMIT 1)) ";

        try {

            //we connect to the database
            Connection connect = conex.Connect();

            PreparedStatement psOwner = connect.prepareStatement(SQL_OWNER);
            PreparedStatement psPet = connect.prepareStatement(SQL_PET);

            /*We set the fields of the SQL queries for both pet and owner*/
            psOwner.setString(1, owner.getName());
            psOwner.setInt(2, owner.getCellOwner());
            psOwner.executeUpdate();

            psPet.setString(1, pet.getName());
            psPet.setString(2, pet.getRace());
            psPet.setString(3, pet.getColor());
            psPet.setString(4, pet.getAllergic());
            psPet.setString(5, pet.getSpecial_attention());
            psPet.setString(6, pet.getObservations());
            psPet.executeUpdate();

            conex.closeConnection();
            System.out.println("pet and owner inserted ¡congratulations! ");
        } catch (SQLException e) {
            //we show if there is any error
            System.out.println("error in the insert pet method: " + e.toString());
        }

    }

    @Override
    public void deletePet(Owner owner, Pet pet) {
        final String SQL_DELETE_PET = "DELETE FROM pet WHERE `pet`.`customer_number` = ?";
        final String SQL_DELETE_OWNER = "DELETE FROM owner WHERE `owner`.`idOwner` =  ? ";

        try {
            Connection c = conex.Connect();
            PreparedStatement pstDeletePet = c.prepareStatement(SQL_DELETE_PET);
            PreparedStatement pstDeleteOwner = c.prepareStatement(SQL_DELETE_OWNER);

            pstDeletePet.setInt(1, pet.getCustomer_number());
            pstDeleteOwner.setInt(1, owner.getId_Owner());

            pstDeleteOwner.executeUpdate();
            pstDeleteOwner.executeUpdate();

            conex.closeConnection();

            pstDeleteOwner.close();
            pstDeleteOwner.close();

        } catch (SQLException e) {
            System.out.println("error when deleting pet and owner: " + e.getMessage());
        }
    }
}
