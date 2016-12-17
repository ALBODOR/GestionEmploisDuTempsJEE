package com.ensakh.projetlibre.persistence.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MySQLDatabaseConnection extends DatabaseConnection {

    @Override
    public Connection getConnection() {
        if(connection == null) {
            try {
                Context context  = new InitialContext();
                DataSource ds = (DataSource) context.lookup("java:/MySqlDS");
                connection = ds.getConnection();
            } catch (NamingException | SQLException ex) {
                System.err.println(ex);
            }
        }
        return connection;
    }
}