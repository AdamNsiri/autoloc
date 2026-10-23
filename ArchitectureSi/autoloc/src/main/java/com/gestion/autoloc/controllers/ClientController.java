package com.gestion.autoloc.controllers;

import com.gestion.autoloc.Service.IClientService;
import com.gestion.autoloc.entities.Client;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @PostMapping
    public Client ajouter(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping
    public Client modifier(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping
    public List<Client> getAll() {
        return clientService.consulterClients();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id) {
        return clientService.consulterClientById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        clientService.supprimerClientById(id);
    }
}
