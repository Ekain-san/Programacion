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
    private static Integer[] lista2;
    private static int x;
    private static Pattern pat;
    private static Matcher mat;
    private static String listaString= " ";
    
    public static void main(String[] args) {
        formador();
        rellenador();
        establecedor();
        seleccionador();
    }

    private static void formador() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros desea que tenga la lista"));
        lista = new Integer[x];
        lista2 = new Integer[x];
    }

    private static void rellenador() {
        for(x=0; x<lista.length;x++){
            lista[x] = (int) Math.round(Math.random()*300);
        }
        for (x=0; x<lista.length;x++){
                listaString = listaString + " " + lista[x];
        }
        JOptionPane.showMessageDialog(null, listaString);
    }

    private static void establecedor() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca por que numero desea que terminen los elementos seleccionados"));
        pat = Pattern.compile("^%[0-9]*"+x+"$");
    }

    private static void seleccionador() {
        for (x=0; x<lista.length;x++){
            mat =pat.matcher(lista[x].toString());
            if (mat.matches()){
                listaString = listaString + " " + lista[x];
                lista2[x]=lista[x];
            }
        }
        JOptionPane.showMessageDialog(null, listaString);
    }
    
}
