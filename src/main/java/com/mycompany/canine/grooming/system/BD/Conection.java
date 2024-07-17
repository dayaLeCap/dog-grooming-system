package com.mycompany.canine.grooming.system.BD;

import java.sql.*;

public class Conection {

    //builder
    private Conection() {

    }

    private static Connection connection;
    private static Conection instance;

    private static final String URL = "jdbc:mysql://localhost:3307/dog_grooming_registration";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    //method to connect to the database
    public Connection Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //aqui nos concetamos
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connect");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error connecting" + e.getMessage());
        }
        return connection;
    }

    //method to disconnect from the database
    public void closeConnection() throws SQLException {
        try {
            connection.close();
            System.out.println("disconnected");
        } catch (SQLException e) {
            System.out.println("error closing connection: " + e.getMessage());
            connection.close();
        } finally {
            connection.close();
        }
    }

    //method obtain the instance using the singleton pattern
    public static Conection getInstance() {
        if (instance == null) {
            instance = new Conection();
        }
        return instance;
    }
}
