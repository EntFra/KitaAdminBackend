/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.controller;

import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import com.kitaAdmin.KitaAdmin.service.GruposService;
import com.kitaAdmin.KitaAdmin.service.ProfesoresService;
import com.kitaAdmin.KitaAdmin.service.UsuariosService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador principal
 *
 * @author ivanp
 */

@RestController 
@RequestMapping
public class MainController {
    
    @Autowired
    UsuariosService usuariosService;
    
    @PostMapping ("/getUsuario")
    public Usuarios getUsuario (@RequestBody Usuarios usuario){
        return usuariosService.getUsuario(usuario);
    }
    
    @PutMapping ("/addUsuario")
    public Usuarios addUsuario (@RequestBody Usuarios usuario){
        return usuariosService.addUsuario(usuario);
    }

    
    @Autowired
    GruposService gruposService;
    
    @GetMapping("/getGrupos")
    public List<Map<String,Object>> getGrupos(){
    	return gruposService.get();
    }	
    @Autowired
    ProfesoresService profesoresService;
    	
    @GetMapping("/getProfesores")
    public List<Map<String,Object>> getProfesores(){     	
		return profesoresService.get();    	
    }

    
}
