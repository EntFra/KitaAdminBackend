package com.kitaAdmin.KitaAdmin.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "comedor")
/**
 * Clase Comedor que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Comedor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "menu_id")
	private int menu_id;
	
	
	@Column (name = "fecha")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date fecha;
	
	@Column (name = "snack")
	private String snack;
	
	@Column (name = "desayuno")
	private String desayuno;
	
	@Column (name = "plato_principal")
	private String plato_principal;
	
	@Column (name = "postre")
	private String postre;

	
}
