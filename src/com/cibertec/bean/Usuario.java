package com.cibertec.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

	private String idUsuario;
	private String nombre;
	private String apellido;
	private String login;
	private String clave;
	private String dni;
	private String nombreCompleto;
	
	
	
	
	
	

	public String getIdUsuario() {
		return idUsuario;
	}







	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getApellido() {
		return apellido;
	}







	public void setApellido(String apellido) {
		this.apellido = apellido;
	}







	public String getLogin() {
		return login;
	}







	public void setLogin(String login) {
		this.login = login;
	}







	public String getClave() {
		return clave;
	}







	public void setClave(String clave) {
		this.clave = clave;
	}







	public String getDni() {
		return dni;
	}







	public void setDni(String dni) {
		this.dni = dni;
	}







	public String getNombreCompleto() {
		nombreCompleto = nombre.concat(" ").concat(apellido);
		return nombreCompleto;
	}

}
