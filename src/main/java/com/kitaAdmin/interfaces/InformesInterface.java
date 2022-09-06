package com.kitaAdmin.interfaces;

import java.util.Date;

import com.kitaAdmin.KitaAdmin.entity.Informes;

public interface InformesInterface {
	
	public Iterable<Informes> findAllByAlumnoId(int alumnoId);

	public Informes findAllByAlumnoIdAndFecha(int alumnoId, Date fecha); 

}
