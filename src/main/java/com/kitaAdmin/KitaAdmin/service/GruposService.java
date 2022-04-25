package com.kitaAdmin.KitaAdmin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.GruposDao;
import com.kitaAdmin.KitaAdmin.entity.Grupos;
import com.kitaAdmin.interfaces.GruposInterface;

@Service
public class GruposService implements GruposInterface{
	
	@Autowired
	GruposDao dao;
	
	@Override
	public List<Map<String, Object>> get() {
		return dao.get();
		
	}

	@Override
	public List<Map<String, Object>> get(String nombre) {
		// TODO Auto-generated method stub
		return dao.get(nombre);
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
