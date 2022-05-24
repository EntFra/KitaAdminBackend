package com.kitaAdmin.KitaAdmin.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kitaAdmin.KitaAdmin.dao.GruposDao;
import com.kitaAdmin.KitaAdmin.entity.Grupos;
import com.kitaAdmin.interfaces.GruposInterface;

@Service
public class GruposService implements GruposInterface{
	
	@Autowired
	private GruposDao gruposDao;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Grupos> findAll() {
		// TODO Auto-generated method stub
		return gruposDao.findAll();
	}


	@Override
	@Transactional
	public Grupos save(Grupos grupo) {
		// TODO Auto-generated method stub
		return gruposDao.save(grupo);
	}

	@Override
	@Transactional
	public Grupos edit(Grupos g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		
	}
	


}
