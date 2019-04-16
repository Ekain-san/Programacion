/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import clases.UML.Caso;
import controlador.*;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorClases.accederClasesBD();
        ControladorVentanas.crear();
        ControladorVentanas.iniciarPrograma();
    }

    public static void darBaja(String tipo, String dni) {
        ControladorClases.darBaja(tipo, dni);
    }

    public static void cambiarEstado(String estado) {
        ControladorClases.cambiarEstado(estado);
    }

    public static void establecerFuncion(String funcion, int caso) {
        ControladorVentanas.establecerFuncion(funcion,caso);
    }

    public static ArrayList<Caso> sacarNumerosCaso() {
        ArrayList<Caso> listaCasos= ControladorClases.sacarNumerosCaso();
        return listaCasos;
    }
}
