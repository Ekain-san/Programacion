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
public class Pelicula
{
    private String nombre;
    private char[] año;
    private float duracion;
    private String tipo;
    private ArrayList<Estudio> Lista_de_estudios;

    public Pelicula(String nombre, char[] año, float duracion, String tipo, ArrayList<Estudio> Lista_de_estudios) {
        this.nombre = nombre;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.Lista_de_estudios = Lista_de_estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char[] getAño() {
        return año;
    }

    public void setAño(char[] año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getLista_de_estudios() {
        return Lista_de_estudios;
    }

    public void setLista_de_estudios(ArrayList<Estudio> Lista_de_estudios) {
        this.Lista_de_estudios = Lista_de_estudios;
    }
}
