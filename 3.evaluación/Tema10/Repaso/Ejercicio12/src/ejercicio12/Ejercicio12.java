/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import excepcion.datoSinSentido;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    private static Matcher mat;
    private static Pattern pat = Pattern.compile("^[A-z][a-z]*$");
    
    private static String nombre;
    
    public static void main(String[] args) {
        try{
            mat = pat.matcher(nombre);
            if (!mat.matches()){
                throw new datoSinSentido();
            }
        }
        
        catch(Exception e){
            
        }
    }
    
}
