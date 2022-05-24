package com.kitaAdmin.KitaAdmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitaAdmin.KitaAdmin.entity.Grupos;

@Repository
public interface GruposDao extends JpaRepository<Grupos, String> {

	
}
