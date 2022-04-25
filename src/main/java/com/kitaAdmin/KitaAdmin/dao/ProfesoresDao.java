package com.kitaAdmin.KitaAdmin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.interfaces.ProfesoresInterface;

@Repository
public class ProfesoresDao implements ProfesoresInterface {
	
	@Autowired
	JdbcTemplate template;
	//Recupera todos los profesores
	@Override
	public List<Map<String, Object>> get() {
		List<Map<String, Object>> listaProfesores= template.queryForList("select * from profesores");
		return listaProfesores;
	}
	//Recupera todos los profesores de un grupo dado
	@Override
	public List<Map<String, Object>> get(String nombreGrupo) {
		List<Map<String, Object>> listaProfesoresPorGrupo= template.queryForList("select * from profesores where nombre_grupo = $nombreGrupo");
		return listaProfesoresPorGrupo;
	}


	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profesores add(Profesores g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesores edit(Profesores g) {
		// TODO Auto-generated method stub
		return null;
	}
}
