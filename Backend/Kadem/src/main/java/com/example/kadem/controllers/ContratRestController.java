package com.example.kadem.controllers;


import com.example.kadem.entities.Contrat;
import com.example.kadem.services.IContratService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    IContratService contratService;


    // http://localhost:8089/Kaddem/contrat/retrieve-all-contrats
    @GetMapping("/retrieve-all-contrats")
    @ResponseBody
    public List<Contrat> getContrats() {
        List<Contrat> listContrats = contratService.retrieveAllContrats();
        return listContrats;
    }

    // http://localhost:8089/Kaddem/contrat/retrieve-contrat/8
    @GetMapping("/retrieve-contrat/{contrat-id}")
    @ResponseBody
    public Contrat retrieveContrat(@PathVariable("contrat-id") Integer contratId) {
        return contratService.retrieveContrat(contratId);
    }
}
