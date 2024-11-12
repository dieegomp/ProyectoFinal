package com.viewnext.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	Hotel findByNombre(String nombre);
    List<Hotel> findByDisponibleTrue();
}
