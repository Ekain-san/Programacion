/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Envio {
    private Date fechaE;
    private String DireccionE;
    private  Comprador comprador;
    private Vendedor vendedor;
    private Pago pago;
    private ArrayList <Articulo> articulos;

    public Envio(Date fecha, String direccionE, Comprador comprador) {

    }

    public Date getFechaE() {
        return fechaE;
    }

    public void setFechaE(Date fechaE) {
        this.fechaE = fechaE;
    }

    public String getDireccionE() {
        return DireccionE;
    }

    public void setDireccionE(String DireccionE) {
        this.DireccionE = DireccionE;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo articulo) {
        articulos.add(articulo);
    }

    public Envio(Date fechaE, String DireccionE, Comprador comprador, Vendedor vendedor, Pago pago) {
        this.fechaE = fechaE;
        this.DireccionE = DireccionE;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.pago = pago;
        this.articulos = new ArrayList <Articulo> ();
    }
}
