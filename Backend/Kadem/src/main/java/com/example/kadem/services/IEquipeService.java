package com.example.kadem.services;

import com.example.kadem.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe  addOrUpdateEquipe(Equipe  e);


    Equipe retrieveEquipe (Integer idEquipe);


}
