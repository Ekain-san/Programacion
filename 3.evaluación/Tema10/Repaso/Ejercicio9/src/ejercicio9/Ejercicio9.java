/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import exceptiones.UltimoDigitoIncorrectoException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    private static Pattern pat = Pattern.compile("^[0-9]9[A-Z]$");
    private static Matcher mat;
    private static String dni;
    private static String modo;
    
    public static void main(String[] args) {
        seleccionador();
        ejecutador();
    }

    private static void seleccionador() {
        modo = JOptionPane.showInputDialog("Introduzca modo de autentificación que desee usar"
                                         + "TRY = try catch o matcher = para expresión regular").toLowerCase();
    }

    private static void ejecutador() {
        switch (modo){
            case "matcher":
            case "expresion regular":
            case "expresión regular": matcher();
                break;
            default: try_catch();
                break;
        }
    }

    private static void matcher() {
        dni = JOptionPane.showInputDialog("Introduce dni");
        mat = pat.matcher(dni);
        if(mat.matches())
            JOptionPane.showMessageDialog(null, "DNI correcto");
        else
            JOptionPane.showMessageDialog(null, "DNI incorrecto");
    }

    private static void try_catch() {
        try{
            dni = JOptionPane.showInputDialog("Introduce dni");
            char digito;
            String dato= "";
            int numero;
            int x;
            ArrayList <String> lista = new ArrayList <String>();
            lista.add("A");
            lista.add("B");
            lista.add("C");
            lista.add("D");
            lista.add("E");
            lista.add("F");
            lista.add("G");
            lista.add("H");
            lista.add("I");
            lista.add("J");
            lista.add("K");
            lista.add("L");
            lista.add("M");
            lista.add("N");
            lista.add("Ñ");
            lista.add("O");
            lista.add("P");
            lista.add("Q");
            lista.add("R");
            lista.add("S");
            lista.add("T");
            lista.add("U");
            lista.add("V");
            lista.add("W");
            lista.add("X");
            lista.add("Y");
            lista.add("Z");
            
            for(x=0; x<dni.length()-1;x++){
                digito = dni.charAt(x);
                dato = dato+digito;
            }

            numero = Integer.parseInt(dato);
            
            digito = dni.charAt(dni.length()-1);
            for(x=0; x<lista.size()||lista.get(x).equals(digito);x++){                
            }
            
            if(x==lista.size()){
                throw new UltimoDigitoIncorrectoException();
            }
            JOptionPane.showMessageDialog(null, "DNI correcto");
            
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "DNI incorrecto");
        }
        
    }
    
}
