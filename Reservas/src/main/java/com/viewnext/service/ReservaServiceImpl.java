package com.viewnext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.viewnext.model.Reserva;
import com.viewnext.repository.ReservasRepository;

@Service
public class ReservaServiceImpl implements  ReservaService {
	@Autowired
	ReservasRepository repo;
	@Autowired
	RestTemplate template;
	private String url1 = "http://localhost:9000/hotelReserva";
	private String url2 = "http://localhost:8000/vueloReserva";
	@Override
	public void realizarReservas(Reserva reserva) {
		repo.save(reserva);
		template.put(url2+"/"+reserva.getIdVuelo()+"/"+reserva.getNumPersonaQueFormanReserva(), null);
	}

	@Override
	public List<Reserva> devolverReservas(String nombreHotel) {
		int idHotel = template.getForObject(url1+"/"+nombreHotel, Integer.class);
		return repo.findByidHotel(idHotel);
	}

}
