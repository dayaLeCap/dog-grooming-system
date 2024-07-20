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
    public void deletePet(Pet pet, Owner owner) {
        final String SQL_DELETE_PET = "DELETE FROM pet WHERE customer_number = ?";
        final String SQL_DELETE_OWNER = "DELETE FROM owner WHERE idOwner =  ? ";

        try {
            Connection c = conex.Connect();
            PreparedStatement pstDeletePet = c.prepareStatement(SQL_DELETE_PET);
            PreparedStatement pstDeleteOwner = c.prepareStatement(SQL_DELETE_OWNER);

            pstDeletePet.setInt(1, pet.getCustomer_number());
            pstDeletePet.executeUpdate();
            pstDeleteOwner.setInt(1, owner.getId_Owner());
            pstDeleteOwner.executeUpdate();

            conex.closeConnection();

            pstDeleteOwner.close();
            pstDeleteOwner.close();

        } catch (SQLException e) {
            System.out.println("error when deleting pet and owner: " + e.getMessage());
        }
    }

    @Override
    public void modifyPetAndOwner(Owner owner, Pet pet) {
        //sql query to insert the owner
        String SQL_OWNER = "UPDATE owner SET name = ?,cellOwner = ? WHERE idOwner = ?";

        //sql query to insert the pet
        String SQL_PET = "UPDATE pet "
                + "SET name = ?,"
                + "race = ?, "
                + "color = ?,"
                + "allergic = ?,"
                + "special_attention = ?,"
                + "observations = ?"
                + "WHERE id_owner = ?  ";

        try {
            Connection c = conex.Connect();
            PreparedStatement psOwner = c.prepareStatement(SQL_OWNER);

            PreparedStatement psPet = c.prepareStatement(SQL_PET);
            psOwner.setString(1, owner.getName());
            psOwner.setInt(2, owner.getCellOwner());
            psOwner.setInt(3, owner.getId_Owner());
            psOwner.executeUpdate();

            psPet.setString(1, pet.getName());
            psPet.setString(2, pet.getRace());
            psPet.setString(3, pet.getColor());
            psPet.setString(4, pet.getAllergic());
            psPet.setString(5, pet.getSpecial_attention());
            psPet.setString(6, pet.getObservations());
            psPet.setInt(7, pet.getCustomer_number());
            psPet.executeUpdate();

            psOwner.close();
            psPet.close();
            conex.closeConnection();

        } catch (SQLException e) {
            System.out.println("error when modifying: " + e.toString());
        }
    }

    @Override
    public Pet getPetInformation(int idPet) {
        Pet pet = null;

        final String SQL_PET = "SELECT * from pet WHERE customer_number = ? LIMIt 1";
        try {
            Connection c = conex.Connect();
            PreparedStatement psPet = c.prepareStatement(SQL_PET);
            psPet.setInt(1, idPet);
            ResultSet rsPet = psPet.executeQuery();

            while (rsPet.next()) {
                pet = new Pet(
                        rsPet.getInt("customer_number"),
                        rsPet.getString("name"),
                        rsPet.getString("race"),
                        rsPet.getString("color"),
                        rsPet.getString("allergic"),
                        rsPet.getString("special_attention"),
                        rsPet.getString("observations"));
            }
            psPet.close();
            rsPet.close();
            conex.closeConnection();
        } catch (SQLException e) {
            System.out.println("error when obtaining pet information: " + e.toString());
        }
        return pet;
    }

    @Override
    public Owner getOwnerInformation(int idOwner) {
        Owner owner = null;

        final String SQL_OWNER = "SELECT * FROM owner WHERE idOwner = ? LIMIT 1";
        try {
            Connection c = conex.Connect();
            PreparedStatement psOwner = c.prepareStatement(SQL_OWNER);
            psOwner.setInt(1, idOwner);
            ResultSet rsOwner = psOwner.executeQuery();

            while (rsOwner.next()) {
                owner = new Owner(
                        rsOwner.getInt("idOwner"),
                        rsOwner.getString("name"),
                        rsOwner.getInt("cellOwner"));
            }
            psOwner.close();
            rsOwner.close();
            conex.closeConnection();
        } catch (SQLException e) {
            System.out.println("error when obtaining information from the owner: " + e.toString());
        }
        return owner;
    }

}
