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
    public Professeur find(String cin) {
        for(Professeur p:repository) {
            if(p.getCin().equals(cin))
                return p;
        }
        return null;
    }

    @Override
    public List<Professeur> findAll() {
        return this.repository;
    }

    @Override
    public int cout() {
        return this.repository.size();
    }

    @Override
    public boolean modify(Professeur p) {
        // Removing Old Professeur
        Professeur oldProf = find(p.getCin());
        repository.remove(oldProf);
        // Making Modifications
        oldProf.setNom(p.getNom());
        oldProf.setPrenom(p.getPrenom());
        oldProf.setEmail(p.getEmail());
        oldProf.setTelephone(p.getTelephone());
        oldProf.setDepartement(p.getDepartement());
        // Saving the new One
        repository.add(p);
        return true;
    }

}
