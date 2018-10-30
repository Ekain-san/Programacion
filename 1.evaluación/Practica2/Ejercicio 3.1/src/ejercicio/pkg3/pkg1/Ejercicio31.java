/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg1;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio31 
{

    /**
     * @param args the command line arguments
     */
   
         public static void main(String[] args) 
         {
        // TODO code application logic here
            String cadena= JOptionPane.showInputDialog("Introduce frase o palabra que desea saber si es palindromo o no");
            invertidorCadena(cadena);
        }
        public static void invertidorCadena(String cadena)
        {            
            String cadenaInvertida= "";
            for (int y=cadena.length()-1; y>=0;y--) 
                {
                    cadenaInvertida = cadenaInvertida+cadena.charAt(y);
                }
            
            if (cadenaInvertida.equals(cadena))
                {
                JOptionPane.showMessageDialog(null,"la palabra o frase: "+cadena+". Es palindroma");
                }
             else 
                {
                     JOptionPane.showMessageDialog(null,"la palabra o frase: "+cadena+". No es palindroma");
                }
        }
}
