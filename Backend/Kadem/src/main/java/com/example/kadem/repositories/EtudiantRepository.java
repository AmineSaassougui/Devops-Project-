package com.example.kadem.repositories;
import com.example.kadem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    


}