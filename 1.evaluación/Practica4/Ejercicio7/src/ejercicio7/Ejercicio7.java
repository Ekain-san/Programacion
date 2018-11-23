/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int x= Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de productos vendidos"));
        int[] ventas= new int[x];
        int codigo=0;
        for(int y=0;y!=ventas.length;y++)
            {
                codigo=Integer.parseInt(JOptionPane.showInputDialog("Introduce codigo de producto"));
               int[y]=codigo;
               /*no recuerdo como convertir un int en un array*/
            }
        }
    
}
