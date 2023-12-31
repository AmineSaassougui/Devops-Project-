package com.example.kadem.services;

import com.example.kadem.entities.Universite;
import com.example.kadem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteServiceImpl implements  IUniversiteService{

    private final UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }


    @Override
    public Universite addOrUpdateUniversite (Universite u) {

        return universiteRepository.save(u);
    }


    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(new Universite());



    }



}
