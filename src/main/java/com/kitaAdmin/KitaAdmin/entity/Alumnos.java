package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
/**
 * Clase Alumnos que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Alumnos {
	@Id
	@Column (name = "alumno_id")
	private int alumno_id;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "alergias")
	private String alergias;
	
	@Column (name = "observaciones")
	private String observaciones;
	
	@Column (name = "auto_salidas")
	private boolean auto_salidas;
	
	@Column (name = "auto_fotos")
	private boolean auto_fotos;
	
	@Column (name = "fecha_nac")
	private Date fecha_nac;
	
	@Column (name = "nombre_grupo")
	private String nombre_grupo;

	public int getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isAuto_salidas() {
		return auto_salidas;
	}

	public void setAuto_salidas(boolean auto_salidas) {
		this.auto_salidas = auto_salidas;
	}

	public boolean isAuto_fotos() {
		return auto_fotos;
	}

	public void setAuto_fotos(boolean auto_fotos) {
		this.auto_fotos = auto_fotos;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getNombre_grupo() {
		return nombre_grupo;
	}

	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	public Alumnos(int alumno_id, String nombre, String alergias, String observaciones, boolean auto_salidas,
			boolean auto_fotos, Date fecha_nac, String nombre_grupo) {
		super();
		this.alumno_id = alumno_id;
		this.nombre = nombre;
		this.alergias = alergias;
		this.observaciones = observaciones;
		this.auto_salidas = auto_salidas;
		this.auto_fotos = auto_fotos;
		this.fecha_nac = fecha_nac;
		this.nombre_grupo = nombre_grupo;
	}
	
	public Alumnos() {
		
	}

	@Override
	public String toString() {
		return "Alumnos [alumno_id=" + alumno_id + ", nombre=" + nombre + ", alergias=" + alergias + ", observaciones="
				+ observaciones + ", auto_salidas=" + auto_salidas + ", auto_fotos=" + auto_fotos + ", fecha_nac="
				+ fecha_nac + ", nombre_grupo=" + nombre_grupo + "]";
	}
	
	
}
