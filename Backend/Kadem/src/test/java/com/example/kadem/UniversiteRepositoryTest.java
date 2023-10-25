package com.example.kadem;

import com.example.kadem.entities.Departement;
import com.example.kadem.entities.Universite;
import com.example.kadem.repositories.UniversiteRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UniversiteRepositoryTest {
    /*
    @Autowired
    UniversiteRepository universiteRepository;
    static Universite u = Universite.builder().nomUniv("esprit").departements(new ArrayList<>()).build();

    @Test
    @Order(1)
    public void ajouterUniversite(){
        u = universiteRepository.save(u);
        log.info("id :"+u.getIdUniversite());
        log.info("Ajout ==> " + u.toString());
        Assertions.assertNotNull(u.getIdUniversite());
        Assertions.assertNotEquals(0, u.getIdUniversite());
    }

    @Test
    @Order(2)
    public void modifierUniversite(){
        log.info("id :"+u.getIdUniversite());
        u.setNomUniv("isrt");
        u = universiteRepository.save(u);
        log.info("Modif ==> " + u);
        Assertions.assertNotEquals("esprit", u.getNomUniv());
        Assertions.assertSame("iset", u.getNomUniv());
    }

    @Test
    @Order(3)
    public void trouverUniversite(){
        List<Universite> universites = new ArrayList<>();
        universiteRepository.findAll().forEach(universites::add);
        log.info("find all ==> " + universites.size());
        Assertions.assertTrue(universites.size()>0);
    }


    @Test
    @Order(4)
    public void chercheruniversites(){
        log.info("Chercher ==> " + u.getIdUniversite());
        Universite universite = universiteRepository.findById(u.getIdUniversite()).get();
        Assertions.assertEquals(universite.getIdUniversite(),universite.getIdUniversite());
    }

    @Test
    @Order(5)
    public void compter(){
        long t = universiteRepository.count();
        log.info("Compter ==> " + t);
        Assertions.assertEquals(t, universiteRepository.findAll().size());
    }

    @Test
    @Order(6)
    public void supprimerDepartement() {
        universiteRepository.deleteById(u.getIdUniversite());
        Universite universite1 = universiteRepository.findById(u.getIdUniversite()).orElse(null);
        Assertions.assertNull(universite1);
        log.info("Supprimer");
    }*/
}
