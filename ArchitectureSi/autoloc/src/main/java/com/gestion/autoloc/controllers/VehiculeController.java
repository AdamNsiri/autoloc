package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IVehiculeService;
import com.gestion.autoloc.entities.Vehicule;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule ajouter(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping
    public Vehicule modifier(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @GetMapping
    public List<Vehicule> getAll() {
        return vehiculeService.consulterVehicules();
    }

    @GetMapping("/{id}")
    public Vehicule getById(@PathVariable Long id) {
        return vehiculeService.consulterVehiculeById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        vehiculeService.supprimerVehiculeById(id);
    }
}
