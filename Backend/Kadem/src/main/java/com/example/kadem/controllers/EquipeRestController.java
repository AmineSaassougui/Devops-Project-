package com.example.kadem.controllers;

import com.example.kadem.entities.Equipe;
import com.example.kadem.services.IEquipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/equipe")
public class EquipeRestController {
    private final IEquipeService equipeService;


    @GetMapping("/retrieve-all-equipes")

     List<Equipe> getEquipes() {
        return equipeService.retrieveAllEquipes();
    }



    @GetMapping("/retrieve-equipe/{equipe-id}")

     Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }


    @PostMapping("/add-equipe")

     Equipe addEquipe(@RequestBody Equipe e) {

        return equipeService.addOrUpdateEquipe(e);
    }


    @PutMapping("/update-equipe")

     Equipe updateEtudiant(@RequestBody Equipe e) {

        return equipeService.addOrUpdateEquipe(e);
    }
}
