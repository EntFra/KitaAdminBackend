package com.kitaAdmin.KitaAdmin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private int usuariosId;
	
	@Column (name = "alumno_id")
	private int alumnoId;
	
	@OneToOne( fetch = FetchType.LAZY)
	@MapsId
    @JoinColumn (name = "usuarios_id_pad" )
	private Usuarios usuario;
	
}
