package com.example.kadem.dto;

import com.example.kadem.entities.Etudiant;
import com.example.kadem.entities.Option;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EtudiantDto {
    Integer idEtudiant;
    String prenomE;
    String nomE;
    Option option;

    public static EtudiantDto toDto(Etudiant etudiant){
            return EtudiantDto.builder()
                    .idEtudiant(etudiant.getIdEtudiant())
                    .prenomE(etudiant.getPrenomE())
                    .nomE(etudiant.getNomE())
                    .option(etudiant.getOption())
                    .build();

    }

}
