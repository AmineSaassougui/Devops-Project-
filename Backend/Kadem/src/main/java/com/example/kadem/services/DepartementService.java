package com.example.kadem.services;


import com.example.kadem.entities.Departement;
import com.example.kadem.repositories.DepartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartementService implements IDepartementService{
    @Autowired
    private final DepartementRepository departementRepository;

  //  @Autowired
   // UniversiteRepository universiteRepository;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        departementRepository.save(d);
        return d;
    }

    @Override
    public Departement updateDepartement(Departement d) {
        departementRepository.save(d);
        return d;
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).get();
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
    //    Universite universite = universiteRepository.findById(idUniversite).get();
        //    return universite.getDepartements();
        return null;
    }
}
