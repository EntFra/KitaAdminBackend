package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "roles")
/**
 * Clase Roles que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Roles {
	@Id
	@Column (name = "id")
	private int id;
	
	@Column (name = "rol")
	private String rol;

	
}
