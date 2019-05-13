/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    private static Pattern pat = Pattern.compile("^[0-9]{4}/[1]?[1-9]/[123]?[1-9]$");
    private static Matcher mat;
    private static String año;
    
    public static void main(String[] args) {
        año = JOptionPane.showInputDialog("Introduce un año");
        mat = pat.matcher(año);
        if (mat.matches())
            JOptionPane.showMessageDialog(null, "Año correcto");
        else
            JOptionPane.showMessageDialog(null, "Año incorrecto");
    }
    
}
