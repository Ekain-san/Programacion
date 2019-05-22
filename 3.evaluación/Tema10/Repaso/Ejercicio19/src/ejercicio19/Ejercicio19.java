/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import Clases.Persona;
import java.util.ArrayList;
import vista.*;

/**
 *
 * @author Asus
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    private static ventanaRellenar vr;
    private static ventanaPrincipal vp;
    
    private static Persona persona;
    
    private static ArrayList <Persona> personas;
    
    public static void main(String[] args) {
        crearVentanas();
        rellenar();
        
    }

    private static void rellenar() {
        vr.setVisible(true);    
    }

    public static void paginaPrincipal() {

    }

    public static void vaciar() {
        
    }

    public static void crearClase(String dni, String nombre, String apellidos, String sexo, Integer edad, Double peso) {
        persona = new Persona (dni, nombre, apellidos, sexo, edad, peso);
        personas.add(persona);
    }

    private static void crearVentanas() {
        vr = new ventanaRellenar();
        vp = new ventanaPrincipal();
    }
    
}
