/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

/**
 *
 * @author Asus
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String grados = JOptionPane.showInputDialog("Introduce cantidad de grados celsios");
        double c = Double.parseDouble(grados);
        double f= 1.8*c+32;
        JOptionPane.showMessageDialog(null,c+"ºC son: "+f+"ºF");
    }
}
