package com.viewnext.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="reservas")
public class Reserva {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_reserva")
private int idReserva;
@Column(name="nombre_cliente")
private String nombreCliente;
private String dni;
@Column(name="id_vuelo")
private int idVuelo;
@Column(name="id_hotel")
private int idHotel;

public Reserva() {
	super();
}
public Reserva(int idReserva, String nombreCliente, String dni, int idVuelo, int idHotel) {
	super();
	this.idReserva = idReserva;
	this.nombreCliente = nombreCliente;
	this.dni = dni;
	this.idVuelo = idVuelo;
	this.idHotel = idHotel;
}
public int getIdReserva() {
	return idReserva;
}
public void setIdReserva(int idReserva) {
	this.idReserva = idReserva;
}
public String getNombreCliente() {
	return nombreCliente;
}
public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public int getIdVuelo() {
	return idVuelo;
}
public void setIdVuelo(int idVuelo) {
	this.idVuelo = idVuelo;
}
public int getIdHotel() {
	return idHotel;
}
public void setIdHotel(int idHotel) {
	this.idHotel = idHotel;
}


}
