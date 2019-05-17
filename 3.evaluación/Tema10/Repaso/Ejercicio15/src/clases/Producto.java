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
public class Producto {
    private int cBarras;
    private String nombre;
    private int cantidad;
    private double precio;

    public int getCBarras() {
        return cBarras;
    }

    public void setCBarras(int cBarras) {
        this.cBarras = cBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(int cBarras, String nombre, int cantidad, double precio) {
        this.cBarras = cBarras;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
