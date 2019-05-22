/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import Clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    private static ventanaEjecutar ve;
    
    private static Persona persona;
    
    private static ArrayList <Persona> personas;
    private static int x;
    private static int y;
    private static String texto; 
    
    public static void main(String[] args) {
        crearVentanas();
        rellenar();
        
    }
    private static void crearVentanas() {
        vr = new ventanaRellenar();
        vp = new ventanaPrincipal();
        ve = new ventanaEjecutar();
    }

    private static void rellenar() {
        vr.setVisible(true);    
    }

    public static void paginaPrincipal() {
        vr.setVisible(false);
        vp.setVisible(true);
    }

    public static void crearClase(String dni, String nombre, String apellidos, String sexo, Integer edad, Double peso) {
        persona = new Persona (dni, nombre, apellidos, sexo, edad, peso);
        personas.add(persona);
    }
    public static void ejecutar(String tipo) {
        vp.setVisible(false);
        switch (tipo){
            case "ordenar": ordenar();
                            ve.establecer(tipo);
                            ve.setVisible(true);
                break;
                
            default: ve.establecer(tipo);
                     ve.setVisible(true);
                break;
        }
    }

        
    public static void eliminar(String dni) {
        for (x=0;x<personas.size();x++){
            if(dni.equals(personas.get(x).getDni()))
                personas.remove(x);
            texto  = "Persona borrada en la posición: " + x;
        }
        enseñar();
    }

    public static void buscar(String dni) {
        for (x=0;x<personas.size()&&!personas.get(x).getDni().equals(dni);x++){
            
        }
        
        if(x==personas.size())
            texto= "DNI no encontrado";
        else
            texto = "DNI encontrado";
        }
    

    public static void mostrar(String dni) {
        for (x=0;x<personas.size()&&!personas.get(x).getDni().equals(dni);x++){
            
        }
         
          if(x==personas.size())
             texto="DNI no encontrado";
        else
            texto = "DNI: " + personas.get(x).getDni()
                  + "\n Nombre: " + personas.get(x).getNombre()
                  + "\n Apellidos: " + personas.get(x).getApellidos()
                  + "\n Sexo: " + personas.get(x).getSexo()
                  + "\n Edad: " + personas.get(x).getEdad()
                  + "\n Peso: " + personas.get(x).getPeso();
          
          enseñar();
    }

    private static void ordenar() {
        for (x=0;x<personas.size();x++){
            persona = personas.get(x);
            for(y=x+1;y<personas.size();y++){
                if(personas.get(y).getApellidos().compareToIgnoreCase(persona.getApellidos()) < 0)
                    persona = personas.get(y);
            }
            personas.set(x, persona);
        }
        texto = "Ordenado adecuadamente";
        enseñar();
    }

    private static void enseñar() {
        ve.rellenar(texto);
    }
    
}
