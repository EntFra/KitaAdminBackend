/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.controller;

import com.kitaAdmin.KitaAdmin.entity.Grupos;
import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import com.kitaAdmin.KitaAdmin.service.GruposService;
import com.kitaAdmin.KitaAdmin.service.ProfesoresService;
import com.kitaAdmin.interfaces.UsuariosInterface;
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
    UsuariosInterface usuariosService;
    
    @PostMapping ("/getUsuario")
    public Usuarios getUsuario (@RequestBody Usuarios usuario){
        return usuariosService.getUsuario(usuario);
    }
    
    @PutMapping ("/addUsuario")
    public Usuarios addUsuario (@RequestBody Usuarios usuario){
        return usuariosService.save(usuario);
    }

    
    @Autowired
    GruposService gruposService;
    
    @GetMapping("/getGrupos")
    public Iterable<Grupos> getGrupos(){
    	return gruposService.findAll();
    }	
    @Autowired
    ProfesoresService profesoresService;
    	
    @PostMapping("/getProfesores/grupo")
    public Iterable<Profesores> getProfesores(@RequestParam String grupo){     	
		return profesoresService.findAllByGrupo(grupo);    	
    }

    //Pruebas
    @GetMapping("/getProfes")
    public Iterable<Profesores> getProfes(){
    	return profesoresService.findAll();
    }	
    
}
