package com.example.kadem.services;

import com.example.kadem.entities.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat(Contrat ce);

    Contrat retrieveContrat(Integer idContrat);
}

