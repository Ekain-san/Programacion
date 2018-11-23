/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String mensaje=JOptionPane.showInputDialog("introduce mensaje para calcular lo que desee");
        char valor=JOptionPane.showInputDialog("introduce la cantidad de que valor quieres calcular, de 'a' a 'z' en minuscula").charAt(0);
        contador(mensaje, valor);
    }
    
    public static void contador(String mensaje, char valor)
    {
        int contador=0;
        char sigla;
        for (int x=0; x<mensaje.length();x++)
        {
            if(Character.isUpperCase(valor))
                {
                 valor= Character.toLowerCase(valor);
                }
            
             if(Character.isUpperCase(mensaje.charAt(x)))
                {
                 sigla= Character.toLowerCase(mensaje.charAt(x));
                }
             else
                {
                  sigla= mensaje.charAt(x);
                }
            if(sigla==valor)
                {
                    contador=contador+1;
                } 
            }
        JOptionPane.showMessageDialog(null, "la cantidad "+valor+" es "+contador+" en: "+mensaje);
    }        
}