/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import Ventanas.Ventana1;
/**
 *
 * @author Asus
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    private static Ventana1 v;
    
    public static void main(String[] args) {
       // Crear y mostrar la ventana
       v = new Ventana1();
       v.setVisible(true);
    }
    
    public static void salir(){
        v.dispose();
        System.exit(0);
    }
}
