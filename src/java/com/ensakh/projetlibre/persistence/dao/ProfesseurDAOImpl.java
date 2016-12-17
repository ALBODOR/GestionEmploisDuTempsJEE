package com.ensakh.projetlibre.persistence.dao;

import com.ensakh.projetlibre.metier.Departement;
import com.ensakh.projetlibre.metier.Professeur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProfesseurDAOImpl extends DAO {

    public ProfesseurDAOImpl(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Object o) {
        // Variables Preparation
        boolean success = false;
        Professeur p = (Professeur) o;
        // Creating Query
        String sql = "INSERT INTO professeurs VALUES ("
                + "NULL, '"
                + p.getCin() + "', '"
                + p.getNom() + "', '"
                + p.getPrenom()+ "', '"
                + p.getEmail()+ "', '"
                + p.getTelephone()+ "', '"
                + p.getDepartement().toString()+ "')";
        // Preparing Statement
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.executeUpdate(); // Executing Query
            success = true;
        } catch (SQLException ex) {
            System.err.println(ex);
            success = false;
        }
        return success;
    }

    @Override
    public Object find(Object id) {       
        // Variables
        String cin = (String) id;
        Professeur p = null;
        // Businnes Logic
        String sql = "SELECT * FROM professeurs WHERE cin = '"+cin+"'";
        try {
            // Executing the Query
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            if(result.first()) {
                p = new Professeur(
                        result.getString(2), result.getString(3), 
                        result.getString(4), result.getString(5), 
                        result.getString(6), Departement.valueOf(result.getString(7)));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }        
        // Returning
        return p;
    }

    @Override
    public List<Professeur> findAll() {
        // Variables
        List list = new ArrayList<>();
        // Businnes Logic
        String sql = "SELECT * FROM professeurs";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery();
            
            while (results.next()) {                
                list.add(
                    new Professeur(
                        results.getString(2), results.getString(3), 
                        results.getString(4), results.getString(5), 
                        results.getString(6), 
                        Departement.valueOf(results.getString(7))));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        // Returning
        return list;
    }

    @Override
    public boolean modify(Object o) {
        // Variables
        Professeur oldProf = (Professeur) o;
        boolean result = false;
        // Businnes Logic
        String sql = "UPDATE professeurs SET "
                + "nom = '"+oldProf.getNom()+"', prenom = '"+oldProf.getPrenom()+"',"
                + " email = '"+oldProf.getEmail()+"', telephone = '"+oldProf.getTelephone()+"',"
                + " departement = '"+oldProf.getDepartement()+"' WHERE cin = '"+oldProf.getCin()+"'";
        try {
            // Executing the Query
            PreparedStatement statement = connection.prepareStatement(sql);
            int execution = statement.executeUpdate();
            if(execution == 1) 
                result = true;
        } catch (SQLException ex) {
            System.err.println(ex);
        }        
        // Returning
        return result;
    }

    @Override
    public boolean delete(Object o) {
        boolean result = false;
        String id = (String) o;
        // Businnes Logic
        String sql = "DELETE FROM professeurs WHERE cin = '"+id+"' ";
        try {
            // Executing the Query
            PreparedStatement statement = connection.prepareStatement(sql);
            int execution = statement.executeUpdate();
            if(execution == 1)
                result = true;
        } catch (SQLException ex) {
            System.err.println(ex);
        }        
        // Returning
        return result;
    }

    @Override
    public int count() {
        int total = 0;
        // Businnes Logic
        String sql = "SELECT COUNT(*) AS Total FROM professeurs";
        try {
            // Executing the Query
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            total = result.getInt(1);
        } catch (SQLException ex) {
            System.err.println(ex);
        }        
        // Returning
        return total;
    }

}
