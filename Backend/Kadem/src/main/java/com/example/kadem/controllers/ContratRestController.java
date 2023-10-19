package com.example.kadem.controllers;


import com.example.kadem.entities.Contrat;
import com.example.kadem.services.IContratService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    private final IContratService contratService;



    @GetMapping("/retrieve-all-contrats")

     List<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }


    @GetMapping("/retrieve-contrat/{contrat-id}")

     Contrat retrieveContrat(@PathVariable("contrat-id") Integer contratId) {
        return contratService.retrieveContrat(contratId);
    }
}
