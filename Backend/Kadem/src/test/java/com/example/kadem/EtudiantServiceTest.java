package com.example.kadem;

import com.example.kadem.dto.EtudiantDto;
import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Option;
import com.example.kadem.repositories.EtudiantRepository;
import com.example.kadem.services.EtudiantServiceImpl;
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

@ExtendWith(MockitoExtension.class)
@Slf4j
 class EtudiantServiceTest {

    @Mock
    EtudiantRepository etudiantRepository;

    @InjectMocks
    EtudiantServiceImpl etudiantService;

     Etudiant etudiant = Etudiant.builder().prenomE("Mohamed").nomE("Mohamed").option(Option.SE).build();
    List<Etudiant> etudiants = new ArrayList<Etudiant>() {
        {
            add(Etudiant.builder().prenomE("Noura").nomE("Noura").option(Option.SE).build());
            add(Etudiant.builder().prenomE("Souha").nomE("Souha").option(Option.SE).build());
        }

    };

    @Test
    void addEtudiantTest() {
        //avec n'importe quel objet passé en paramètre -> retourner l'objet etudiant avec l'id 1
        Mockito.when(etudiantRepository.save(Mockito.any(Etudiant.class))).then(invocation -> {
            Etudiant model = invocation.getArgument(0, Etudiant.class);
            model.setIdEtudiant(1);
            return model;
        });

        log.info("Avant ==> " + etudiant.toString());
        EtudiantDto returnedEtudiant = etudiantService.addOrUpdateEtudiant(EtudiantDto.toDto(etudiant));
        Assertions.assertSame(1, returnedEtudiant.getIdEtudiant());

        log.info("Après ==> " + EtudiantDto.toDto(Etudiant.toEntity(returnedEtudiant)).toString());

    }

    @Test
    void retrieveEtudiantTest() {

        Mockito.when(etudiantRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(etudiant)); // n'importe quelle id passé en parametre
        EtudiantDto returnedEtudiant = etudiantService.retrieveEtudiant(2);

        Assertions.assertNotNull(returnedEtudiant);
        log.info("get ==> " + EtudiantDto.toDto(Etudiant.toEntity(returnedEtudiant)).toString());
    }

    @Test
    void retrieveAllEtudiantsTest(){
        Mockito.when(etudiantRepository.findAll()).thenReturn(etudiants);
        List<Etudiant> etudiantList = etudiantService.retrieveAllEtudiants();
        Assertions.assertNotNull(etudiantList);
        Assertions.assertTrue(etudiantList.size()>0);
        for (Etudiant etud : etudiantList){
            log.info(etud.toString());
        }
    }

    @Test
    void removeEtudiantTest() {
        etudiant.setIdEtudiant(5);
        Mockito.doNothing().when(etudiantRepository).deleteById(etudiant.getIdEtudiant());

        etudiantService.removeEtudiant(etudiant.getIdEtudiant());

        Assertions.assertFalse(etudiants.contains(etudiant));
        log.info("Suppression avec succès");
    }


}

