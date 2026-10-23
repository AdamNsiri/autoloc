package com.gestion.autoloc.entities;

import com.gestion.autoloc.entities.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private Role role;

    // Association 1 : Agence 1 --> N Employe
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
}
