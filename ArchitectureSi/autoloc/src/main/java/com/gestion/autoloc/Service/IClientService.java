package com.gestion.autoloc.Service;

import com.gestion.autoloc.entities.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    List<Client> consulterClients();
    Client consulterClientById(Long idClient);
    void supprimerClientById(Long idClient);
}
