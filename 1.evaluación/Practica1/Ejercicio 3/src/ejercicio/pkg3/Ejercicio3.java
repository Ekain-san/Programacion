/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String altura = JOptionPane.showInputDialog("Introduce altura");
        int al = Integer.parseInt(altura);
       
        int  ba = Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
        
        int resultado = al * 2 +   ba * 2;
        
        JOptionPane.showMessageDialog(null,"el perímetro es: "+resultado);
           // TODO code application logic here
    }
    
}
