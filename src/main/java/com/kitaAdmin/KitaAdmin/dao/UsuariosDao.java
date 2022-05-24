/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.dao;

import com.kitaAdmin.KitaAdmin.entity.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**Interface que ayuda con las interacciones con la base de datos
 *
 * @author ivanp
 */
@Repository
public interface UsuariosDao extends JpaRepository<Usuarios,Integer> {
    
}
