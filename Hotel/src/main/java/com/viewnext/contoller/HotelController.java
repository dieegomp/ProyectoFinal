package com.viewnext.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.model.Hotel;
import com.viewnext.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService hotelService;

	@GetMapping(value = "hotel", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hoteles() {
		return hotelService.allHotel();
	}

	@GetMapping(value = "hotel/{nombre}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel hotelesPorNombre(@PathVariable String nombre) {
		return hotelService.hotelesPorNombre(nombre);
	}
	@GetMapping(value = "hotelReserva/{nombre}",produces = MediaType.APPLICATION_JSON_VALUE)
	public int hotelesReservas(@PathVariable String nombre) {
		return hotelService.findIdByNombre(nombre);
	}
}
