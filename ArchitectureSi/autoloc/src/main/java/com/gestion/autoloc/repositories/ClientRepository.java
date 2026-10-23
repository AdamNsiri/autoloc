package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
