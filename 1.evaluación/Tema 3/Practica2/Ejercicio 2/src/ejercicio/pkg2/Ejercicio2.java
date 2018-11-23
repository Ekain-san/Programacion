/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena= JOptionPane.showInputDialog("Introduce mensaje que desea invertir");
        invertidorCadena(cadena);
    }
    public static void invertidorCadena(String cadena)
    {            
        StringBuilder cadenaInvertida= new StringBuilder();
        for (int y=cadena.length()-1; y>=0;y--) 
        {
            cadenaInvertida.append(cadena.charAt(y));
        }
    JOptionPane.showMessageDialog(null, cadenaInvertida);
  }
}

