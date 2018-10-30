/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nota = JOptionPane.showInputDialog("Introduce nota, de 0 a 10");
        int n = Integer.parseInt(nota);
        if(n>=0&&n<=10)
        {
            if(n>=5)
            {JOptionPane.showMessageDialog(null,"Has aprobado");}
            else{JOptionPane.showMessageDialog(null,"Has suspendido");}
        } 
       else{JOptionPane.showMessageDialog(null,"Error, nota no balida");} 
        }
}
