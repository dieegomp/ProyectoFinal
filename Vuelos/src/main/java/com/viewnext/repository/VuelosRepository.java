package com.viewnext.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.Vuelo;

public interface VuelosRepository extends JpaRepository<Vuelo, Integer> {
    List<Vuelo> findByPlazasLibresGreaterThanEqual(int asientos);

}
