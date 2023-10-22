package com.example.kadem;

import com.example.kadem.entities.Departement;
import com.example.kadem.repositories.DepartementRepository;
import com.example.kadem.services.DepartementService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class DepartementServiceTest {
    @Mock
    private DepartementRepository departementRepository;

    static Departement dep = Departement.builder().nomDepart("informatique").etudiants(new ArrayList<>()).build();

    @InjectMocks
    private DepartementService departementService;
    @Test
    public void addDepartement() {
        Mockito.lenient().when(departementRepository.save(Mockito.any(Departement.class))).then(invocation -> {
            Departement dep = invocation.getArgument(0, Departement.class);
            dep.setIdDepartement(1);
            log.info("TESTTTTT");
            return dep;
        });
        log.info("Before : " + dep.toString());
        Departement depar = departementService.addAndUpdateDepartement(dep);
        Assertions.assertSame(depar, dep);
        log.info("After : " + dep.toString());
    }

    @Test
    public void retrieveOneDepartementTest() {
        int departementId = 1;
        Departement expectedDepartement = new Departement();
        expectedDepartement.setIdDepartement(departementId);

        Mockito.when(departementRepository.findById(departementId)).thenReturn(Optional.of(expectedDepartement));
        Departement retrievedDepartement = departementService.retrieveDepartement(departementId);

        Assertions.assertNotNull(retrievedDepartement);
        Assertions.assertEquals(departementId, retrievedDepartement.getIdDepartement());

        Mockito.verify(departementRepository, Mockito.times(1)).findById(departementId);
    }

    @Test
    public void retrieveAllDepartementsTest() {
        List<Departement> expectedDepartements = new ArrayList<>();
        expectedDepartements.add(new Departement());
        expectedDepartements.add(new Departement());

        Mockito.when(departementRepository.findAll()).thenReturn(expectedDepartements);

        List<Departement> retrievedDepartements = departementService.retrieveAllDepartements();
        Assertions.assertNotNull(retrievedDepartements);
        Assertions.assertEquals(expectedDepartements.size(), retrievedDepartements.size());
        Mockito.verify(departementRepository, Mockito.times(1)).findAll();
    }

}
