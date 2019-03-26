/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobacion;

import static ejercicio2.Ejercicio2.volverAPrincipal;
import javax.swing.JOptionPane;
import ejercicio2.Ejercicio2;

/**
 *
 * @author Asus
 */
public class VerificadorDeAccion {
    private static String otro;
    private static String estarSeguro;
    public static void cercionar(String ventana) {
        if(estarSeguro.equals("sí")){
            if(ventana.equals("cancelar"))
                Ejercicio2.cancelar();
                if(ventana.equals("agregar"))
                Ejercicio2.agregar();
            otro=seguir();
        }
        
        else{
            volverAPrincipal(ventana);
        }
        
        if(otro.equals("no")){
            volverAPrincipal(ventana);
        }
    }
    
    private static String seguridad() {
        estarSeguro=JOptionPane.showInputDialog("¿Esta seguro? N (no), s (sí)");
        switch (estarSeguro){
            case "s": estarSeguro="sí";
                      break;
            case "S": estarSeguro="sí";
                      break;
            case "n": estarSeguro="no";
                      break;
            case "N": estarSeguro="no";
                      break;
            default: estarSeguro="no";
                      break;
        }; 
        return estarSeguro;
    }

    private static String seguir() {
        otro=JOptionPane.showInputDialog("¿Desea hacer más? N (no), s (sí)");
        switch (otro){
            case "s": otro="sí";
                      break;
            case "S": otro="sí";
                      break;
            case "n": otro="no";
                      break;
            case "N": otro="no";
                      break;
            default: otro="no";
                      break;
        }; 
        return otro;
    }
}
