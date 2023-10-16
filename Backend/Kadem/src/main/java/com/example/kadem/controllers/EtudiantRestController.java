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

    public final IEtudiantService etudiantServices;

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantServices.addEtudiant(etudiant);
    }

    @PutMapping("/update")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantServices.updateEtudiant(etudiant);
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

    /*@PutMapping("/asignEtudToDep/{idEtud}/{idDep}")
    public Etudiant asignEtudToDep(@PathVariable("idEtud") Integer idEtud, @PathVariable("idDep") Integer idDep){
        return etudiantServices.asignEtudToDep(idEtud,idDep);
    }*/

    /*@GetMapping("/getEtudiantsByDepartement/{idDepartement}")
    public List<Etudiant> getEtudiantsByDepartement(@PathVariable("idDepartement") Integer idDepartement){
        return etudiantServices.getEtudiantsByDepartement(idDepartement);
    }*/
}
