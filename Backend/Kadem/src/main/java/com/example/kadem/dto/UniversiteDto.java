package com.example.kadem.dto;

import com.example.kadem.entities.Universite;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UniversiteDto {
    private Integer idUniversite;
    private String nomUniv;

    public static UniversiteDto toDto(Universite universite){
        return UniversiteDto.builder()
                .idUniversite(universite.getIdUniversite())
                .nomUniv(universite.getNomUniv())
                .build();
    }
}
