package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informes")
/**
 * Clase Informes que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Informes {
	@Id
	@Column (name = "alumno_id")
	private int alumno_id;
	
	@Column (name = "deposicion")
	private boolean deposicion;
	
	@Column (name = "suenio")
	private int suenio;
	
	@Column (name = "comida")
	private boolean comida;
	
	@Column (name = "bebida")
	private boolean bebida;
	
	@Column (name = "fecha")
	private Date fecha;

	public int getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}

	public boolean isDeposicion() {
		return deposicion;
	}

	public void setDeposicion(boolean deposicion) {
		this.deposicion = deposicion;
	}

	public int getSuenio() {
		return suenio;
	}

	public void setSuenio(int suenio) {
		this.suenio = suenio;
	}

	public boolean isComida() {
		return comida;
	}

	public void setComida(boolean comida) {
		this.comida = comida;
	}

	public boolean isBebida() {
		return bebida;
	}

	public void setBebida(boolean bebida) {
		this.bebida = bebida;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Informes(int alumno_id, boolean deposicion, int suenio, boolean comida, boolean bebida, Date fecha) {
		super();
		this.alumno_id = alumno_id;
		this.deposicion = deposicion;
		this.suenio = suenio;
		this.comida = comida;
		this.bebida = bebida;
		this.fecha = fecha;
	}
	
	public Informes() {
		
	}

	@Override
	public String toString() {
		return "Informes [alumno_id=" + alumno_id + ", deposicion=" + deposicion + ", suenio=" + suenio + ", comida="
				+ comida + ", bebida=" + bebida + ", fecha=" + fecha + "]";
	}
	
	
	
}
