package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
