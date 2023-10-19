package com.example.kadem.services;
import com.example.kadem.entities.Contrat;
import com.example.kadem.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;


    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        contratRepository.save(ce);
        return ce;
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepository.findById(idContrat).orElse(new Contrat());
    }
}
