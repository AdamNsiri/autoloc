package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
