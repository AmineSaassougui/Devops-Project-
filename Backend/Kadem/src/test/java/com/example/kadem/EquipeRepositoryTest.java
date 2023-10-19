package com.example.kadem;

import com.example.kadem.entities.Equipe;
import com.example.kadem.entities.Niveau;
import com.example.kadem.repositories.EquipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EquipeRepositoryTest {
    /*@Mock
    EquipeRepository equipeRepository;

    static Equipe e = Equipe.builder().nomEquipe("Equipe7").niveau(Niveau.EXPERT).build();
    List<Equipe> list = new ArrayList<Equipe>() ;*/



}
