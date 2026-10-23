package com.gestion.autoloc.entities;

import com.gestion.autoloc.entities.enums.StatutReservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    // Association 5 : Vehicule 1 --> N Reservation
    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    // Association 6 : Client 1 --> N Reservation
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Association 7 : Reservation 1 <--> 1 Contrat (côté propriétaire)
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
    private Contrat contrat;
}
