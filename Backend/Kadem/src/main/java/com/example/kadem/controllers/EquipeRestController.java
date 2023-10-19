package com.example.kadem.controllers;

import com.example.kadem.entities.Equipe;
import com.example.kadem.services.IEquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeRestController {
    IEquipeService equipeService;


    @GetMapping("/retrieve-all-equipes")
    @ResponseBody
    public List<Equipe> getEquipes() {
        return equipeService.retrieveAllEquipes();
    }



    @GetMapping("/retrieve-equipe/{equipe-id}")
    @ResponseBody
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }


    @PostMapping("/add-equipe")
    @ResponseBody
    public Equipe addEquipe(@RequestBody Equipe e) {

        return equipeService.addOrUpdateEquipe(e);
    }


    @PutMapping("/update-equipe")
    @ResponseBody
    public Equipe updateEtudiant(@RequestBody Equipe e) {

        return equipeService.addOrUpdateEquipe(e);
    }
}
