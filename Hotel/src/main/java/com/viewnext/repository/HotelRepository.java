package com.viewnext.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.viewnext.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	Hotel findByNombre(String nombre);
    List<Hotel> findByDisponibleTrue();
    @Query("SELECT h.idHotel FROM Hotel h WHERE h.nombre = :nombre")
    Integer findIdByNombre(@Param("nombre")String nombre);
}
