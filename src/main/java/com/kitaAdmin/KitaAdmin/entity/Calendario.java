package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "calendario")
/**
 * Clase Calendario que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Calendario {
	
	@Column (name = "calendario_id")
	private int id;
  
	@Id
	@Column (name = "dia",unique=true, nullable = false)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dia;
	
	@Column (name = "evento")
	private String evento;

}
