package com.kitaAdmin.interfaces;

import com.kitaAdmin.KitaAdmin.entity.Profesores;

public interface ProfesoresInterface {
	public Iterable<Profesores> findAll();
	public Profesores save(Profesores profesor);
	public Profesores update(Profesores profesor);
	void deleteById(int id);
	Iterable<Profesores> findAllByGrupo(String grupo);
}
