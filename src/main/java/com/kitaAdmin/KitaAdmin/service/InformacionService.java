package com.kitaAdmin.KitaAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.InformacionDao;
import com.kitaAdmin.KitaAdmin.entity.Informacion;
import com.kitaAdmin.interfaces.InformacionInterface;

@Service
public class InformacionService implements InformacionInterface{
	
	@Autowired
	private InformacionDao informacionDao;

	@Override
	public Iterable<Informacion> findAll() {
		return informacionDao.findAll();
	}

	@Override
	public void deleteById(int id) {
		informacionDao.deleteById(id);
		
	}

	public Informacion update (Informacion informacion) {
		return informacionDao.save(informacion);
	}

	
}
