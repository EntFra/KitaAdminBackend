package com.kitaAdmin.KitaAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kitaAdmin.KitaAdmin.dao.PadresDao;
import com.kitaAdmin.KitaAdmin.entity.Padres;
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

}
