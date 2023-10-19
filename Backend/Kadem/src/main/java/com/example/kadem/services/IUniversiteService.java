package com.example.kadem.services;

import com.example.kadem.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();

    Universite addOrUpdateUniversite (Universite  u);



    Universite retrieveUniversite (Integer idUniversite);



}
