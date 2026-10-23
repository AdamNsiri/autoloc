package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IMaintenanceService;
import com.gestion.autoloc.entities.Maintenance;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenances")
@AllArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping
    public Maintenance ajouter(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping
    public Maintenance modifier(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @GetMapping
    public List<Maintenance> getAll() {
        return maintenanceService.consulterMaintenances();
    }

    @GetMapping("/{id}")
    public Maintenance getById(@PathVariable Long id) {
        return maintenanceService.consulterMaintenanceById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        maintenanceService.supprimerMaintenanceById(id);
    }
}
