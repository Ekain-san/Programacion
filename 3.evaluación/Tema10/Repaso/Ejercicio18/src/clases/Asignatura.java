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
public class Asignatura {
    private int idAsignatura;
    private String nombre;
    private int creditos;
    private String objetivo;
    private String unidad;
    private ArrayList <Unidad> unidades;
    private Grupo grupo;
    private Alumno alumno;

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getOpjetivo() {
        return objetivo;
    }

    public void setOpjetivo(String opjetivo) {
        this.objetivo = opjetivo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public Grupo getGrupo() {
        return grupo;
    }
    
    public void setGrupo(Grupo grupo){
        this.grupo=grupo;
    }
    
    public ArrayList <Unidad> getUnidades() {
        return unidades;
    }
    
    public void setUniades(Unidad unidad){
        unidades.add(unidad);
    }
    
    public Alumno getAlumno() {
        return alumno;
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    
    public void altas(){
           
    }
    
    public void modificacion(){
            
    }
    
    public void bajas(){
            
    }

    public Asignatura(int idAsignatura, String nombre, int creditos, String objetivo, String unidades, Grupo grupo, Alumno alumno) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.creditos = creditos;
        this.objetivo = objetivo;
        this.unidades = new ArrayList <Unidad> ();
        this.grupo = grupo;
        this.alumno = alumno;
    }
}
