package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "informacion")
/**
 * Clase Informacion que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Informacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "informacion_id")
	private int informacion_id;
	
	
	@Column (name = "informacion")
	private String informacion;
	
	@Column (name = "nombre_grupo")
	private String nombre_grupo;

	
}
