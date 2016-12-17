package com.ensakh.projetlibre.persistence.dao;

import com.ensakh.projetlibre.persistence.database.MySQLDatabaseConnection;
import junit.framework.Assert;
import org.junit.Test;

/**
 * @author ALBODOR
 */
public class MySQLDatabaseConnectionTest {

    @Test
    public void dbConnection() {
        MySQLDatabaseConnection dbConnection = new MySQLDatabaseConnection();
        Assert.assertNotNull(dbConnection);
    }
    
}
