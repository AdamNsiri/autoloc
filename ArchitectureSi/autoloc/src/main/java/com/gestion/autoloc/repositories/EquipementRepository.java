package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
