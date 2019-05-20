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
public class Vendedor {
    private String nombre;
    private String apellido;
    private ArrayList <Envio> envios;
    private ArrayList <Articulo> articulos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(Envio envio) {
        envios.add(envio);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo articulo) {
        articulos.add(articulo);
    }

    public Vendedor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.envios = new ArrayList<Envio> ();
        this.articulos = new ArrayList <Articulo> ();
    }
}
