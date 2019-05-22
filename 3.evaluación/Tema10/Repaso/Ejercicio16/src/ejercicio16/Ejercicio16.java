/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import clases.Persona;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    private static int x = (int) (Math.random()*50+0);
    private static int y = (int) (Math.random()*60+5);
    private static int cantidad;
    
    private static double precio;
    private static double total = 0;
    
    private static ArrayList <Persona> cola = new ArrayList <Persona> ();
    
    private static Persona persona;
    
    public static void main(String[] args) {
        rellenar();
        precio();
    }

    private static void rellenar() {
        for(cantidad = 0; cantidad < x; cantidad++){
            int edad = y;
            persona = new Persona (edad);
            cola.add(persona);
        }
    }

    private static void precio() {
        for(cantidad = 0; cantidad < x; cantidad++){
            if(3<cola.get(x).getEdad()&&cola.get(x).getEdad()<11){
                precio = 1;
            }
            
            else if(10<cola.get(x).getEdad()&&cola.get(x).getEdad()<18){
                precio = 2.5;
            }
            
            else if(17<cola.get(x).getEdad()){
                precio = 5;
            }
            
            cola.remove(x);
            
            total = total + precio;
            
        }
    }
    
}
