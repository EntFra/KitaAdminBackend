/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.service;

import com.kitaAdmin.KitaAdmin.dao.UsuariosDao;
import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import com.kitaAdmin.interfaces.UsuariosInterface;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Clase que implementa la interface de "Service"
 *
 * @author ivanp
 */
@Service
public class UsuariosService implements UsuariosInterface {

    private final EntityManager entityManager;

    @Autowired
    public UsuariosService(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Autowired 
    private UsuariosDao usuariosDao;
    
    @Override
    public Usuarios getUsuario(Usuarios usuarioDetalles) {
        TypedQuery<Usuarios> typedQuery = entityManager.createQuery(
                "FROM Usuarios WHERE contrasenia = :contrasenia AND nombre_usuario = :nombre_usuario", Usuarios.class);
        try {
            Usuarios usuario = typedQuery.setParameter("contrasenia", usuarioDetalles.getContrasenia()).setParameter("nombre_usuario", usuarioDetalles.getNombre_usuario()).getSingleResult();
            return usuario;
        } catch (Exception e) {
            return null;
        }
    }

	@Override
	public Usuarios save(Usuarios usuario) {
		
		return usuariosDao.save(usuario);
	}
	
	@Override
	public void deleteUsuarios(int id) {
		usuariosDao.deleteById(id);
	}

	@Override
	public Usuarios getById(int id) {
		return usuariosDao.getById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuarios> findAll() {
		return usuariosDao.findAll();
	}
}
