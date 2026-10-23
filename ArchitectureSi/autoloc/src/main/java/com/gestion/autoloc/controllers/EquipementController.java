package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IEquipementService;
import com.gestion.autoloc.entities.Equipement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipements")
@AllArgsConstructor
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping
    public Equipement ajouter(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @PutMapping
    public Equipement modifier(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @GetMapping
    public List<Equipement> getAll() {
        return equipementService.consulterEquipements();
    }

    @GetMapping("/{id}")
    public Equipement getById(@PathVariable Long id) {
        return equipementService.consulterEquipementById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        equipementService.supprimerEquipementById(id);
    }
}
