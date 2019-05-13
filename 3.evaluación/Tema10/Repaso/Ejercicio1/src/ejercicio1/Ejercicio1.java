/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio1 {


    /**
     * @param args the command line arguments
     */
    private static int[] lista = new int[10];
    private static int x;
    private static int y;
    private static int opcion;
    private static String listaString;
    private static boolean seguir;
    
    public static void main(String[] args) {
        formarLista();
        seleccionarOpcion();
        ejecutarOpcion();
    }

    private static void formarLista() {
        for(x=0; x<lista.length;x++){
            lista[x]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        }
    }
    
    private static void seleccionarOpcion() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una de estas opciones"
                                                            + "\n 1. Mostrar todo el contenido de la lista"
                                                            + "\n 2. Mostrar todo el contenido un elemento quese encuentra en una posición de la lista"
                                                            + "\n 3. Modificar el contenido de un elemento"
                                                            + "\n 4. Vaciar el contenido de una posición"
                                                            + "\n 5. Calcular la suma y la media de todos los numeros"
                                                            + "\n 6. Ordenar el contenido de mayor a menor"));
    }

    private static void ejecutarOpcion() {
        switch(opcion){
            case 1: mostrador();
                break;
            case 2: enseñador();
                break;
            case 3: modificador();
                break;
            case 4: eliminador();
                break;
            case 5: ordenador();
                break;
        }
    }

    private static void mostrador() {
        for(x=0; x<lista.length;x++){
            listaString=listaString+" "+lista[x];
        }
        JOptionPane.showMessageDialog(null,listaString);
    }

    private static void enseñador() {
        do{ 
            try{
                x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición del numero que desea sacar"));
                JOptionPane.showMessageDialog(null,lista[x]);
                seguir = true;
            }
            catch(Exception e){
                seguir = false; 
            }
            
        }while(seguir=false);
    }

    private static void modificador() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición del numero que desea modificar"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo valor del numero que desea modificar"));
        lista[x-1]=y;
        JOptionPane.showMessageDialog(null,"Numero cambiado");
    }

    private static void eliminador() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición del numero que desea eliminar"));
        lista[x-1]=-1;
        JOptionPane.showMessageDialog(null,"Numero borrado");
    }

    private static void ordenador() {
        Arrays.sort(lista);
        int [] lista2 = new int [lista.length];
        y=0;
        for(x=lista.length-1; x>0;x--){
            y++;
            listaString=listaString+" "+lista[x];
            lista2[y]=lista[x];
        }
        for(x=0; x<lista.length;x++){
            lista[x]=lista2[x];
        }
        JOptionPane.showMessageDialog(null, listaString);
    }
}
