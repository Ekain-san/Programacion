/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

/**
 *
 * @author Asus
 */
public class Empleado {
    private String dni;
    private String nss;
    private String nombreApellido;
    private Contrato contrato;
    private String genero;
    private String FechaAlta;
    private String numeroContrato;
    private String estadoCivil;
    private Usuario usuario;

    public Empleado(String dni, String nss, String nombreApellido,Contrato contrato, String genero, String fechaAlta, String numeroContrato, String estadoCivil, Usuario usuario) {
        this.dni = dni;
        this.nss = nss;
        this.nombreApellido = nombreApellido;
        this.contrato = contrato;
        this.genero = genero;
        this.FechaAlta = FechaAlta;
        this.numeroContrato = numeroContrato;
        this.estadoCivil = estadoCivil;
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getFechaAlta() {
        return FechaAlta;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaAlta(String FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}