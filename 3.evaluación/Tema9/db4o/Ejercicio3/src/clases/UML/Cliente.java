/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.UML;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Cliente extends Persona {
    private int telefono;
    private ArrayList <Caso> listaCasos;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(ArrayList<Caso> listaCasos) {
        this.listaCasos = listaCasos;
    }

    public Cliente(int telefono, ArrayList<Caso> listaCasos, String dni, String nombre, String apellido, String direccion) {
        super(dni, nombre, apellido, direccion);
        this.telefono = telefono;
        this.listaCasos = listaCasos;
    }     
}
