package com.example.kadem.services;
import com.example.kadem.dto.EtudiantDto;
import com.example.kadem.entities.Etudiant;
import com.example.kadem.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

    private final EtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public EtudiantDto addOrUpdateEtudiant(EtudiantDto e) {
        Etudiant etudiant = etudiantRepository.save(Etudiant.toEntity(e));
        return EtudiantDto.toDto(etudiant);
    }


    @Override
    public EtudiantDto retrieveEtudiant(Integer idEtudiant) {
        Optional<Etudiant> etud = etudiantRepository.findById(idEtudiant);
        return etud.map(EtudiantDto::toDto).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }


}
