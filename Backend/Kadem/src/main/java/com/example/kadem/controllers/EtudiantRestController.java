package com.example.kadem.controllers;

import com.example.kadem.dto.EtudiantDto;
import com.example.kadem.entities.Etudiant;
import com.example.kadem.services.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    private final IEtudiantService etudiantServices;

    @PostMapping("/add")
    EtudiantDto addEtudiant(@RequestBody EtudiantDto etudiant){
        return etudiantServices.addOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/update")
    EtudiantDto updateEtudiant(@RequestBody EtudiantDto etudiant){
        return etudiantServices.addOrUpdateEtudiant(etudiant);
    }

    @GetMapping("/get/{id}")
    EtudiantDto getEtudiant(@PathVariable("id") Integer id){
        return etudiantServices.retrieveEtudiant(id);
    }

    @GetMapping("/all")
    List<Etudiant> getAllEtudiant(){

        return etudiantServices.retrieveAllEtudiants();
    }

    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable("id") Integer id){
        etudiantServices.removeEtudiant(id);
    }


}
