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
public class Alumno {
    private int idAlumno;
    private int matricula;
    private String nombre;
    private String apePat;
    private String apeMat;
    private String direccion;
    private int edad;
    private String email;
    private ArrayList <Asignatura> asignaturas;
    private ArrayList <Criterio> criterios;
    private Grupo grupo;
    private Unidad unidad;

    public Unidad getUnidad() {
        return unidad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this. grupo = grupo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public ArrayList<Criterio> getCriterios() {
        return criterios;
    }

    public void setCriterios(Criterio criterio) {
        criterios.add(criterio);
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

    public Alumno(int idAlumno, int matricula, String nombre, String apePat, String apeMat, String direccion, int edad, String email, Grupo grupo) {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
        this.criterios = new ArrayList <Criterio> ();
        this.asignaturas = new ArrayList <Asignatura> ();
        this.grupo = grupo;
    }
    
    public Alumno(int idAlumno, int matricula, String nombre, String apePat, String apeMat, String direccion, int edad, String email, Grupo grupo, Unidad uniad) {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
        this.criterios = new ArrayList <Criterio> ();
        this.asignaturas = new ArrayList <Asignatura> ();
        this.grupo = grupo;
        this.unidad = unidad;
    }
}
