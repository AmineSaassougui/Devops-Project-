package com.example.kadem;


import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Option;
import com.example.kadem.repositories.EtudiantRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.List;

@ExtendWith(SpringExtension.class) //JUNIT5
@TestMethodOrder(OrderAnnotation.class) //Pour definir l'orde de l'execution des methodes
@SpringBootTest // Puisque classe de test
@Slf4j //Pour ecrire dans le console
 class EtudiantRepositoryTest {

    @Autowired
    EtudiantRepository etudiantRepository;

    static Etudiant etudiant = Etudiant.builder().nomE("Mohamed").prenomE("Mohamed").option(Option.SE).build(); // Cree le constructeur

    @Test
    @Order(1)
     void addEtudiant(){
        etudiant = etudiantRepository.save(etudiant);
        log.info("Ajout ==> "+etudiant.toString()); // Affectation du projet retourné dans etudiant
        Assertions.assertNotNull(etudiant.getIdEtudiant()); // Verifier le contenu de variable getId il faut que défferent de 0
        //Verifier que l'id n'est pas 0
        Assertions.assertNotEquals(0,etudiant.getIdEtudiant());
    }

   @Test
   @Order(2)
   void updateEtudiant(){
      etudiant.setNomE("Hassem");
      etudiant = etudiantRepository.save(etudiant); // id est stocké dans etudiant
      log.info("Modif ==> "+etudiant.toString());
      Assertions.assertEquals("Hassem",etudiant.getNomE()); //vérifier que le nom de l'étudiant a été modifié
      Assertions.assertNotEquals("Mohamed", etudiant.getNomE()); //vérifier que le nom n'est plus "Ahmed"
   }

    @Test
    @Order(3)
    void listEtudiants(){

        List<Etudiant> etudiants = etudiantRepository.findAll();
        for (Etudiant etud : etudiants){
            log.info("Lister ==> Nom : " + etud.getNomE() + ", Prénom : " + etud.getPrenomE());
        }
        Assertions.assertTrue(etudiants.size() >0);
        // Vérification que chaque élément de la liste n'est pas nul
        for (Etudiant etudiant : etudiants) {
            Assertions.assertNotNull(etudiant);
        }
    }

    @Test
    @Order(4)
    void chercherEtudiant() {
        Etudiant etud = etudiantRepository.findById(etudiant.getIdEtudiant()).orElse(null);
        log.info("Chercher ==> " + (etud != null ? etud.getIdEtudiant() : "Aucun étudiant trouvé"));

        // Comparaison des IDs
        Assertions.assertEquals(etudiant.getIdEtudiant(), etud.getIdEtudiant());
    }

    @Test
    @Order(5)
    void deleteEtudiant() {
        Etudiant etud = etudiantRepository.findById(etudiant.getIdEtudiant()).orElse(null);
        Assertions.assertNotNull(etud);
        etudiantRepository.delete(etud);
        // Tentative de recherche de l'étudiant après suppression
        Etudiant etudApresSuppression = etudiantRepository.findById(etudiant.getIdEtudiant()).orElse(null);
        // Vérification que l'étudiant n'existe plus
        Assertions.assertNull(etudApresSuppression);
    }




}
