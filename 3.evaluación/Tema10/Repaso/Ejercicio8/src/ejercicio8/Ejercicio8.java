/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */

public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList <Integer> lista = new ArrayList<Integer>();
    
    private static boolean seguir;
    private static boolean continuar;
    
    private static int x;
    private static int total = 0;
    private static int media;
    private static int cantidad;
    private static String mayoresALaMedia;
    
    public static void main(String[] args) {
        rellenar();
        mostrado();
    }

    private static void rellenar() {
        do{
            do{
                try{
                    x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numeros que desee introducir en la lista"
                                                                    + "\n -99 para dejar de introducir numeros"));
                    seguir = false;
                }
            
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    seguir = true;
                }
            }while (seguir = true);
            
            if(x==-99)
                continuar = false;
            
            else{
                continuar = continuar=true;
                lista.add(x);
            }
            
        }while (continuar = true);
    }

    private static void mostrado() {
        cantidad=lista.size();
        calculado();
        JOptionPane.showMessageDialog(null, "La catidad de valores leidos es: " + cantidad
                                          + "\n El total de los numeros es: " + total
                                          + "\n La media de los numeros es:" + media
                                          + "\n Los numeros mayores a la media son:" + mayoresALaMedia);
    }

    private static void calculado() {
        for (x=0; x<lista.size();x++){
            total = total + lista.get(x);
        }
        media = total/cantidad;
        
        for (x=0; x<lista.size();x++){
            if(lista.get(x)>media)
                mayoresALaMedia= mayoresALaMedia + " " + lista.get(x);
        }
    }
    
}
