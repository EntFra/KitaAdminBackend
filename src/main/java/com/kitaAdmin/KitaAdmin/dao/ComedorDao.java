package com.kitaAdmin.KitaAdmin.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Comedor;

@Repository
public interface ComedorDao extends JpaRepository<Comedor, Integer>{
	
	Comedor findAllByFecha(Date fecha);

}
