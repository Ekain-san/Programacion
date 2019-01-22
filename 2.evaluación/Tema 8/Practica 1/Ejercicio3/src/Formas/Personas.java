/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

/**
 *
 * @author Asus
 */
public class Personas 
{
private String dni;
    private String nombre;
    private String apellidos;
    private Cursos c;

    public Personas(String dni, String nombre, String apellidos,Cursos c) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        setC(c);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Cursos getC() {
        return c;
    }

    public void setC(Cursos c) {
        this.c = c;
        // bidireccionalidad
        this.c.setListaAlumnos(this);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
