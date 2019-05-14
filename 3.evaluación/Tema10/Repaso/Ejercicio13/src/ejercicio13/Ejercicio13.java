/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import excepcion.datoSinSentido;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    private static Pattern pat = Pattern.compile("^(C.)?[ ]?[A-z][a-z]*/[1]?[1-9]/[1]?[1-9][A-Z]$");
    private static Pattern pat2 = Pattern.compile("^[A-z][a-z]*$");
    private static Pattern pat3 = Pattern.compile("[0-9][5]");
    private static Matcher mat;
    
    private static String direccion;
    private static String ciudad;
    private static String codigoP;
    
    public static void main(String[] args) {
        try{
            recolector();
            comprobador();
        }
        
        catch(Exception e){
            
        }
    }    

    private static void recolector() {
        
            direccion = JOptionPane.showInputDialog("Introduce una direccion"
                                                  + "Ciudad / calle / piso letra");
            ciudad = JOptionPane.showInputDialog("Introduce una ciudad");
            codigoP = JOptionPane.showInputDialog("Introduce un codigo postal");
    }

    private static void comprobador() {
        try{
            mat = pat.matcher(direccion);
            if(!mat.matches()){
                throw new datoSinSentido();
            }
            
            mat = pat2.matcher(ciudad);
            if(!mat.matches()){
                throw new datoSinSentido();
            }
            
            mat = pat3.matcher(codigoP);
            if(!mat.matches()){
                throw new datoSinSentido();
            }
            
            JOptionPane.showMessageDialog(null, "Datos correctos");
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
            
    }
}
