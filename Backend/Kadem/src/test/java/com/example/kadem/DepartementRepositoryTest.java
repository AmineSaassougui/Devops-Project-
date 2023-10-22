package com.example.kadem;


import com.example.kadem.repositories.DepartementRepository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


//@SpringBootTest
//@Slf4j
//@ExtendWith(SpringExtension.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DepartementRepositoryTest {

    /*@Autowired
    DepartementRepository departementRepository;*/

    //static Departement d = Departement.builder().nomDepart("informatique").etudiants(new ArrayList<>()).build();
/*
    @Test
    @Order(1)
    public void ajouterDepartement(){
        d = departementRepository.save(d);
        log.info("id :"+d.getIdDepartement());
        log.info("Ajout ==> " + d.toString());
        Assertions.assertNotNull(d.getIdDepartement());
        Assertions.assertNotEquals(0, d.getIdDepartement());
    }

    @Test
    @Order(2)
    public void modifierDepartement(){
        log.info("id :"+d.getIdDepartement());
        d.setNomDepart("mecatronique");
        d = departementRepository.save(d);
        log.info("Modif ==> " + d);
        Assertions.assertNotEquals("informatique", d.getNomDepart());
        Assertions.assertSame("mecatronique", d.getNomDepart());
    }

    @Test
    @Order(3)
    public void trouverDepartement(){
        List<Departement> departements = new ArrayList<>();
        departementRepository.findAll().forEach(departements::add);
        log.info("find all ==> " + departements.size());
        Assertions.assertTrue(departements.size()>0);
    }


    @Test
    @Order(4)
    public void chercherDepartement(){
        log.info("Chercher ==> " + d.getIdDepartement());
        Departement departement = departementRepository.findById(d.getIdDepartement()).get();
        Assertions.assertEquals(departement.getIdDepartement(),d.getIdDepartement());
    }

    @Test
    @Order(5)
    public void compter(){
        long t = departementRepository.count();
        log.info("Compter ==> " + t);
        Assertions.assertEquals(t, departementRepository.findAll().size());
    }
    @Test
    @Order(6)
    public void supprimerDepartement() {
        departementRepository.deleteById(d.getIdDepartement());
        Departement dep = departementRepository.findById(d.getIdDepartement()).orElse(null);
        Assertions.assertNull(dep);
        log.info("Supprimer");
    }*/




}
