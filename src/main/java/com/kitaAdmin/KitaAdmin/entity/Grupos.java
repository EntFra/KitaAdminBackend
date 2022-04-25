package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupos")
/**
 * Clase Usuarios que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Grupos {
	@Id
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "foto")
	private byte[] foto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Grupos(String nombre, byte[] foto) {
		super();
		this.nombre = nombre;
		this.foto = foto;
	}

    public Grupos() {
    	
    }
}
