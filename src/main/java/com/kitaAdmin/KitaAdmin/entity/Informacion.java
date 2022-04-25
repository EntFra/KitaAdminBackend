package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informacion")
/**
 * Clase Informacion que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Informacion {
	@Id
	@Column (name = "informacion_id")
	private int informacion_id;
	
	
	@Column (name = "informacion")
	private String informacion;
	
	@Column (name = "nombre_grupo")
	private String nombre_grupo;

	public int getInformacion_id() {
		return informacion_id;
	}

	public void setInformacion_id(int informacion_id) {
		this.informacion_id = informacion_id;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public String getNombre_grupo() {
		return nombre_grupo;
	}

	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	public Informacion(int informacion_id, String informacion, String nombre_grupo) {
		super();
		this.informacion_id = informacion_id;
		this.informacion = informacion;
		this.nombre_grupo = nombre_grupo;
	}
	
	public Informacion() {
		
	}

	@Override
	public String toString() {
		return "Informacion [informacion_id=" + informacion_id + ", informacion=" + informacion + ", nombre_grupo="
				+ nombre_grupo + "]";
	}
	
	
	
}
