package com.kitaAdmin.KitaAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kitaAdmin.KitaAdmin.dao.ProfesoresDao;
import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.interfaces.ProfesoresInterface;

@Service
public class ProfesoresService implements ProfesoresInterface {
	
	@Autowired
	private ProfesoresDao profesoresDao;
	//Recupera todos los profesores

	@Override
	@Transactional
	public Profesores update(Profesores profesor) {
		return profesoresDao.save(profesor);
	}
	@Transactional(readOnly = true)
	public Iterable<Profesores> findAllByGrupo(String grupo) {		
		return profesoresDao.findAllByGrupo(grupo);
	}
	@Override
	@Transactional(readOnly = true)
	public Iterable<Profesores> findAll() {
		return profesoresDao.findAll();
	}
	@Override
	@Transactional
	public Profesores save(Profesores profesor) {
		// TODO Auto-generated method stub
		return profesoresDao.save(profesor);
	}
	@Override
	public void deleteById(int id) {
		profesoresDao.deleteById(id);
		
	}



}
