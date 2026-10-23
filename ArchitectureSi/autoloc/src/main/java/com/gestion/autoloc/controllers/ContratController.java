package com.gestion.autoloc.controllers;
import com.gestion.autoloc.Service.IContratService;
import com.gestion.autoloc.entities.Contrat;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrats")
@AllArgsConstructor
public class ContratController {

    private final IContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @GetMapping
    public List<Contrat> getAll() {
        return contratService.consulterContrats();
    }

    @GetMapping("/getById/{idContrat}")
    public Contrat getContratById(@PathVariable Long idContrat) {
        return contratService.consulterContratById(idContrat);
    }

    @DeleteMapping("/{idContrat}")
    public void supprimerContrat(@PathVariable Long idContrat) {
        contratService.supprimerContratById(idContrat);
    }
}
