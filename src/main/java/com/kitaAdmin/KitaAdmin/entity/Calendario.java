package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "calendario")
/**
 * Clase Calendario que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Calendario {
	@Id
	@Column (name = "dia_id")
	private Date fecha;
	
	@Column (name = "evento")
	private String evento;

}
