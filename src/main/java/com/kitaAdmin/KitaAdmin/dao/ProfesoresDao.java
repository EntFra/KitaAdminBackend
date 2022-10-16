package com.kitaAdmin.KitaAdmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Profesores;

@Repository
public interface ProfesoresDao extends JpaRepository<Profesores,Integer> {

	Iterable<Profesores> findAllByGrupo(String grupo);	
	
	
}
