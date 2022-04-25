package com.kitaAdmin.interfaces;

import java.util.List;
import java.util.Map;

import com.kitaAdmin.KitaAdmin.entity.Profesores;

public interface ProfesoresInterface {
	public List<Map<String, Object>>get();
	public List<Map<String, Object>>get(String nombreGrupo);
	public Profesores add(Profesores g);
	public Profesores edit(Profesores g);
	public void delete(String nombre);
}
