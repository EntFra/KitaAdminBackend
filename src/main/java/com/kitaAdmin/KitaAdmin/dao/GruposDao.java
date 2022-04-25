package com.kitaAdmin.KitaAdmin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Grupos;
import com.kitaAdmin.interfaces.GruposInterface;

@Repository
public class GruposDao implements GruposInterface {
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> get() {
		List<Map<String, Object>> listaGrupos = template.queryForList("select * from grupos");
		return listaGrupos;
	}

	@Override
	public List<Map<String, Object>> get(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grupos add(Grupos g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grupos edit(Grupos g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
