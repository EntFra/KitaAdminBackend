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
@Table(name = "padres")
/**
 * Clase Padres que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Padres {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
