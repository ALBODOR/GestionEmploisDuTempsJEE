package com.ensakh.projetlibre.persistence;

import com.ensakh.projetlibre.metier.Professeur;
import java.util.List;

public interface ProfesseursManager {
    
    boolean save(Professeur p);
    
    void delete(String cin);
    
    Professeur find(long id);
    
    List<Professeur> findAll();
    
    int cout();
    
}
