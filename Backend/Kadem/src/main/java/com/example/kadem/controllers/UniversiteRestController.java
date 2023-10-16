package com.example.kadem.controllers;


import com.example.kadem.entities.Universite;
import com.example.kadem.services.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/universite")

public class UniversiteRestController {
    @Autowired
    IUniversiteService universiteService;

    @GetMapping("/retrieve-all-universites")
    @ResponseBody
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    @GetMapping("/retrieve-universite/{universite-id}")
       @ResponseBody
    public Universite retrieveUniversite(@PathVariable("universite-id") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    // http://localhost:8089/Kaddem/universite/add-universite
    @PostMapping("/add-universite")
     @ResponseBody
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    // http://localhost:8089/Kaddem/universite/update-universite
    @PutMapping("/update-universite")
    @ResponseBody
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= universiteService.updateUniversite(u);
        return universite;
    }


}
