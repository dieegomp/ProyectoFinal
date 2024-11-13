package com.viewnext.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelo {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_vuelo")
private int idvuelo;
@Column(name="empresa")
private String compañia;
@Column(name="fecha_vuelo")
private LocalDate fechaVuelo;
private int precio;
@Column(name="plazas_disponibles")
private int plazasLibres;

public Vuelo() {
	super();
}

public Vuelo(int idvuelo, String compañia, LocalDate fechaVuelo, int precio, int plazasLibres) {
	super();
	this.idvuelo = idvuelo;
	this.compañia = compañia;
	this.fechaVuelo = fechaVuelo;
	this.precio = precio;
	this.plazasLibres = plazasLibres;
}

public int getIdvuelo() {
	return idvuelo;
}

public void setIdvuelo(int idvuelo) {
	this.idvuelo = idvuelo;
}

public String getCompañia() {
	return compañia;
}

public void setCompañia(String compañia) {
	this.compañia = compañia;
}

public LocalDate getFechaVuelo() {
	return fechaVuelo;
}

public void setFechaVuelo(LocalDate fechaVuelo) {
	this.fechaVuelo = fechaVuelo;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public int getPlazasLibres() {
	return plazasLibres;
}

public void setPlazasLibres(int plazasLibres) {
	this.plazasLibres = plazasLibres;
}

@Override
public int hashCode() {
	return Objects.hash(idvuelo);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if ((obj == null) || (getClass() != obj.getClass()))
		return false;
	Vuelo other = (Vuelo) obj;
	return idvuelo == other.idvuelo;
}



}
