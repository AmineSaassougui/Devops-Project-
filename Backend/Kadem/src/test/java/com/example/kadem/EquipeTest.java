package com.example.kadem;

import com.example.kadem.entities.Equipe;
import com.example.kadem.entities.Niveau;
import com.example.kadem.repositories.EquipeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EquipeTest {
    @Autowired
    EquipeRepository equipeRepository;
    @Test
    public void testEquipeCreation() {
        Equipe equipe = new Equipe(1, "Equipe7", Niveau.EXPERT,null);

        assertEquals(1, equipe.getIdEquipe());
        assertEquals("Equipe7", equipe.getNomEquipe());
        assertEquals(Niveau.EXPERT, equipe.getNiveau());

    }
    @Test
    public void testAjouterEquipe() {
        Equipe equipe = new Equipe();
        equipe.setNomEquipe("equipe7");
        Equipe savedEquipe = equipeRepository.save(equipe);
        Optional<Equipe> retrievedequipe = equipeRepository.findById(savedEquipe.getIdEquipe());
        assertEquals("equipe7", retrievedequipe.get().getNomEquipe());
    }
}
