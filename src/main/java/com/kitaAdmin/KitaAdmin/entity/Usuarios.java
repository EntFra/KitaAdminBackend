/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "usuarios")
/**
 * Clase Usuarios que actuara como entidad durante la comunicacion con la base de datos
 * @author ivanp
 */
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarios_id")
    private int id;    

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombre_usuario")
    private String nombre_usuario;

    @Column(name = "contrasenia")
    private String contrasenia;
    
    @Column(name = "rol")
    private String rol;
   
    @Column(name = "telefono")
    private int telefono;
    
    @Column(name = "email")
    private String email;

}
