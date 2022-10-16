package com.kitaAdmin.KitaAdmin.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.CalendarioDao;
import com.kitaAdmin.KitaAdmin.entity.Calendario;
import com.kitaAdmin.interfaces.CalendarioInterface;

@Service
public class CalendarioService implements CalendarioInterface{
	
	@Autowired
	private CalendarioDao calendarioDao;
	
	@Override
	public Calendario findAllByFecha(Date fecha) {
		
		return calendarioDao.findAllByFecha(fecha);
	}

}
