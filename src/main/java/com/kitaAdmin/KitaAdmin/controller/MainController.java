/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.controller;

import com.kitaAdmin.KitaAdmin.entity.Alumnos;
import com.kitaAdmin.KitaAdmin.entity.Calendario;
import com.kitaAdmin.KitaAdmin.entity.Comedor;
import com.kitaAdmin.KitaAdmin.entity.Grupos;
import com.kitaAdmin.KitaAdmin.entity.Informacion;
import com.kitaAdmin.KitaAdmin.entity.Informes;
import com.kitaAdmin.KitaAdmin.entity.Padres;
import com.kitaAdmin.KitaAdmin.entity.Profesores;
import com.kitaAdmin.KitaAdmin.entity.Usuarios;
import com.kitaAdmin.KitaAdmin.service.AlumnosService;
import com.kitaAdmin.KitaAdmin.service.CalendarioService;
import com.kitaAdmin.KitaAdmin.service.ComedorService;
import com.kitaAdmin.KitaAdmin.service.GruposService;
import com.kitaAdmin.KitaAdmin.service.InformacionService;
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
    
    @PostMapping("/getUsuario/id")
    public Usuarios getUsuario(@RequestParam int usuarios_id){
    	return usuariosService.getById(usuarios_id);
    }
    
    @PutMapping ("/addUsuario")
    public Usuarios addUsuario (@RequestBody Usuarios usuario){
        return usuariosService.save(usuario);
    }
    
    @DeleteMapping("/deleteUsuarios")
    public void deleteUsuarios (@RequestParam int id){
    	usuariosService.deleteUsuarios(id);
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
		return profesoresService.update(profesor);
    }
       
    @Autowired
    AlumnosService alumnosService;
    
    @GetMapping("/getAlumnos/grupo")
    public Iterable<Alumnos> getAlumnos(@RequestParam String grupo){     	
		return alumnosService.findAllByGrupo(grupo);    	
    }
    
    @DeleteMapping("/deleteAlumno")
    public void deleteAlumno(@RequestParam int alumnoId) {
    	alumnosService.deleteById(alumnoId);
    }
    
    @PutMapping("/updateAlumno")
    public Alumnos updateAlumno(@RequestBody Alumnos alumno) {    	
		return alumnosService.update(alumno);
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
    
    @PutMapping(path = "/updateInformes")
    public Informes updateInformes(@RequestBody Informes informe) {
		return informesService.update(informe);
    }
    
    @Autowired
    ComedorService comedorService;
    
    @PostMapping(path = "/getComedor")
    public Comedor getComedor(@RequestParam(value="fecha") @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha ){
    	return comedorService.findAllByFecha(fecha);
    }
    
    @PutMapping(path = "/updateComedor")
    public Comedor updateComedor(@RequestBody Comedor comedor) {
		return comedorService.update(comedor);
    }
    
    @Autowired
    CalendarioService calendarioService;
    
    @PostMapping(path = "/getCalendario")
    public Calendario getCalendario(@RequestParam(value="fecha") @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha) {
    	return calendarioService.findAllByFecha(fecha);
    }
    
    @Autowired
    InformacionService informacionService;
    
    @PostMapping("/getInformacion")
    public Iterable<Informacion> getInformacion(){
    	return informacionService.findAll();
    }
    
}
