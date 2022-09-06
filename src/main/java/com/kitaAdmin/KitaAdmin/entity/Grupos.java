package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "grupos")
/**
 * Clase Usuarios que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Grupos {
	@Id
	@Column (name = "nombre")
	private String nombre;

}
