package com.viewnext.service;

import java.util.List;

import com.viewnext.model.Reserva;

public interface ReservaService {

void realizarReservas(Reserva reserva);
public List<Reserva> devolverReservas(String nombreHotel);

}
