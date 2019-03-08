/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.util.ArrayList;
import Formas.Proveedor;

/**
 *
 * @author Asus
 */
public class Producto 
{
    private String nombre;
    private float precio;
    private int unidades;
    private ArrayList <Proveedor>ListaProveedores;

    public ArrayList<Proveedor> getListaProveedores() {
        return ListaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> ListaProveedores) {
        this.ListaProveedores = ListaProveedores;
    }
    
        public Producto(String n, Integer u, Float p){
        this.nombre = n;
        this.unidades = u;
        this.precio = p;
        ListaProveedores = new ArrayList();
    }


    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }

    public void setUnidades(Integer u){
       unidades = u;
    }
    
    public void comprarUnidades(Integer u,Float p)
    {
        setNuevoPrecio(u,p);
        unidades = unidades + u;
        
    }
    
    public void venderUnidades(Integer u)
    {
        unidades = unidades - u;
    }
    
    public Integer getUnidades(){
        return unidades;
    }

    public void setPrecioUnitario(Float p){
        precio = p;
    }

    public void setNuevoPrecio(int unidades, float p){
        precio =((this.unidades * this.precio) + (unidades * p))/(this.unidades + unidades);
    }
    
    public Float getPrecio(){
        return precio;
    }
    
    public Float getPrecioVenta(){
        return precio * 2;
    }
}
