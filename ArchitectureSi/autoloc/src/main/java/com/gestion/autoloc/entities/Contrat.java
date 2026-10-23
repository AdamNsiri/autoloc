package com.gestion.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    // Association 7 : Reservation 1 <--> 1 Contrat (Contrat porte la FK reservation_id)
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    // Association 8 : Contrat 1 --> N Paiement
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    private List<Paiement> paiements;
}
