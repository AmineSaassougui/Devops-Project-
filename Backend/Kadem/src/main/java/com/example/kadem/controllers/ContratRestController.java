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



    @GetMapping("/retrieve-all-contrats")

    public List<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }


    @GetMapping("/retrieve-contrat/{contrat-id}")

    public Contrat retrieveContrat(@PathVariable("contrat-id") Integer contratId) {
        return contratService.retrieveContrat(contratId);
    }
}
