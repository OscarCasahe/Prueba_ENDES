package iesalixar.server.model;

import java.io.Serializable;

public class UsuarioPOJO implements Serializable{

	private String nombre;

	public UsuarioPOJO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
