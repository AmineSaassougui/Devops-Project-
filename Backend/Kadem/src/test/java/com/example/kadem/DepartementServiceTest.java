package com.example.kadem;

import com.example.kadem.entities.Departement;
import com.example.kadem.repositories.DepartementRepository;
import com.example.kadem.services.DepartementService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@ExtendWith(MockitoExtension.class)
class DepartementServiceTest {
    @Mock
    private DepartementRepository departementRepository;

    Departement dep = Departement.builder().nomDepart("informatique").build();

    @InjectMocks
    private DepartementService departementService;
    @Test
    void addDepartement() {
        Mockito.when(departementRepository.save(Mockito.any(Departement.class))).then(inv -> {
            Departement m = inv.getArgument(0, Departement.class);
            m.setIdDepartement(1);
            return m;
        });
        log.info("Before : " + dep.getIdDepartement());
        Departement depar = departementService.addAndUpdateDepartement(dep);
        Assertions.assertSame(depar, dep);
        log.info("After : " + dep.getIdDepartement());
        Mockito.verify(departementRepository).save(dep);;
    }
    @Test
    void retrieveOneDepartementTest() {
        Mockito.when(departementRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(new Departement()));
        Departement retrievedDepartement = departementService.retrieveDepartement(1);
        Assertions.assertNotNull(retrievedDepartement);
        Mockito.verify(departementRepository).findById(Mockito.anyInt());
    }

    @Test
    void retrieveAllDepartementsTest() {
        List<Departement> deps = new ArrayList<>();
        deps.add(new Departement());
        deps.add(new Departement());
        Mockito.when(departementRepository.findAll()).thenReturn(deps);
        List<Departement> retrievedDepartements = departementService.retrieveAllDepartements();
        Assertions.assertNotNull(retrievedDepartements);
        Mockito.verify(departementRepository).findAll();
    }
/*
    @Test
    void supprimerDepartmentTest() {
        int id = 1;
        //Mockito.when(departementRepository.deleteById(Mockito.anyInt())).then();

        departementService.deleteDepartement(id);

    }*/


}
