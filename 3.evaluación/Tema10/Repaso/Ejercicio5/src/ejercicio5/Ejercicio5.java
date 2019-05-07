/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Arrays;
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
    private static int x;
    private static int y;
    private static int contador=0;
    private static int[] lista;
    
    public static void main(String[] args) {
        crearLista();
        seleccionarOpcion();
        ejecutarOpcion();
    }

    private static void seleccionarOpcion() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 1 al 5"));
    }

    private static void ejecutarOpcion() {
        switch(opcion){
            case 1: ordenarNumeros();
                break;
            case 2: rellenar();
                break;
            case 3: buscaMinas();
                break;
            case 4: 
                break;
            case 5: 
                break;
        }
    }

    private static void ordenarNumeros() {
       JOptionPane.showMessageDialog(null, "Seleccionar el minimo");
       Arrays.sort(lista);
       JOptionPane.showMessageDialog(null, "El minimo es "+lista[1]);
    }

    private static void rellenar() {
        
    }

    private static void buscaMinas() {
        
    }

    private static void crearLista() {
        x= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros que desea que tenga la lista"));
        lista = new int [x];    
    }
}
