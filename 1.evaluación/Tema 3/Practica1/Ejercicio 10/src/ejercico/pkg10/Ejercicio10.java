/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico.pkg10;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nota = JOptionPane.showInputDialog("Introduce nota, de 0 a 10");
        int n = Integer.parseInt(nota);
        switch(n)
        {
            case 1: JOptionPane.showMessageDialog(null,"Lunes");
            case 2: JOptionPane.showMessageDialog(null,"Martes");
            case 3: JOptionPane.showMessageDialog(null,"Miércoles");
            case 4: JOptionPane.showMessageDialog(null,"Jeves");
            case 5: JOptionPane.showMessageDialog(null,"Viernes");
            case 6: JOptionPane.showMessageDialog(null,"Sabado");
            case 7: JOptionPane.showMessageDialog(null,"Domingo");
            default: JOptionPane.showMessageDialog(null,"Error, cifra no balida"); 
        }
    }  
}
