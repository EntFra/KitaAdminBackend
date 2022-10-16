package com.kitaAdmin.KitaAdmin.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Informes;


@Repository
public interface InformesDao extends JpaRepository<Informes, Integer>{
	
	Informes findAllByAlumnoIdAndFecha(int alumnoId, Date fecha);
	
	
	Iterable <Informes> findAllByAlumnoId(int alumnoId);
}
