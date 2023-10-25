package com.example.kadem;

import com.example.kadem.entities.Departement;
import com.example.kadem.entities.Universite;
import com.example.kadem.repositories.DepartementRepository;
import com.example.kadem.repositories.UniversiteRepository;
import com.example.kadem.services.DepartementService;
import com.example.kadem.services.UniversiteServiceImpl;
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
public class UniversiteServiceTest {
    @Mock
    private UniversiteRepository universiteRepository;

    Universite uni = Universite.builder().nomUniv("esprit").build();

    @InjectMocks
    private UniversiteServiceImpl universiteService;
    @Test
    void addUniversite() {
        Mockito.when(universiteRepository.save(Mockito.any(Universite.class))).then(inv -> {
            Universite m = inv.getArgument(0, Universite.class);
            m.setIdUniversite(1);
            return m;
        });
        log.info("Before : " + uni.getIdUniversite());
        Universite univ = universiteService.addOrUpdateUniversite(uni);
        Assertions.assertSame(univ, uni);
        log.info("After : " + uni.getIdUniversite());
        Mockito.verify(universiteRepository).save(uni);;
    }
    @Test
    void retrieveOneUniversiteTest() {
        Mockito.when(universiteRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(new Universite()));
        Universite retrievedUniversite = universiteService.retrieveUniversite(1);
        Assertions.assertNotNull(retrievedUniversite);
        Mockito.verify(universiteRepository).findById(Mockito.anyInt());
    }

    @Test
    void retrieveAllUniversiteTest() {
        List<Universite> deps = new ArrayList<>();
        deps.add(new Universite());
        deps.add(new Universite());
        Mockito.when(universiteRepository.findAll()).thenReturn(deps);
        List<Universite> retrievedUniversite = universiteService.retrieveAllUniversites();
        Assertions.assertNotNull(retrievedUniversite);
        Mockito.verify(universiteRepository).findAll();
    }

}
