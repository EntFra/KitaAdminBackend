package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "padres")
/**
 * Clase Padres que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Padres {
	@Id
	@Column (name = "padres_id")
	private int padres_id;
	
	@Column (name = "nombre1")
	private String nombre1;
	
	@Column (name = "telefono1")
	private int telefono1;
	
	@Column (name = "email1")
	private String email1;
	
	@Column (name = "nombre2")
	private String nombre2;
	
	@Column (name = "telefono2")
	private int telefono2;
	
	@Column (name = "email2")
	private String email2;
	
	@Column (name = "alumno_id")
	private int alumno_id;
	
	@Column (name = "usuarios_id_pad")
	private String usuarios_id_pad;


	public int getPadres_id() {
		return padres_id;
	}

	public void setPadres_id(int padres_id) {
		this.padres_id = padres_id;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public int getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(int telefono1) {
		this.telefono1 = telefono1;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public int getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(int telefono2) {
		this.telefono2 = telefono2;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public int getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}

	public String getUsuarios_id_pad() {
		return usuarios_id_pad;
	}

	public void setUsuarios_id_pad(String usuarios_id_pad) {
		this.usuarios_id_pad = usuarios_id_pad;
	}
	
	public Padres(int padres_id, String nombre1, int telefono1, String email1, String nombre2, int telefono2,
			String email2, int alumno_id, String usuarios_id_pad) {
		super();
		this.padres_id = padres_id;
		this.nombre1 = nombre1;
		this.telefono1 = telefono1;
		this.email1 = email1;
		this.nombre2 = nombre2;
		this.telefono2 = telefono2;
		this.email2 = email2;
		this.alumno_id = alumno_id;
		this.usuarios_id_pad = usuarios_id_pad;
	}
	
	public Padres() {
		
	}

	@Override
	public String toString() {
		return "Padres [padres_id=" + padres_id + ", nombre1=" + nombre1 + ", telefono1=" + telefono1 + ", email1="
				+ email1 + ", nombre2=" + nombre2 + ", telefono2=" + telefono2 + ", email2=" + email2 + ", alumno_id="
				+ alumno_id + ", usuarios_id_pad=" + usuarios_id_pad + "]";
	}
	
	
	
}
