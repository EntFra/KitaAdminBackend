/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitaAdmin.KitaAdmin.entity;
import javax.persistence.*;

@Entity
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
    

    public Usuarios() {

    }

    public Usuarios(int id, String nombre, String nombre_usuario, String contrasenia, String rol, int telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}
