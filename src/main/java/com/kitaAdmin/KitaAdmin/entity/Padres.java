package com.kitaAdmin.KitaAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column (name = "usuarios_id_pad")
	private int usuariosIdPad;
	
	@Column (name = "alumno_id")
	private int alumnoId;
	


}
