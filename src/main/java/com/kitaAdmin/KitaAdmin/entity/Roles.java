package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
/**
 * Clase Roles que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Roles {
	@Id
	@Column (name = "id")
	private int id;
	
	@Column (name = "rol")
	private String rol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Roles(int id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}
	
	public Roles() {
		
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", rol=" + rol + "]";
	}
	
	
	
}
