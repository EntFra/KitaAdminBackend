package com.kitaAdmin.KitaAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kitaAdmin.KitaAdmin.dao.PadresDao;
import com.kitaAdmin.KitaAdmin.entity.Alumnos;
import com.kitaAdmin.KitaAdmin.entity.Padres;
import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import com.kitaAdmin.interfaces.PadresInterface;

@Service
public class PadresService implements PadresInterface{
	
	@Autowired
	private PadresDao padresDao;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Padres> findAllByAlumnoId(int alumnoId) {
		return padresDao.findAllByAlumnoId(alumnoId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Padres findByUsuariosId(int usuariosId) {
		return padresDao.findByUsuariosId(usuariosId);
	}
	
	@Override
	@Transactional
	public Padres update(Padres padre) {
		return padresDao.save(padre);
	}
	
		
	public Padres save(Padres padre) {
		return padresDao.save(padre);
	}
	

}
