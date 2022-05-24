package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
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

}
