/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import ejercicio2.Ejercicio2;
import static ejercicio2.Ejercicio2.volverAPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class VerificadorDeAccion {
    private static String otro;
    private static String estarSeguro;
    public static void cercionar(String ventana) {
        estarSeguro=seguridad();
        if (estarSeguro.equals("sí")){
            switch (ventana){
                case "cancelar":Ejercicio2.cancelar();
                case "alta": Ejercicio2.darAlta();
                case "agregar":Ejercicio2.agregar();
                case "inscribir":Ejercicio2.inscribir();
                case "añadir":Ejercicio2.añadir();
            }
        }
        if (!ventana.equals("añadir")){
        otro=seguir();
            switch(otro){
                case "sí": Ejercicio2.vaciar(ventana);
                case "no": volverAPrincipal(ventana);
            }
        }
    }
    
    private static String seguridad() {
        estarSeguro=JOptionPane.showInputDialog("¿Esta seguro? N (no), s (sí)").toLowerCase();
        switch (estarSeguro){
            case "s": estarSeguro="sí";
                break;
                
            case "n": estarSeguro="no";
                break;
                      
            default: estarSeguro="no";
                break;
        }; 
        return estarSeguro;
    }

    private static String seguir() {
        otro=JOptionPane.showInputDialog("¿Desea hacer más? N (no), s (sí)").toLowerCase();
        switch (otro){
            case "s": otro="sí";
                break;
            case "n": otro="no";
                break;
            default: otro="no";
                break;
        }; 
        return otro;
    }
}
