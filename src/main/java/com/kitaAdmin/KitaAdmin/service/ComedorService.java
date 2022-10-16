package com.kitaAdmin.KitaAdmin.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitaAdmin.KitaAdmin.dao.ComedorDao;
import com.kitaAdmin.KitaAdmin.entity.Comedor;
import com.kitaAdmin.interfaces.ComedorInterface;

@Service
public class ComedorService implements ComedorInterface{
	
	@Autowired
	private ComedorDao comedorDao;

	@Override
	public Comedor findAllByFecha(Date fecha) {
		
		return comedorDao.findAllByFecha(fecha);
	}
	
	@Transactional
	public Comedor update(Comedor comedor) {
		// TODO Auto-generated method stub
		return comedorDao.save(comedor);
	}

}
