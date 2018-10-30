/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nota = JOptionPane.showInputDialog("Introduce nota, de 0 a 10");
        int n = Integer.parseInt(nota);
        switch(n)
         {
            case 0: JOptionPane.showMessageDialog(null,"Muy insuficiente");
            case 1: JOptionPane.showMessageDialog(null,"Insuficiente");
            case 2: JOptionPane.showMessageDialog(null,"Insuficiente");
            case 3: JOptionPane.showMessageDialog(null,"Insuficiente");
            case 4: JOptionPane.showMessageDialog(null,"Insuficiente");
            case 5: JOptionPane.showMessageDialog(null,"Suficiente");
            case 6: JOptionPane.showMessageDialog(null,"Bien");
            case 7: JOptionPane.showMessageDialog(null,"Muy bien");
            case 8: JOptionPane.showMessageDialog(null,"Muy bien");
            case 9: JOptionPane.showMessageDialog(null,"Muy bien");
            case 10: JOptionPane.showMessageDialog(null,"Perfecto");
            default:JOptionPane.showMessageDialog(null,"Error, nota no balida");
        }
    }
}
