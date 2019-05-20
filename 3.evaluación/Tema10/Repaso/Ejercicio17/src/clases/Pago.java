/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Pago {
    private Date fechaP;
    private double Importe;
    private String DireccionF;
    private Envio envio;

    public Date getFechaP() {
        return fechaP;
    }

    public void setFechaP(Date fechaP) {
        this.fechaP = fechaP;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public String getDireccionF() {
        return DireccionF;
    }

    public void setDireccionF(String DireccionF) {
        this.DireccionF = DireccionF;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
    
    public Pago(Date fechaP, double Importe, String DireccionF, Envio envio) {
        this.fechaP = fechaP;
        this.Importe = Importe;
        this.DireccionF = DireccionF;
        this.envio = envio;
    }
}
