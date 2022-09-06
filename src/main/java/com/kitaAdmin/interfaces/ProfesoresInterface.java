package com.kitaAdmin.interfaces;

import com.kitaAdmin.KitaAdmin.entity.Profesores;

public interface ProfesoresInterface {
	public Iterable<Profesores> findAll();
	public Iterable<Profesores> findAllByGrupo(String grupo);
	public Profesores save(Profesores profesor);
	public void deleteById(String dni);
	public Profesores update(Profesores profesor);
}
