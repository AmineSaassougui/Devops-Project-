package com.example.kadem.entities;

import com.example.kadem.dto.DepartementDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idDepartement;

    private String nomDepart;

    @OneToMany(mappedBy = "departement")
    @JsonIgnore
    private List<Etudiant> etudiants;

    public static Departement toEntity(DepartementDto dto){
        return Departement.builder()
                .idDepartement(dto.getIdDepartement())
                .nomDepart(dto.getNomDepart())
                .build();
    }
}