/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        boolean bien=false;
        boolean fin=false;
        float[] numeros= new float[10];
        int x=0;
        for (int i=0;i!=numeros.length;i++)
        {
            do
            {
                try
                {
                    numeros[i]=Float.parseFloat(JOptionPane.showInputDialog("Introduce nota"));
                    bien=true;
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Ha metido un alor equivocado prueve con un numero");
                    bien=false;
                }
                    
               catch(Exception e)
                {
                    bien=true;
                    fin=true;
                }
                    
            }while(bien==false);
        }
        if(fin==false)
        {
           Arrays.sort(numeros);
       JOptionPane.showMessageDialog(null, "El minimo es: "+numeros[0]+"\n\n El maximo es: "+numeros[numeros.length-1]); 
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
    }
}
