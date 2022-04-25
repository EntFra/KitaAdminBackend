/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.service;

import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import org.springframework.stereotype.Component;

/**
 * Crea  funciones abstractas como getUsuario o addUsuario
 * @author ivanp
 */

@Component
public interface UsuariosService {
    
    public Usuarios getUsuario(Usuarios usuario);
    
    public Usuarios addUsuario (Usuarios usuario);
    
}
