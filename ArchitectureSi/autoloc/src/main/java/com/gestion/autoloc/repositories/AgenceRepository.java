package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
