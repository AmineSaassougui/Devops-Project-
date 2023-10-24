package com.example.kadem.controllers;


import com.example.kadem.entities.Universite;
import com.example.kadem.services.IUniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/universite")
@RequiredArgsConstructor
public class UniversiteRestController {

    private final IUniversiteService universiteService;

    @GetMapping("/retrieve-all-universites")
     List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve-universite/{universite-id}")
     Universite retrieveUniversite(@PathVariable("universite-id") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }


    @PostMapping("/add-universite")
     Universite addUniversite(@RequestBody Universite u) {
        return  universiteService.addOrUpdateUniversite(u);

    }


    @PutMapping("/update-universite")
     Universite updateUniversite(@RequestBody Universite u) {
        return universiteService.addOrUpdateUniversite(u);

    }


}
