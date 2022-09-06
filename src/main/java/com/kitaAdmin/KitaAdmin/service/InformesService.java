package com.kitaAdmin.KitaAdmin.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.InformesDao;
import com.kitaAdmin.KitaAdmin.entity.Informes;
import com.kitaAdmin.interfaces.InformesInterface;

@Service
public class InformesService implements InformesInterface{

	@Autowired
	private InformesDao informesDao;

	@Override
	public Informes findAllByAlumnoIdAndFecha(int alumnoId, Date fecha) {
		
		return informesDao.findAllByAlumnoIdAndFecha(alumnoId, fecha);
	}

	@Override
	public Iterable<Informes> findAllByAlumnoId(int alumnoId) {
		
		return informesDao.findAllByAlumnoId(alumnoId);
	}
}
