package com.viewnext.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hoteles")
public class Hotel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_hotel")
private int idHotel;
private String nombre;
private String categoria;
private int precio;
private boolean disponible;

public Hotel() {
	super();
}

public Hotel(int idHotel, String nombre, String categoria, int precio, boolean disponible) {
	super();
	this.idHotel = idHotel;
	this.nombre = nombre;
	this.categoria = categoria;
	this.precio = precio;
	this.disponible = disponible;
}

public int getIdHotel() {
	return idHotel;
}

public void setIdHotel(int idHotel) {
	this.idHotel = idHotel;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public boolean isDisponible() {
	return disponible;
}

public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}

@Override
public int hashCode() {
	return Objects.hash(idHotel);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if ((obj == null) || (getClass() != obj.getClass()))
		return false;
	Hotel other = (Hotel) obj;
	return idHotel == other.idHotel;
}


}
