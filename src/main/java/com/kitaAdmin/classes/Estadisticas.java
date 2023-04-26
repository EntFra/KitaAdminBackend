package com.kitaAdmin.classes;

/**
 * Clase Estadisticas que contiene variables para almacenar el conteo estadistico de objetos de la base de datos
 * @author ivanp
 */

public class Estadisticas{


	
    private long numeroAlumnos;
    private long numeroPadres;
    private long numeroProfesores;
    private long numeroUsuarios;
    
    public long getNumeroAlumnos() {
        return numeroAlumnos;
    }
    public void setNumeroAlumnos(long numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }
    public long getNumeroPadres() {
        return numeroPadres;
    }
    public void setNumeroPadres(long numeroPadres) {
        this.numeroPadres = numeroPadres;
    }
    public long getNumeroProfesores() {
        return numeroProfesores;
    }
    public void setNumeroProfesores(long numeroProfesores) {
        this.numeroProfesores = numeroProfesores;
    }
    public long getNumeroUsuarios() {
        return numeroUsuarios;
    }
    public void setNumeroUsuarios(long numeroUsuarios) {
        this.numeroUsuarios = numeroUsuarios;
    }
}
