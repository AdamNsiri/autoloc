package com.gestion.autoloc.repositories;

import com.gestion.autoloc.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
