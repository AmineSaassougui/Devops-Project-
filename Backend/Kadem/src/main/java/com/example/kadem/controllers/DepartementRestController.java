package com.example.kadem.controllers;

import com.example.kadem.dto.DepartementDto;
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
    @ResponseBody
    public List<Departement> getDepartements() {
        return departementService.retrieveAllDepartements();
    }

    @GetMapping("/retrieve-departement/{departement-id}")
    @ResponseBody
    public Departement retrieveDepartement(@PathVariable("departement-id") Integer departementId) {
        return departementService.retrieveDepartement(departementId);
    }

    @PostMapping("/add-departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody DepartementDto d) {
        Departement dep = Departement.toEntity(d);
        return departementService.addAndUpdateDepartement(dep);
    }

    @PutMapping("/update-departement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody DepartementDto departement) {
        Departement dep = Departement.toEntity(departement);
        return departementService.addAndUpdateDepartement(dep);
    }




}
