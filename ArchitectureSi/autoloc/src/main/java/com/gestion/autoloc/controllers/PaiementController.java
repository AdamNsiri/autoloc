package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IPaiementService;
import com.gestion.autoloc.entities.Paiement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paiements")
@AllArgsConstructor
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping
    public Paiement ajouter(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @PutMapping
    public Paiement modifier(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.consulterPaiements();
    }

    @GetMapping("/{id}")
    public Paiement getById(@PathVariable Long id) {
        return paiementService.consulterPaiementById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        paiementService.supprimerPaiementById(id);
    }
}
