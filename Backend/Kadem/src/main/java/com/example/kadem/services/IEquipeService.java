package com.example.kadem.services;

import com.example.kadem.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe  addEquipe(Equipe  e);

    Equipe updateEquipe (Equipe  e);

    Equipe retrieveEquipe (Integer idEquipe);


}
