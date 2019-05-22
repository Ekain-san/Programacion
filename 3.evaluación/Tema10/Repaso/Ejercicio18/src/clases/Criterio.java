/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Asus
 */
public class Criterio {
    private int idCrit;
    private String descripcion;
    private String valor;
    private Alumno alumno;
    private Unidad unidad;

    public int getIdCrit() {
        return idCrit;
    }

    public void setIdCrit(int idCrit) {
        this.idCrit = idCrit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
    
    public void altas(){
           
    }
    
    public void modificacion(){
            
    }
    
    public void bajas(){
            
    }

    public Criterio(int idCrit, String descripcion, String valor, Alumno alumno, Unidad unidad) {
        this.idCrit = idCrit;
        this.descripcion = descripcion;
        this.valor = valor;
        this.alumno = alumno;
        this.unidad = unidad;
    }
}
