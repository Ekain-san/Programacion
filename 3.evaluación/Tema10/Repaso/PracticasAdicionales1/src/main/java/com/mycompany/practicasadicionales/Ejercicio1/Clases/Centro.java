/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasadicionales.Ejercicio1.Clases;

/**
 *
 * @author Asus
 */
public class Centro {
    int codigo;
    String nombre;
    String tipo;
    String direccion;
    String localidad;
    String provincia;

    public Centro() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Centro(int codigo, String nombre, String tipo, String direccion, String localidad, String provincia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}
