package com.ensakh.projetlibre.persistence.dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author ALBODOR
 * @param <T>
 */
public abstract class DAO<T> {
    
    protected Connection connection;

    // DB Connection Initialisation
    public DAO(Connection connection) {
        this.connection = connection;
    }
    
    // Methods to implement
    
    public abstract boolean save(Object o);
    
    public abstract Object find(Object id);
    
    public abstract List<T> findAll();
    
    public abstract boolean modify(Object o);
    
    public abstract boolean delete(Object o);
    
    public abstract int count();
    
}
