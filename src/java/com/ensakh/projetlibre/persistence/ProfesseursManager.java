package com.ensakh.projetlibre.persistence;

import com.ensakh.projetlibre.metier.Professeur;
import java.util.List;

public interface ProfesseursManager {
    
    boolean save(Professeur p);
    
    boolean modify(Professeur p);
    
    void delete(String cin);
    
    Professeur find(String cin);
    
    List<Professeur> findAll();
    
    int count();
    
}
