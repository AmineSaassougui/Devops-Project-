package com.example.kadem;

import com.example.kadem.entities.Departement;
import com.example.kadem.entities.Etudiant;
import com.example.kadem.repositories.DepartementRepository;
import com.example.kadem.services.DepartementService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class DepartementServiceTest {
    /*@Mock
    private DepartementRepository departementRepository;

    static Departement dep = Departement.builder().nomDepart("informatique").etudiants(new ArrayList<>()).build();

    @InjectMocks
    private DepartementService departementService;

    public void addDepartement(){
        Mockito.when(departementRepository.save(Mockito.any(Departement.class))).then(invocation -> {
            Departement dep = invocation.getArgument(0, Departement.class);
            dep.setIdDepartement(1);
            return dep;
        });
        log.info("Before : " + dep.toString());
        Departement depar = departementService.addDepartement(dep);
        Assertions.assertSame(depar , dep);
        log.info("After : " + dep.toString());
    }*/


}
