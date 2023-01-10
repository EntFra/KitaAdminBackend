package com.kitaAdmin.interfaces;

import java.util.Date;

import com.kitaAdmin.KitaAdmin.entity.Calendario;

public interface CalendarioInterface {
	
	Calendario findAllByDia(Date dia);

}
