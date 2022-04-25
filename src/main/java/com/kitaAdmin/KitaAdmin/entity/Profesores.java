package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
/**
 * Clase Profesores que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Profesores {
	@Id
	@Column (name = "dni")
	private String dni;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "telefono")
	private int telefono;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "fecha_alta")
	private Date fecha_alta;
	
	@Column (name = "fecha_nac")
	private Date fecha_nac;
	
	@Column (name = "direccion")
	private String direccion;
	
	@Column (name = "nombre_grupo")
	private String nombre_grupo;
	
	@Column (name = "usuarios_id_prof")
	private int usuarios_id_prof;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre_grupo() {
		return nombre_grupo;
	}

	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	public int getUsuarios_id_prof() {
		return usuarios_id_prof;
	}

	public void setUsuarios_id_prof(int usuarios_id_prof) {
		this.usuarios_id_prof = usuarios_id_prof;
	}

	public Profesores (String dni, String nombre, int telefono, String email, Date fecha_alta, Date fecha_nac,
			String direccion, String nombre_grupo, int usuarios_id_prof) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.fecha_alta = fecha_alta;
		this.fecha_nac = fecha_nac;
		this.direccion = direccion;
		this.nombre_grupo = nombre_grupo;
		this.usuarios_id_prof = usuarios_id_prof;
	}
	
	public Profesores () {
		
	}

	@Override
	public String toString() {
		return "Profesores [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email
				+ ", fecha_alta=" + fecha_alta + ", fecha_nac=" + fecha_nac + ", direccion=" + direccion
				+ ", nombre_grupo=" + nombre_grupo + ", usuarios_id_prof=" + usuarios_id_prof + "]";
	}
	
	
}
