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
public class Docente {
    private int IdDoc;
    private String nombre;
    private String profesion;
    private int cedula;
    private String email;
    private ArrayList <Grupo> grupos;

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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo grupo) {
        grupos.add(grupo);
    }
    
    public void altas(){
           
    }
    
    public void modificacion(){
            
    }
    
    public void bajas(){
            
    }

    public Docente(int IdDoc, String nombre, String profesion, int cedula, String email) {
        this.IdDoc = IdDoc;
        this.nombre = nombre;
        this.profesion = profesion;
        this.cedula = cedula;
        this.email = email;
        this.grupos = new ArrayList <Grupo>();
    }
}
