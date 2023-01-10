package com.kitaAdmin.KitaAdmin.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.CalendarioDao;
import com.kitaAdmin.KitaAdmin.entity.Calendario;
import com.kitaAdmin.KitaAdmin.entity.Comedor;
import com.kitaAdmin.interfaces.CalendarioInterface;

@Service
public class CalendarioService implements CalendarioInterface{
	
	@Autowired
	private CalendarioDao calendarioDao;
	
	@Override
	public Calendario findAllByDia(Date dia) {
		
		return calendarioDao.findAllByDia(dia);
	}
	
	@Transactional
	public Calendario update(Calendario calendario) {
	
		return calendarioDao.save(calendario);
	}

	@Transactional
	public void deleteByDia(Date dia) {
		calendarioDao.deleteByDia(dia);
		
	}



}
