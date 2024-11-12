package com.viewnext.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.model.Reserva;
import com.viewnext.service.ReservaService;

@RestController	
public class ReservasController {
	@Autowired
	private ReservaService service;
	@PostMapping(value="reserva", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void registroReserva(@RequestBody Reserva reserva){
		service.realizarReservas(reserva);
    }
}
