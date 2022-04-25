package com.kitaAdmin.KitaAdmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comedor")
/**
 * Clase Comedor que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Comedor {
	@Id
	@Column (name = "menu_id")
	private int menu_id;
	
	@Id
	@Column (name = "dia_id")
	private Date dia_id;
	
	@Column (name = "snack")
	private String snack;
	
	@Column (name = "desayuno")
	private String desayuno;
	
	@Column (name = "plato_principal")
	private String plato_principal;
	
	@Column (name = "postre")
	private String postre;
	
	@Column (name = "nombre_grupo")
	private String nombre_grupo;
	
	@Column (name = "comedorcol")
	private String comedorcol;

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public Date getDia_id() {
		return dia_id;
	}

	public void setDia_id(Date dia_id) {
		this.dia_id = dia_id;
	}

	public String getSnack() {
		return snack;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	public String getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	public String getPlato_principal() {
		return plato_principal;
	}

	public void setPlato_principal(String plato_principal) {
		this.plato_principal = plato_principal;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

	public String getNombre_grupo() {
		return nombre_grupo;
	}

	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	public String getComedorcol() {
		return comedorcol;
	}

	public void setComedorcol(String comedorcol) {
		this.comedorcol = comedorcol;
	}

	public Comedor(int menu_id, Date dia_id, String snack, String desayuno, String plato_principal, String postre,
			String nombre_grupo, String comedorcol) {
		super();
		this.menu_id = menu_id;
		this.dia_id = dia_id;
		this.snack = snack;
		this.desayuno = desayuno;
		this.plato_principal = plato_principal;
		this.postre = postre;
		this.nombre_grupo = nombre_grupo;
		this.comedorcol = comedorcol;
	}
	
	public Comedor() {
		
	}

	@Override
	public String toString() {
		return "Comedor [menu_id=" + menu_id + ", dia_id=" + dia_id + ", snack=" + snack + ", desayuno=" + desayuno
				+ ", plato_principal=" + plato_principal + ", postre=" + postre + ", nombre_grupo=" + nombre_grupo
				+ ", comedorcol=" + comedorcol + "]";
	}
	
	
}
