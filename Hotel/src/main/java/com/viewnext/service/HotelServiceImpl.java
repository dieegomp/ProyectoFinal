package com.viewnext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.Hotel;
import com.viewnext.repository.HotelRepository;
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository repo;

	@Override
	public List<Hotel> allHotel() {
		return repo.findByDisponibleTrue();
	}

	@Override
	public Hotel hotelesPorNombre(String nombre) {
		return repo.findByNombre(nombre);
	}

}