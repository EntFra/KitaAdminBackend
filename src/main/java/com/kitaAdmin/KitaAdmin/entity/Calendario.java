package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calendario")
/**
 * Clase Calendario que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Calendario {
	@Id
	@Column (name = "dia_id")
	private Date dia_id;
	
	@Column (name = "evento")
	private String evento;

	public Date getDia_id() {
		return dia_id;
	}

	public void setDia_id(Date dia_id) {
		this.dia_id = dia_id;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Calendario(Date dia_id, String evento) {
		super();
		this.dia_id = dia_id;
		this.evento = evento;
	}
	
	public Calendario() {
		
	}

	@Override
	public String toString() {
		return "Calendario [dia_id=" + dia_id + ", evento=" + evento + "]";
	}
	
	

}
