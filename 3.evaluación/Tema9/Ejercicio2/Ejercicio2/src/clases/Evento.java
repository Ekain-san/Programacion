/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Asus
 */
public class Evento {
    private String nombre;
    private String ubicacion;
    private LocalDate fecha;
    private LocalTime horaI;
    private LocalTime horaF;
    private String aforo;

    public Evento(String nombre,String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraI() {
        return horaI;
    }

    public void setHoraI(LocalTime horaI) {
        this.horaI = horaI;
    }

    public LocalTime getHoraF() {
        return horaF;
    }

    public void setHoraF(LocalTime horaF) {
        this.horaF = horaF;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }
    
}
