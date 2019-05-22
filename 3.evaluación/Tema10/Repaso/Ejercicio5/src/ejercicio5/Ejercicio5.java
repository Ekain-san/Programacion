/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import excepcion.datoSinSentido;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    private static Integer x;
    private static boolean seguir;
    private static int[] lista;
    private static Pattern pat = Pattern.compile("^[1-5]$");
    private static Matcher mat;
    
    public static void main(String[] args) {
        crear();
        seleccionar();
        ejecutar();
    }

    private static void crear() {
        do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros quiere que tenga la lista"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir == false);
        lista = new int [x];
    }

    
    private static void seleccionar() {
       do{     
            try{ 
                x = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca in numero del 1 al 5"));
                mat = pat.matcher(x.toString());
                if (!mat.matches()){
                    throw new datoSinSentido();
                }
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir == false);
    }

    private static void ejecutar() {
        switch (x){
            case 1: ordenar();
                break;
            case 2: rellenar1Valor();
                break;
            case 3: convertirEnString();
                break;
            case 4: busquedaBinaria();
                break;
            case 5: convertirNullsEnCeros();
                break;
        }
    }

    private static void ordenar() {
        JOptionPane.showMessageDialog(null, "Ordenar lista");
        Arrays.sort(lista);
    }

    private static void rellenar1Valor() {
        do{
        JOptionPane.showMessageDialog(null, "Rellenar la lista con un numero");     
            try{ 
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero con el que rellenar todo"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir == false);
        Arrays.fill(lista, x);
    }

    private static void convertirEnString() {
        JOptionPane.showMessageDialog(null, "Convertir en String");
        Arrays.toString(lista);
    }

    private static void busquedaBinaria() {
        JOptionPane.showMessageDialog(null, "Busqueda binarea");
        try{ 
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        Arrays.binarySearch(lista, x);
    }

    private static void convertirNullsEnCeros() {
        JOptionPane.showMessageDialog(null, "Convertir nulls en ceros");
        Arrays.hashCode(lista);
    }

}

 

