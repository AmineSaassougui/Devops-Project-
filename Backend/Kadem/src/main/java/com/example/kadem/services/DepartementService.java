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

    private final DepartementRepository departementRepository;


    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addOrUpdateDepartement(Departement d) {
        
        return departementRepository.save(d);
    }


    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).orElse(new Departement());
    }


}
