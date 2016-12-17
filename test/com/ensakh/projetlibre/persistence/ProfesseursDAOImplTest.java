package com.ensakh.projetlibre.persistence;

import com.ensakh.projetlibre.persistence.dao.ProfesseurDAOImpl;
import com.ensakh.projetlibre.persistence.database.DatabaseConnection;
import com.ensakh.projetlibre.persistence.database.MySQLDatabaseConnection;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author ALBODOR
 */
public class ProfesseursDAOImplTest {

    @Test
    public void findAll() {
        DatabaseConnection connection = new MySQLDatabaseConnection();
        ProfesseurDAOImpl dao = new ProfesseurDAOImpl(connection.getConnection());
        List all = dao.findAll();
        TestCase.assertNotNull(all);
    }
    
}
