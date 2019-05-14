/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Integer> lista = new ArrayList<Integer>();
    private static int x;
    private static int y;
    private static int z = 0;
    private static boolean seguir;
    
    public static void main(String[] args) {
        rellenar();
        seleccionar();
        ejecutar();
    }

    private static void rellenar() {
        do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros quiere que tenga la lista"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        
        for(y=1; y<x;y++){
            lista.add((int)(Math.round(Math.random())));
        }
    }

    private static void seleccionar() {
         do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Escoja una de estas opciones:"
                                                            + "\n 1 agregar un numero"
                                                            + "\n 2 buscar un numero"
                                                            + "\n 3 modificar un numero"
                                                            + "\n 4 eliminar un numero"
                                                            + "\n 5 insertar un numero en una posición dada"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
    }

    private static void ejecutar() {
        switch(x){
            case 1: agregar();
                break;
            case 2: buscar();
                break;
            case 3: modificar();
                break;
            case 4: eliminar();
                break;
            case 5: insertar();
                break;
            default: JOptionPane.showMessageDialog(null, "Numero no valido");
                break;
        }
    }

    private static void agregar() {
         do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que desea agregar"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        lista.add(x);
    }

    private static void buscar() {
         do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que desea buscar"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
         
        for (y=0; !lista.get(y).equals(x)&&y<lista.size();y++){
            
        }
        if(y==lista.size())
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        else
            JOptionPane.showMessageDialog(null, "Numero encontrado");
    }

    private static void modificar() {
        do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que desea cambiar"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        
        do{
            try{
                y = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo valor del numero"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        
        for (z = 0; z<lista.size();z++){
            if(x==lista.get(z)){
                lista.set(z, y);
                JOptionPane.showMessageDialog(null, "Dato cambiado en la posición "+z);
            }
        }
        
    }

    private static void eliminar() {
        int u=0;
        
        do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que desea eliminar"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        
        for (y=0; y<lista.size();y++){
            if(lista.get(y)==x)
                u = lista.remove(y);
                z = z + u;
        }
        
        if(z==0)
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        else
            JOptionPane.showMessageDialog(null, "Numero eliminado");
    }

    private static void insertar() {
do{
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que desea insertar"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        
        do{
            try{
                y = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo valor del numero"));
                seguir = true;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                seguir = false;
            }
        }while (seguir = false);
        
        lista.add(y, x);
       JOptionPane.showMessageDialog(null, "Numero insertado");
    }
    
}
