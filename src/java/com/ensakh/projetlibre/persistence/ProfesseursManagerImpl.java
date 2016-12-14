package com.ensakh.projetlibre.persistence;

import com.ensakh.projetlibre.metier.Departement;
import com.ensakh.projetlibre.metier.Professeur;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 * @author ALBODOR
 */
@Stateless
public class ProfesseursManagerImpl implements ProfesseursManager {
    
    List<Professeur> repository;

    public ProfesseursManagerImpl() {
        this.repository = new ArrayList<>();
        repository.add(new Professeur("AD16679", "MARCHICHE", "Fatima", 
                    "marchiche.fatima@gmail.com", "0678771859", Departement.GPEE));
        repository.add(new Professeur("AE1223", "ELKAHILI", "Nassima", 
                    "nsk1992@hotmail.com", "0650645342", Departement.GPEE));
    }

    @Override
    public boolean save(Professeur p) {
        return this.repository.add(p);
    }

    @Override
    public void delete(String cin) {
        Professeur prof = null;
        for(Professeur p:repository) {
            if(p.getCin().equals(cin)) {
                prof = p;
                break;
            }
        }
        if(prof != null) {
            repository.remove(prof);
            System.out.println("[ProfesseursManager] CIN="+cin+" deleted successfully!");
        }
    }

    @Override
    public Professeur find(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Professeur> findAll() {
        return this.repository;
    }

    @Override
    public int cout() {
        return this.repository.size();
    }

}
