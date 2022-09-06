/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.controller;

import com.kitaAdmin.KitaAdmin.entity.Alumnos;
import com.kitaAdmin.KitaAdmin.entity.Grupos;
import com.kitaAdmin.KitaAdmin.entity.Informes;
import com.kitaAdmin.KitaAdmin.entity.Padres;
import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import com.kitaAdmin.KitaAdmin.service.AlumnosService;
import com.kitaAdmin.KitaAdmin.service.GruposService;
import com.kitaAdmin.KitaAdmin.service.InformesService;
import com.kitaAdmin.KitaAdmin.service.PadresService;
import com.kitaAdmin.KitaAdmin.service.ProfesoresService;
import com.kitaAdmin.KitaAdmin.service.UsuariosService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
    
    @GetMapping("/getUsuario/id")
    public Usuarios getUsuario(@RequestParam int usuarios_id){
    	return usuariosService.getById(usuarios_id);
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
        	
    @GetMapping("/getProfesores/grupo")
    public Iterable<Profesores> getProfesores(@RequestParam String grupo){     	
		return profesoresService.findAllByGrupo(grupo);    	
    }
    
    @PutMapping("/updateProfesor")
    public Profesores updateProfesor(@RequestBody Profesores profesor) {    	
		return profesoresService.save(profesor);
    	
    }
    
    @DeleteMapping("/deleteProfesor")
    public void deleteProfesor(@RequestBody Profesores profesor) {
    	profesoresService.deleteById(profesor.getDni());
    }
    
    @Autowired
    AlumnosService alumnosService;
    
    @GetMapping("/getAlumnos/grupo")
    public Iterable<Alumnos> getAlumnos(@RequestParam String grupo){     	
		return alumnosService.findAllByGrupo(grupo);    	
    }
    
    @DeleteMapping("/deleteAlumno")
    public void deleteAlumno(@RequestBody Alumnos alumno) {
    	alumnosService.deleteById(alumno.getAlumno_id());
    }

    @DeleteMapping("/deleteUsuarios/{id}")
    public void deleteUsuarios (@RequestParam int id){
    	usuariosService.deleteUsuarios(id);
    }
    
    @Autowired
    PadresService padresService;
    
    @GetMapping("/getPadres/alumnoId")
    public Iterable<Padres> getPadres(@RequestParam int alumnoId){
    	return padresService.findAllByAlumnoId(alumnoId);
    }
    
    @Autowired
    InformesService informesService;
    
    @PostMapping(path = "/getInformes/alumnoId")
    public Informes getInformes(@RequestParam(value="alumnoId") int alumnoId, @RequestParam(value="fecha") @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha ){
    	return informesService.findAllByAlumnoIdAndFecha(alumnoId, fecha);
    }
    
}
