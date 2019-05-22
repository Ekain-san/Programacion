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
public class Unidad {
    private int IdUnid;
    private String objetivo;
    private String criterio;
    private int valorUnidad;
    private Alumno alumno;
    private Asignatura asignatura;
    private ArrayList <Criterio> criterios;

    public int getIdUnid() {
        return IdUnid;
    }

    public void setIdUnid(int IdUnid) {
        this.IdUnid = IdUnid;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    public ArrayList <Criterio> getCriterios(){
        return criterios;
    }
    
    public void setCriterios (Criterio criterio){
        criterios.add(criterio);
    }

    public Unidad(int IdUnid, String objetivo, String criterio, int valorUnidad, Alumno alumno, Asignatura asignatura) {
        this.IdUnid = IdUnid;
        this.objetivo = objetivo;
        this.criterio = criterio;
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.valorUnidad = valorUnidad;
        this.criterios = new ArrayList<Criterio> ();
    }
    
}
