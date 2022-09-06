package com.kitaAdmin.interfaces;

import com.kitaAdmin.KitaAdmin.entity.Alumnos;

public interface AlumnosInterface {
	public Iterable<Alumnos> findAll();
	public Iterable<Alumnos> findAllByGrupo(String grupo);
	public Alumnos save(Alumnos alumnos);
	public Alumnos update(Alumnos alumnos);
	void deleteById(int alumnoId);
}
