package com.example.kadem.services;

import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Niveau;
import com.example.kadem.entities.Specialite;
import com.example.kadem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

   /* @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant e = etudiantRepository.findById(etudiantId).get();
        Departement d= departementRepository.findById(departementId).get();
        e.setDepartement(d);
        etudiantRepository.save(e);
    }*/

    /*@Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        Departement departement=departementRepository.findById(idDepartement).get();
        return departement.getEtudiants();
    }*/

    /*@Override
    public List<Etudiant> retrieveEtudiantsByContratSpecialite(Specialite specialite) {
        return etudiantRepository.retrieveEtudiantsByContratSpecialite(specialite);
    }*/

   /* @Override
    public List<Etudiant> findByEquipesNiveau(Niveau niveau) {
        return etudiantRepository.findByEquipesNiveau(niveau);
    }*/



}
