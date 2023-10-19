package com.example.kadem.controllers;

import com.example.kadem.entities.Departement;
import com.example.kadem.services.IDepartementService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departement")
@RequiredArgsConstructor
public class DepartementRestController {

    private final IDepartementService departementService;

    @GetMapping("/retrieve-all-departements")

     List<Departement> getDepartements() {
        return departementService.retrieveAllDepartements();
    }

    @GetMapping("/retrieve-departement/{departement-id}")

     Departement retrieveDepartement(@PathVariable("departement-id") Integer departementId) {
        return departementService.retrieveDepartement(departementId);
    }

    @PostMapping("/add-departement")

     Departement addDepartement(@RequestBody Departement d) {

        return departementService.addOrUpdateDepartement(d);
    }

    @PutMapping("/update-departement")

     Departement updateDepartement(@RequestBody Departement departement) {

        return departementService.addOrUpdateDepartement(departement);
    }



}
