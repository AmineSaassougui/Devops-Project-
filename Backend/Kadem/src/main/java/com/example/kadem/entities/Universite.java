package com.example.kadem.entities;

import com.example.kadem.dto.DepartementDto;
import com.example.kadem.dto.UniversiteDto;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniversite;
    private String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    //  @JsonIgnore
    private List<Departement> departements;
    public static Universite toEntity(UniversiteDto dto){
        return Universite.builder()
                .idUniversite(dto.getIdUniversite())
                .nomUniv(dto.getNomUniv())
                .build();
    }


}
