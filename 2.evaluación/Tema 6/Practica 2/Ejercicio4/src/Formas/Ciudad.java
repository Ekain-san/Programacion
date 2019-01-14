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
public class Ciudad 
{
   private String codigoCiudad;
    private String nombre;
    
    // Lista de vuelos que llegan a la ciudad
    private ArrayList<Vuelo> listaVuelos;

    public Ciudad() {
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
    
    public void setVuelo(Vuelo v){
        if (listaVuelos == null)
            listaVuelos = new ArrayList();
        this.listaVuelos.add(v);
    }
    
    public void agregarNuevo(){
        
    }
    
    public Ciudad obtener(){
        return this;
    }
}
