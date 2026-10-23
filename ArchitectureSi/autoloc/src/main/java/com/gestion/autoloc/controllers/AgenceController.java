package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IAgenceService;
import com.gestion.autoloc.entities.Agence;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agences")
@AllArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping
    public Agence ajouter(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping
    public Agence modifier(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @GetMapping
    public List<Agence> getAll() {
        return agenceService.consulterAgences();
    }

    @GetMapping("/{id}")
    public Agence getById(@PathVariable Long id) {
        return agenceService.consulterAgenceById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        agenceService.supprimerAgenceById(id);
    }
}
