package com.cibertec.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Opcion {

	private String idOpcion;
	private String nombre;
	private String ruta;
	private String estado;
	
	
	
	public String getIdOpcion() {
		return idOpcion;
	}
	public void setIdOpcion(String idOpcion) {
		this.idOpcion = idOpcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
