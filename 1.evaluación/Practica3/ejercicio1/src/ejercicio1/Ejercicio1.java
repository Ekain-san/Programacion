/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

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
        int horas=30;
        int sueldo=0;
        try
            {
                int horario=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de horas trabjas"));
                if (horario<horas)
                {
                    throw new EstadoCivilException();
                }
                if (horario>40)
                {
                    horario=horario-40;
                    horas=40;
                    sueldo= horas*10+horario+*15;
                }
            }
        
        
        try
        {
           String estado_civil= JOptionPane.showInputDialog("Introduce estado civil (S para solter@, C para casad@, V para viud@ y D para divorciad@)");
           if (!estado_civil.equals('S')||!estado_civil.equals('C')||!estado_civil.equals('V')||!estado_civil.equals('D'));
           {
               throw new EstadoCivilException;
           }
         }
        catch (EstadoCivilException)
            {
                    
            }
           String estudio= JOptionPane.showInputDialog("Introduce estudios (P para primario, M para medio, S para superior)");
        
        
        try 
        {
           int horas=Integer.parseInt(JOptionPane.showInputDialog("Introduce horas que ejerces"));
        }
        catch
        
           if(estado_civil=='S')
                {
                       
                } 
           else 
                {
               
                }     
    }    
}
