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
        return departementService.retrieveAllDepartements();
    }

    @GetMapping("/retrieve-departement/{departement-id}")
    @ResponseBody
    public Departement retrieveDepartement(@PathVariable("departement-id") Integer departementId) {
        return departementService.retrieveDepartement(departementId);
    }

    @PostMapping("/add-departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody Departement d) {

        return departementService.addOrUpdateDepartement(d);
    }

    @PutMapping("/update-departement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody Departement departement) {

        return departementService.addOrUpdateDepartement(departement);
    }

    @GetMapping("/retrieveDepartementsByUniversite/{idUniversite}")
    @ResponseBody
    public List<Departement> retrieveDepartementsByUniversite(@PathVariable("idUniversite") Integer idUniversite) {

        return departementService.retrieveDepartementsByUniversite(idUniversite);
    }


}
