package com.kitaAdmin.interfaces;

import java.util.Date;

import com.kitaAdmin.KitaAdmin.entity.Comedor;

public interface ComedorInterface {
	
	public Comedor findAllByFecha(Date fecha);
	
}
