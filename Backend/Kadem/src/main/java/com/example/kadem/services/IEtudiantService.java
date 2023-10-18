package com.example.kadem.services;

import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Niveau;
import com.example.kadem.entities.Specialite;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addOrUpdateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);


}
