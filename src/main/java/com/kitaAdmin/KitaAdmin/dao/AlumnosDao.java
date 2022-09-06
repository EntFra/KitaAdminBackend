package com.kitaAdmin.KitaAdmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Alumnos;

@Repository
public interface AlumnosDao extends JpaRepository<Alumnos,Integer>{

	Iterable<Alumnos> findAllByGrupo(String grupo);
	
}
