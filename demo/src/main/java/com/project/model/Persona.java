package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona  {
	
	@Id
	private int idpersona;
	
	@Column(name="nombre",length = 50)
	private String nombre;
	
	@Column(name="password",length = 50)
	private String password;

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
		
}
