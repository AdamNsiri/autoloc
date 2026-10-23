package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IReservationService;
import com.gestion.autoloc.entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping
    public Reservation ajouter(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping
    public Reservation modifier(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.consulterReservations();
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable Long id) {
        return reservationService.consulterReservationById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        reservationService.supprimerReservationById(id);
    }
}
