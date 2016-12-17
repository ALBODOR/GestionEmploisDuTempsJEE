package com.ensakh.projetlibre.persistence.dao;

import com.ensakh.projetlibre.persistence.database.DerbyDatabaseConnection;
import junit.framework.Assert;
import org.junit.Test;

/**
 * @author ALBODOR
 */
public class DerbyDatabaseConnectionTest {

    @Test
    public void dbConnection() {
        DerbyDatabaseConnection dbConnection = new DerbyDatabaseConnection();
        Assert.assertNotNull(dbConnection);
    }
    
}
