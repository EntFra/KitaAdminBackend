package com.kitaAdmin.KitaAdmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Informacion;

@Repository
public interface InformacionDao extends JpaRepository<Informacion, Integer>{

}
