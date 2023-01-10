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
    
    @PostMapping("/getUsuarios")
    public Iterable<Usuarios> getUsuarios(){     	
		return usuariosService.findAll();   
    }
		
    @PutMapping ("/addUsuario")
    public Usuarios addUsuario (@RequestBody Usuarios usuario){
        return usuariosService.save(usuario);
    }
    
    @DeleteMapping("/deleteUsuarios")
    public void deleteUsuarios (@RequestParam int id){
    	usuariosService.deleteUsuarios(id);
    }
    
    @PutMapping("/updateUsuarios")
    public Usuarios updateUsuarios(@RequestBody Usuarios usuario) {    	
		return usuariosService.update(usuario);
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
    
    @GetMapping("/getProfesoresAll")
    public Iterable<Profesores> getProfesoresAll  (){     	
		return profesoresService.findAll();    	
    }

    
    @PutMapping ("/addProfesor")
    public Profesores addProfesor (@RequestBody Profesores profesor){
        return profesoresService.save(profesor);
    }
    
    
    @PutMapping("/updateProfesor")
    public Profesores updateProfesor(@RequestBody Profesores profesor) {    	
		return profesoresService.update(profesor);
    }
       
    @Autowired
    AlumnosService alumnosService;
    
    @PutMapping ("/addAlumno")
    public Alumnos addAlumno (@RequestBody Alumnos alumno){
        return alumnosService.save(alumno);
    }
    
    @GetMapping("/getAlumnos/grupo")
    public Iterable<Alumnos> getAlumnos(@RequestParam String grupo){     	
		return alumnosService.findAllByGrupo(grupo);    	
    }
    
    @PostMapping("/getAlumnos")
    public Iterable<Alumnos> getAlumnosAll(){     	
		return alumnosService.findAll();    	
    }
    
    @PostMapping("/getAlumno/alumnoId")
    public Alumnos getAlumnoByAlumnoId(@RequestParam int alumnoId){
    	return alumnosService.findById(alumnoId);
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
    
    @PostMapping("/getPadres/alumnoId")
    public Iterable<Padres> getPadres(@RequestParam int alumnoId){
    	return padresService.findAllByAlumnoId(alumnoId);
    }
    
    @PostMapping("/getPadres/usuarioId")
    public Padres getPadresByUsuariosId(@RequestParam int usuariosIdPad){
    	return padresService.findByUsuariosId(usuariosIdPad);
    }
    
    @PutMapping("/updatePadres")
    public Padres updatePadres(@RequestBody Padres padre) {    	
		return padresService.update(padre);
    }
    
    @PutMapping ("/addPadres")
    public Padres addPadres (@RequestBody Padres padre){
        return padresService.save(padre);
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
    
    @DeleteMapping("/deleteComedor")
    public void deleteComedor(@RequestParam(value="dia") @DateTimeFormat(pattern="dd-MM-yyyy") Date dia) {
    	comedorService.deleteByFecha(dia);
    }
    
    @Autowired
    CalendarioService calendarioService;
    
    @PostMapping(path = "/getCalendario")
    public Calendario getCalendario(@RequestParam(value="dia") @DateTimeFormat(pattern="dd-MM-yyyy") Date dia) {
    	return calendarioService.findAllByDia(dia);
    }
    
    @PutMapping(path = "/updateCalendario")
    public Calendario updateCalendario(@RequestBody Calendario calendario) {
		return calendarioService.update(calendario);
    }
    
    @DeleteMapping("/deleteCalendario")
    public void deleteCalendario(@RequestParam(value="dia") @DateTimeFormat(pattern="dd-MM-yyyy") Date dia) {
    	calendarioService.deleteByDia(dia);
    }
    
    @Autowired
    InformacionService informacionService;
    
    @PostMapping("/getInformacion")
    public Iterable<Informacion> getInformacion(){
    	return informacionService.findAll();
    }
    
    @DeleteMapping("/deleteInformacion")
    public void deleteInformacion(@RequestParam(value="informacion_id")int informacion_id) {
    	informacionService.deleteById(informacion_id);
    }
    
    @PutMapping(path = "/updateInformacion")
    public Informacion updateInformacion(@RequestBody Informacion informacion) {
		return informacionService.update(informacion);
    }
}
