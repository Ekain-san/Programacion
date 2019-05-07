/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio3 {


    /**
     * @param args the command line arguments
     */
    private static String [] lista = new String [28];
    private static int x;
    private static int contador=0;
    private static String texto;
    
    public static void main(String[] args) {
        rellenador();
        escritor();
    }
    
    private static void rellenador() {
        lista [0] = "A";
        lista [1] = "B";
        lista [2] = "C";
        lista [3] = "D";
        lista [4] = "E";
        lista [5] = "F";
        lista [6] = "G";
        lista [7] = "H";
        lista [8] = "I";
        lista [9] = "J";
        lista [10] = "K";
        lista [11] = "L";
        lista [12] = "M";
        lista [13] = "N";
        lista [14] = "Ñ";
        lista [15] = "O";
        lista [16] = "P";
        lista [18] = "Q";
        lista [19] = "R";
        lista [20] = "S";
        lista [21] = "T";
        lista [22] = "V";
        lista [23] = "W";
        lista [24] = "X";
        lista [25] = "Y";
        lista [26] = "Z";
        lista [27] = " ";
    }

    private static void escritor() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 1 al 28 para escribir algo. "
                                                       + "\n Siendo a el numero 1, 27 el z y 28 un espacio"));
        x = x - 1;
        while (x>-1 && x<lista.length){
            switch (x){
                case 27: texto = texto + lista[x];
                    break;
                    
                default: if (contador==0)
                            texto = texto + lista[x];
                         else
                            texto = texto + lista[x].toLowerCase();
                    break;
            }
            
            x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero entre el 1 y el 28 si desea seguir escrbiento"));
            x=x-1;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Ha escrito:"+texto);
    }
}
