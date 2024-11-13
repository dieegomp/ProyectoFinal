package com.viewnext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.Vuelo;
import com.viewnext.repository.VuelosRepository;

@Service
public class VueloServiceImpl  implements VueloService{
	@Autowired
	VuelosRepository repo;

	@Override
	public List<Vuelo> vuelosConPlazas(int asientos) {

		return repo.findByPlazasLibresGreaterThanEqual(asientos);
	}

	@Override
	public Vuelo reservarVuelo(int idVuelo,int numeroPlazas) {
		Vuelo vuelo = repo.findById(idVuelo).orElse(null);
		vuelo.setPlazasLibres(vuelo.getPlazasLibres()-numeroPlazas);
		return repo.save(vuelo);
	}
}
