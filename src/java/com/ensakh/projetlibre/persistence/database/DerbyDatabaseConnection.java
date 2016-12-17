package com.ensakh.projetlibre.persistence.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DerbyDatabaseConnection extends DatabaseConnection {

    @Override
    public Connection getConnection() {
        if(connection == null) {
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                DriverManager.getConnection("jdbc:derby:db_emplois;user=albodor;password=albodor");
            } catch (ClassNotFoundException | SQLException ex) {
                System.err.println(ex);
            }
        }
        return connection;
    }

}
