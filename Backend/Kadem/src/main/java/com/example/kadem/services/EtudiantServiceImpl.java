package com.example.kadem.services;
import com.example.kadem.dto.EtudiantDto;
import com.example.kadem.entities.Etudiant;
import com.example.kadem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

    private final EtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public EtudiantDto addOrUpdateEtudiant(EtudiantDto e) {

        return EtudiantDto.toDto(etudiantRepository.save(Etudiant.toEntity(e)));
    }


    @Override
    public EtudiantDto retrieveEtudiant(Integer idEtudiant) {
        Optional<Etudiant> etud = this.etudiantRepository.findById(idEtudiant);
        if (etud.isPresent()){
            return EtudiantDto.toDto(etud.get());
        }
        else
            return null;
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }


}
