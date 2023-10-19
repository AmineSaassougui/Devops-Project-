package com.example.kadem;

import com.example.kadem.entities.Equipe;
import com.example.kadem.entities.Niveau;
import com.example.kadem.repositories.EquipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EquipeTest {
   /* @Autowired
    EquipeRepository equipeRepository;

    static Equipe e=Equipe.builder().nomEquipe("Equipe7").niveau(Niveau.EXPERT).build();

    @Test
    @Order(0)
    public void testEquipeCreation() {
         e=equipeRepository.save(e);
         log.info("Ajout ==>", e);
        Assertions.assertNotNull(e.getIdEquipe());
        Assertions.assertNotEquals(0,e.getIdEquipe());
    }
    @Test
    @Order(1)
    public void testEquipeModification() {
        e.setNomEquipe("equipeKaddem");
        e=equipeRepository.save(e);
        log.info("Modif ==>",e.toString());
        Assertions.assertNotEquals("Equipe7",e.getNomEquipe());
        Assertions.assertSame("equipeKaddem",e.getNomEquipe());
    }
    @Test
    @Order(2)
    public void testEquipeListe() {
        List<Equipe> list =equipeRepository.findAll();
        log.info("Liste ==>",list.size());
        Assertions.assertTrue(list.size()>0);
    }
    @Test
    @Order(3)
    public void testEquipeChercher() {
        log.info("cherche equipe avec ID ==>",e.getIdEquipe());
        Equipe e1 = equipeRepository.findById(e.getIdEquipe()).get();
        Assertions.assertEquals(e1.getNomEquipe(),e.getNomEquipe());

    }
    @Test
    @Order(4)
    public void testEquipeSupprimer() {
        equipeRepository.delete(e);

    }*/

}
