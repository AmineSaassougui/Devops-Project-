package com.example.kadem.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idDepartement;

    private String nomDepart;

}
