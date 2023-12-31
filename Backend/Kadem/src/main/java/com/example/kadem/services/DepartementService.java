package com.example.kadem.services;


import com.example.kadem.entities.Departement;
import com.example.kadem.repositories.DepartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartementService implements IDepartementService{
    @Autowired
    private final DepartementRepository departementRepository;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addAndUpdateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).orElse(new Departement());
    }
    public void deleteDepartement(Integer idDepart){
        departementRepository.deleteById(idDepart);
    }







}
