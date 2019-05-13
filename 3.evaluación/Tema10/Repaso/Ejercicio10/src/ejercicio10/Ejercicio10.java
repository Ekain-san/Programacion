/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    private static Matcher mat;
    private static Pattern pat = Pattern.compile("^[A-za-z0-9]*@[A-za-z]*.[a-z]{1-3}$");
    private static String correo;
    
    public static void main(String[] args) {
        correo= JOptionPane.showInputDialog("Introduce un nuevo correo");
        mat = pat.matcher(correo);
        if (mat.matches())
            JOptionPane.showMessageDialog(null, "Mail correcto");
        else
            JOptionPane.showMessageDialog(null, "Mail incorrecto");
    }
}
