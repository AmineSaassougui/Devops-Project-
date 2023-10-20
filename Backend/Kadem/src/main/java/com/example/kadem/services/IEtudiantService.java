package com.example.kadem.services;

import com.example.kadem.dto.EtudiantDto;
import com.example.kadem.entities.Etudiant;


import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    EtudiantDto addOrUpdateEtudiant(EtudiantDto e);
    EtudiantDto retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);


}
