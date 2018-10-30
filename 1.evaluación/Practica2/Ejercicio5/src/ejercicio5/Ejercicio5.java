/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        boolean error=true;
       while(error==true)
        {
          try
            {
                int dia=Integer.parseInt(JOptionPane.showInputDialog("introduce día"));
                int mes=Integer.parseInt(JOptionPane.showInputDialog("introduce mes"));
                int año=Integer.parseInt(JOptionPane.showInputDialog("introduce año"));
                SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy"); 
                Calendar ;
            }
          
          catch (Exception e)
            {
           
            }   
        }
    }
    
}
