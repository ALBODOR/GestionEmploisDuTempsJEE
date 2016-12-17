package com.ensakh.projetlibre.persistence;

import com.ensakh.projetlibre.metier.Professeur;
import com.ensakh.projetlibre.persistence.dao.DAO;
import com.ensakh.projetlibre.persistence.dao.ProfesseurDAOImpl;
import com.ensakh.projetlibre.persistence.database.DatabaseConnection;
import com.ensakh.projetlibre.persistence.database.MySQLDatabaseConnection;
import java.util.List;
import javax.ejb.Stateless;

@Stateless// Comment it if you want to work with Local implementation
public class ProfesseursManagerDatabaseImpl implements ProfesseursManager {

    private DAO dao;

    public ProfesseursManagerDatabaseImpl() {
        DatabaseConnection dbConnection = new MySQLDatabaseConnection();
        dao = new ProfesseurDAOImpl(dbConnection.getConnection());
    }    
    
    @Override
    public boolean save(Professeur p) {
        return dao.save(p);
    }

    @Override
    public boolean modify(Professeur p) {
        return dao.modify(p);
    }

    @Override
    public void delete(String cin) {
        dao.delete(cin);
    }

    @Override
    public Professeur find(String cin) {
        return (Professeur) dao.find(cin);
    }

    @Override
    public List<Professeur> findAll() {
        return dao.findAll();
    }

    @Override
    public int count() {
        return dao.count();
    }

}
