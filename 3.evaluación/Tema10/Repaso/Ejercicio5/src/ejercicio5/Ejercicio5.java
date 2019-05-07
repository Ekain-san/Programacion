/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    private static int opcion;
    
    public static void main(String[] args) {
        seleccionarOpcion();
        ejecutarOpcion();
    }

    private static void seleccionarOpcion() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 1 al 5"));
    }

    private static void ejecutarOpcion() {
        switch(opcion){
            case 1: adivinar();
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
            case 5: 
                break;
        }
    }

    private static int adivinar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
