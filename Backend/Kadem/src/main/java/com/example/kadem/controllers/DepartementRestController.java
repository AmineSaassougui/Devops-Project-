package com.example.kadem.controllers;

import com.example.kadem.entities.Departement;
import com.example.kadem.services.IDepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departement")
public class DepartementRestController {
    @Autowired
    IDepartementService departementService;

    @GetMapping("/retrieve-all-departements")

    public List<Departement> getDepartements() {
        return departementService.retrieveAllDepartements();
    }

    @GetMapping("/retrieve-departement/{departement-id}")

    public Departement retrieveDepartement(@PathVariable("departement-id") Integer departementId) {
        return departementService.retrieveDepartement(departementId);
    }

    @PostMapping("/add-departement")

    public Departement addDepartement(@RequestBody Departement d) {

        return departementService.addOrUpdateDepartement(d);
    }

    @PutMapping("/update-departement")

    public Departement updateDepartement(@RequestBody Departement departement) {

        return departementService.addOrUpdateDepartement(departement);
    }



}
