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
public class Caso {
    private Cliente cliente;
    private ArrayList <Abogado> listaAbogados;
    private Juicio juicio;
    private int numeroExp;

    public Caso(Cliente cliente, ArrayList<Abogado> listaAbogados, Juicio juicio, int numeroExp) {
        this.cliente = cliente;
        this.listaAbogados = listaAbogados;
        this.juicio = juicio;
        this.numeroExp = numeroExp;
    }

    public Caso() {
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Abogado> getListaAbogados() {
        return listaAbogados;
    }

    public void setListaAbogados(ArrayList<Abogado> listaAbogados) {
        this.listaAbogados = listaAbogados;
    }

    public Juicio getJuicio() {
        return juicio;
    }

    public void setJuicio(Juicio juicio) {
        this.juicio = juicio;
    }

    public int getNumeroExp() {
        return numeroExp;
    }

    public void setNumeroExp(int nuroExp) {
        this.numeroExp = numeroExp;
    }
}
