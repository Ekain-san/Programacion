/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

/**
 *
 * @author Asus
 */
import javax.swing.JOptionPane;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String diagonal = JOptionPane.showInputDialog("Introduce diagonal grande");
        int d = Integer.parseInt(diagonal);
       
        int  d2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce diagonal pequeña"));
        
        if (d>d2){int resultado = d * d2/2;
        JOptionPane.showMessageDialog(null,"el área es: "+resultado);}
        
        else {String error;
        error= "Error, la diagonal grande tiene que ser mayor que la pequeña";
       JOptionPane.showMessageDialog(null,error);}
        
        
         // TODO code application logic here
    }
    
}
