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
    private int nuroExp;

    public Caso(Cliente cliente, ArrayList<Abogado> listaAbogados, Juicio juicio, int nuroExp) {
        this.cliente = cliente;
        this.listaAbogados = listaAbogados;
        this.juicio = juicio;
        this.nuroExp = nuroExp;
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

    public int getNuroExp() {
        return nuroExp;
    }

    public void setNuroExp(int nuroExp) {
        this.nuroExp = nuroExp;
    }
}
