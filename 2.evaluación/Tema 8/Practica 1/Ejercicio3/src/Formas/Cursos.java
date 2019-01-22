/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Cursos {
private String curso;
    private ArrayList<Personas> listaAlumnos;

    public Cursos(String curso) {
        this.curso = curso;
        // La bidireccionalidad no es obligatoria
        this.listaAlumnos = new ArrayList();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public ArrayList<Personas> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(Personas al) {
        this.listaAlumnos.add(al);
    }
    
    public void borrarAlumno(Personas al){
        this.listaAlumnos.remove(al);
    }
    
}
