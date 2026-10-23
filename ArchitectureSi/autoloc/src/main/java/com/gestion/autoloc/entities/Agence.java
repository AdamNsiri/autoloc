package com.gestion.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    // Association 1 : Agence 1 --> N Employe
    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Employe> employes;

    // Association 2 : Agence 1 --> N Vehicule
    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Vehicule> vehicules;
}
