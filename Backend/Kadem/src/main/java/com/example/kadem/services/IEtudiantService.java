package com.example.kadem.services;

import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Niveau;
import com.example.kadem.entities.Specialite;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);

    //public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId);
    //public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement);


}
