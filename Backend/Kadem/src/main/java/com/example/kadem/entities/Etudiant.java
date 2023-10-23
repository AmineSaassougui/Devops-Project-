package com.example.kadem.entities;

import com.example.kadem.dto.EtudiantDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEtudiant;

    String prenomE;

    String nomE;

    @Enumerated(EnumType.STRING)
    Option option;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Equipe> equipes;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnore
    Departement departement;


    @OneToMany(mappedBy = "etudiant")

    @JsonIgnore
    private Set<Contrat> contrats;

    public static Etudiant toEntity(EtudiantDto dto){

            return Etudiant.builder()
                    .idEtudiant(dto.getIdEtudiant())
                    .prenomE(dto.getPrenomE())
                    .nomE(dto.getNomE())
                    .option(dto.getOption())
                    .build();
        }

}
