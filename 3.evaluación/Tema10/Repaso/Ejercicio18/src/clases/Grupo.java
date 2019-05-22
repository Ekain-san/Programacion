/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Grupo {
   private int IdDoc;
   private String nombre;
   private String noIntegrantes;
   private Docente docente;
   private ArrayList <Asignatura> asignaturas;
  private ArrayList <Alumno> alumnos;

    public int getIdDoc() {
        return IdDoc;
    }

    public void setIdDoc(int IdDoc) {
        this.IdDoc = IdDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNoIntegrantes() {
        return noIntegrantes;
    }

    public void setNoIntegrantes(String noIntegrantes) {
        this.noIntegrantes = noIntegrantes;
    }  
    
    public Docente getDocente(){
        return docente;
    }
    
    public void setDocente(Docente docente){
        this.docente = docente;
    }
    
    public ArrayList <Asignatura> getAsignaturas(){
        return asignaturas;
    }
    
    public void setAsignaturas (Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    
    public ArrayList <Alumno> getAlumnos(){
        return alumnos;
    }
    
    public void setAlumnos (Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void altas(){
           
    }
    
    public void modificacion(){
            
    }
    
    public void bajas(){
            
    }

    public Grupo(int IdDoc, String nombre, String noIntegrantes, Docente docente) {
        this.IdDoc = IdDoc;
        this.nombre = nombre;
        this.noIntegrantes = noIntegrantes;
        this.docente = docente;
        this. asignaturas = new ArrayList <Asignatura>();
        this. alumnos = new ArrayList <Alumno>();
    }
}
