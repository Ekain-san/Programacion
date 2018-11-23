/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio7 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  String cateto = JOptionPane.showInputDialog("Inttroduce medidas del primer cateto");
        double c = Double.parseDouble(cateto);
       
        double  c2 = Double.parseDouble(JOptionPane.showInputDialog("Inttroduce medidas del segundo cateto"));
       
        double h=Math.sqrt(Math.pow(c,2)+Math.pow(c2,2));
        
        JOptionPane.showMessageDialog(null, "La hipotenusa de "+c+" y "+c2+" es: "+h);  }
    
}
