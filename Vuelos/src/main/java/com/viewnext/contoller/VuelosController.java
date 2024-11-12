package com.viewnext.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.model.Vuelo;
import com.viewnext.service.VueloService;

@RestController
public class VuelosController {
	@Autowired
	private VueloService vueloService;

	@GetMapping(value = "vuelo/{asientos}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelos(@PathVariable int asientos) {
		return vueloService.vuelosConPlazas(asientos);
	}

	@PutMapping(value = "vuelo/{idVuelo}/{numeroPlazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Vuelo reservaDeVuelos(@PathVariable int idVuelo, @PathVariable int numeroPlazas) {
		return vueloService.reservarVuelo(idVuelo, numeroPlazas);
	}

	@PutMapping(value = "vuelo/{idVuelo}/{numeroPlazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Vuelo vuelosClaseReserva(@PathVariable int idVuelo, @PathVariable int numeroPlazas) {
		return vueloService.reservarVuelo(idVuelo, numeroPlazas);

	}
}
 