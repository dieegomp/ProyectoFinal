package com.viewnext.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.Reserva;

public interface ReservasRepository extends JpaRepository<Reserva, Integer> {
	List<Reserva> findByidHotel(int idHotel);
}
