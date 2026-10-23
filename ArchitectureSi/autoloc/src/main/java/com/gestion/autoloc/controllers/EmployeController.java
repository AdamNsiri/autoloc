package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IEmployeService;
import com.gestion.autoloc.entities.Employe;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employes")
@AllArgsConstructor
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping
    public Employe ajouter(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping
    public Employe modifier(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @GetMapping
    public List<Employe> getAll() {
        return employeService.consulterEmployes();
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Long id) {
        return employeService.consulterEmployeById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        employeService.supprimerEmployeById(id);
    }
}
