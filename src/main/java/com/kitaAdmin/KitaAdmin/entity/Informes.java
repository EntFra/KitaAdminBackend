package com.kitaAdmin.KitaAdmin.entity;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "informes")
/**
 * Clase Informes que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Informes {
	
	@Column (name = "alumno_id")
	private int alumnoId;
	
	@Column (name = "deposicion")
	private boolean deposicion;
	
	@Column (name = "suenio")
	@DateTimeFormat(pattern = "HH:mm")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="HH:mm")
	private Time suenio;
	
	@Column (name = "comida")
	private boolean comida;
	
	@Column (name = "bebida")
	private boolean bebida;
	
	@Id
	@Column (name = "fecha")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date fecha;
	
	@Column (name = "observaciones")
	private String observaciones;

}
