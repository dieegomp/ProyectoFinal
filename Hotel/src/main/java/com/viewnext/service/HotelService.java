package com.viewnext.service;

import java.util.List;

import com.viewnext.model.Hotel;

public interface HotelService {
List<Hotel> allHotel();
Hotel hotelesPorNombre(String nombre);
public int hotelesID(String nombre);
public Integer findIdByNombre(String nombre);
}
