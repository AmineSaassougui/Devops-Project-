package com.example.kadem.services;

import com.example.kadem.entities.Equipe;
import com.example.kadem.repositories.EquipeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EquipeService implements IEquipeService {

    private final EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Transactional
    public Equipe addOrUpdateEquipe(Equipe e) {

        return equipeRepository.save(e);
    }



    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return   equipeRepository.findById(idEquipe).orElse(new Equipe());
    }
}
