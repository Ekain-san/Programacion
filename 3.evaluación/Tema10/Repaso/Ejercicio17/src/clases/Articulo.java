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
public class Articulo {
    private String nombre;
    private double precio;
    private Envio envio;
    private ArrayList <Vendedor> vendedores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public Articulo(String nombre, double precio, Envio envio) {
        this.nombre = nombre;
        this.precio = precio;
        this.envio = envio;
        this.vendedores = new ArrayList<Vendedor>();
    }
}
