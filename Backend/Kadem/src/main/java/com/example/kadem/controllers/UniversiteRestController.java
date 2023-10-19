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

    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve-universite/{universite-id}")

    public Universite retrieveUniversite(@PathVariable("universite-id") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }


    @PostMapping("/add-universite")

    public Universite addUniversite(@RequestBody Universite u) {
        return  universiteService.addOrUpdateUniversite(u);

    }


    @PutMapping("/update-universite")

    public Universite updateUniversite(@RequestBody Universite u) {
        return universiteService.addOrUpdateUniversite(u);

    }


}
