/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String radio = JOptionPane.showInputDialog("Introduce medida del radio");
        double r = Double.parseDouble(radio);
        double a = Math.PI * Math.pow(r, 2);
        JOptionPane.showMessageDialog(null,"El área del circulo es: "+a);
    }
    
}
