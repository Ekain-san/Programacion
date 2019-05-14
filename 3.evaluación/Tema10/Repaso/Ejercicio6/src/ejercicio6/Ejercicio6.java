/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<String> lista = new ArrayList<String>();
    private static Pattern pat = Pattern.compile("^[a-cz0-9A-Z]$");
    private static Matcher mat;
    private static String valor;
    private static boolean seguir;
    
    public static void main(String[] args) {
        rellenador();
        invertir();
        imprimir();
    }

    private static void rellenador() {
        
        
        
        do{
            valor = JOptionPane.showInputDialog("Introduce un valor para añadir al mensaje invertido");
            mat = pat.matcher(valor);
            if(mat.matches()){
                lista.add(valor);
            }
            continuar();
            
        }while(seguir=true);
        
    }

    private static void continuar() {
        String opcion = JOptionPane.showInputDialog("Desea continuar "
                                                  + "\n S= sí      n = no").toLowerCase();
        switch (opcion){
            case "no": seguir = false;
            case "n": seguir = false;
                break;
            default: seguir = true;
                break;
        }
    }

    private static void invertir() {
        Collections.reverse(lista);
    }

    private static void imprimir() {
        String listaString="";
        for(int x=0; x<lista.size();x++){
            listaString = listaString + lista.get(x);
        }
        JOptionPane.showMessageDialog(null, listaString);
    }
    
}
