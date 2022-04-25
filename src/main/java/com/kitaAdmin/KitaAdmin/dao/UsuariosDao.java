/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.dao;

import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import org.springframework.data.repository.CrudRepository;



/**Interface que ayuda con las interacciones con la base de datos
 *
 * @author ivanp
 */
public interface UsuariosDao extends CrudRepository<Usuarios,String> {
    
}
