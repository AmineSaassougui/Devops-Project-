package com.example.kadem.dto;


import com.example.kadem.entities.Departement;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartementDto {
    Integer idDepartement;

    private String nomDepart;

    public static DepartementDto toDto(Departement departement){
        return DepartementDto.builder()
                .idDepartement(departement.getIdDepartement())
                .nomDepart(departement.getNomDepart())
                .build();
    }
}
