/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    String mensaje=JOptionPane.showInputDialog("introduce mensaje para calcular las vocales que tiene");
    int vocales=contadorVocales(mensaje);
    }
    public static int contadorVocales (String mensaje)
    {
        int contador=0;
        for (int x=0; x<mensaje.length();x++)
        {
            switch(mensaje.charAt(x))
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    contador=contador+1;
            }
        }
        return contador;
    }
}
