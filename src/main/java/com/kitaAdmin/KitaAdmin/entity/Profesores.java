package com.kitaAdmin.KitaAdmin.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Entity
@Data
@Table(name = "profesores")
/**
 * Clase Profesores que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Profesores {
	@Id
	@Column (name = "dni")
	private String dni;
		
	@Column (name = "fecha_alta")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date fecha_alta;
	
	@Column (name = "fecha_nac")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date fecha_nac;
	
	@Column (name = "direccion")
	private String direccion;
	
	@Column (name = "nombre_grupo")
	private String grupo;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "usuarios_id_prof", referencedColumnName = "usuarios_id")
	@Fetch(FetchMode.JOIN)
	private Usuarios usuario;
	
	

		
}
