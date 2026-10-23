package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
