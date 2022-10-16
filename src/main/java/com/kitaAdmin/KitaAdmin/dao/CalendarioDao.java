package com.kitaAdmin.KitaAdmin.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Calendario;

@Repository
public interface CalendarioDao extends JpaRepository<Calendario, Integer>{

	Calendario findAllByFecha(Date fecha);

}
