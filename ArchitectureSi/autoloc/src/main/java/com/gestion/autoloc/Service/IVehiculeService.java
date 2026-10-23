package com.gestion.autoloc.Service;

import com.gestion.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    List<Vehicule> consulterVehicules();
    Vehicule consulterVehiculeById(Long idVehicule);
    void supprimerVehiculeById(Long idVehicule);
}
