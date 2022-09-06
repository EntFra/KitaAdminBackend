package com.kitaAdmin.KitaAdmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Padres;

@Repository
public interface PadresDao extends JpaRepository<Padres,Integer>{
	Iterable<Padres> findAllByAlumnoId(int alumnoId);
}
