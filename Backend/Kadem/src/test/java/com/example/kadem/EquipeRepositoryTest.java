package com.example.kadem;

import com.example.kadem.entities.Equipe;
import com.example.kadem.entities.Niveau;
import com.example.kadem.repositories.EquipeRepository;
import com.example.kadem.services.EquipeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EquipeRepositoryTest {
    @Mock
    EquipeRepository equipeRepository;
    @InjectMocks
    private EquipeService equipeService;
    static Equipe equipe = Equipe.builder().nomEquipe("equipe 7").niveau(Niveau.EXPERT).etudiants(new ArrayList<>()).build();
    @Test
    public void addEquipe() {
        Mockito.lenient().when(equipeRepository.save(Mockito.any(Equipe.class))).then(invocation -> {
            Equipe equipe = invocation.getArgument(0, Equipe.class);
            equipe.setIdEquipe(1);
            log.info("TEST");
            return equipe;
        });
        log.info("Before : " + equipe.toString());
        Equipe equipe2 = equipeService.addEquipe(equipe);
        Assertions.assertSame(equipe2, equipe);
        log.info("After : " + equipe.toString());
    }
}
