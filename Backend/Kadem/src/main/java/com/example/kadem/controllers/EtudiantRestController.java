package com.example.kadem.controllers;

import com.example.kadem.entities.Etudiant;
import com.example.kadem.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    private final IEtudiantService etudiantServices;

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantServices.addOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/update")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantServices.addOrUpdateEtudiant(etudiant);
    }

    @GetMapping("/get/{id}")
    Etudiant getEtudiant(@PathVariable("id") Integer id){

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
