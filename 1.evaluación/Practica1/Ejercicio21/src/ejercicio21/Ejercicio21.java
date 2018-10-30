/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numero=Integer.parseInt(JOptionPane.showInputDialog("Di el numero que quieres saber si es sea primo"));
    int numero2=numero-1;
    calculadorDePrimos(numero,numero2);
    }
    public static void calculadorDePrimos(double numero, double numero2)
    {
     if(numero>0)
        {   
        while(numero2>=1)
            {
            if(numero%numero2==0)
            {
             JOptionPane.showMessageDialog(null,"no es primo");
             numero2=0;
            }
        }
        JOptionPane.showMessageDialog(null,"es primo");
      }
     else
     {
       JOptionPane.showMessageDialog(null,"Error, numero no valido");   
     }
     JOptionPane.showMessageDialog(null,"Programa finalizado");
    }
}
