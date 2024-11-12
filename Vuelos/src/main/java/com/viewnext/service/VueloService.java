package com.viewnext.service;

import java.util.List;

import com.viewnext.model.Vuelo;

public interface VueloService {
List<Vuelo> vuelosConPlazas(int asientos);
Vuelo reservarVuelo(int idVuelo,int numeroPlazas);
}
