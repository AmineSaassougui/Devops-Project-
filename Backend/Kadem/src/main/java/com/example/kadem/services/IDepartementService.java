package com.example.kadem.services;

import com.example.kadem.entities.Departement;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addOrUpdateDepartement(Departement d);

    Departement retrieveDepartement(Integer idDepart);
}
