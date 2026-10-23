package com.gestion.autoloc.entities;

import com.gestion.autoloc.entities.enums.CategorieVehicule;
import com.gestion.autoloc.entities.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    // Association 2 : Agence 1 --> N Vehicule
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    // Association 3 : Vehicule 1 --> N Maintenance
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private List<Maintenance> maintenances;

    // Association 4 : Vehicule N <--> N Equipement
    @ManyToMany
    @JoinTable(
        name = "vehicule_equipement",
        joinColumns = @JoinColumn(name = "vehicule_id"),
        inverseJoinColumns = @JoinColumn(name = "equipement_id")
    )
    private List<Equipement> equipements;

    // Association 5 : Vehicule 1 --> N Reservation
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
