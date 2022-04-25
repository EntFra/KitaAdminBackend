package com.kitaAdmin.KitaAdmin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.ProfesoresDao;
import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.interfaces.ProfesoresInterface;

@Service
public class ProfesoresService implements ProfesoresInterface {
	
	@Autowired
	ProfesoresDao dao;
	
	@Override
	public List<Map<String, Object>> get() {
		return dao.get();		
	}

	@Override
	public List<Map<String, Object>> get(String nombreGrupo) {
		
		return dao.get(nombreGrupo);
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

	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		
	}
}
