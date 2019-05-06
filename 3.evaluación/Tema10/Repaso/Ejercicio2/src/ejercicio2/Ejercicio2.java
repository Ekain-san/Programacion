/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    private static Integer[] lista;
    private static int x;
    private static Pattern pat;
    private static Matcher mat;
    private static String listaString;
    
    public static void main(String[] args) {
        formador();
        rellenador();
        establecedor();
        seleccionador();
    }

    private static void formador() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros desea que tenga la lista"));
        lista = new Integer[x];
    }

    private static void rellenador() {
        for(x=0; x<lista.length;x++){
            lista[x] = (int) Math.round(Math.random()*300);
        }
    }

    private static void establecedor() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca por que numero desea que terminen los elementos seleccionados"));
        pat = Pattern.compile("^%[0-9]*"+x+"$");
    }

    private static void seleccionador() {
        mat =pat.matcher(lista[x].toString());
        for (x=0; x<lista.length;x++){
            if (mat.matches()){
                listaString = listaString + " " + lista[x];
            }
        JOptionPane.showMessageDialog(null, listaString);
        }
    }
    
}
