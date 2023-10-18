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
    @ResponseBody
    public List<Departement> getDepartements() {
        List<Departement> listDepartements = departementService.retrieveAllDepartements();
        return listDepartements;
    }

    @GetMapping("/retrieve-departement/{departement-id}")
    @ResponseBody
    public Departement retrieveDepartement(@PathVariable("departement-id") Integer departementId) {
        return departementService.retrieveDepartement(departementId);
    }

    @PostMapping("/add-departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody Departement d) {
        departementService.addAndUpdateDepartement(d);
        return d;
    }

    @PutMapping("/update-departement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody Departement departement) {
        return departementService.addAndUpdateDepartement(departement);
    }




}
