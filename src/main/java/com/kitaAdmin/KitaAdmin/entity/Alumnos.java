package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "alumnos")
/**
 * Clase Alumnos que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Alumnos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column (name = "comedor")
	private boolean comedor;
	
	@Column (name = "fecha_nac")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date fecha_nac;
	
	@Column (name = "nombre_grupo")
	private String grupo;
	
	
	
}
