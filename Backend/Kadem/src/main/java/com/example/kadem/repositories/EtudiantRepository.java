package com.example.kadem.repositories;

import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Niveau;
import com.example.kadem.entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

    List<Etudiant> findByDepartementIdDepartement(Integer idDepartement);





}