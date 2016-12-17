package com.ensakh.projetlibre.persistence.database;

import java.sql.Connection;

/**
 * @author ALBODOR
 */
public abstract class DatabaseConnection {

    protected Connection connection = null;
    
    public abstract Connection getConnection();
}
