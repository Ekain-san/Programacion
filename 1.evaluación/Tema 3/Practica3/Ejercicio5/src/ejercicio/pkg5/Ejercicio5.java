1/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

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
        // TODO code application logic here
        boolean fin=false;
        
        int nota=0;
        
        int media=0;
        
        int veces=0;
        
        float notaMedia;
        
        String nombre=" ";
        
        
        do
        {
            nombre=JOptionPane.showInputDialog("Introduzca Fin si desea terminar");
            
            switch (nombre)
            {
                case "Fin": fin=true;
                            break;
                
                default:for(veces=0;veces<6;veces++)
                {
                    try
                    {
                        nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota"));
                    }
                    
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null,"Ha introducido un valor que no sirve. Prueve a introducir otro");
                    }
                    
                    media=media+nota;
                }
                    notaMedia=media/veces;
                    
                    JOptionPane.showMessageDialog(null, "La nota media es "+notaMedia);
                    break;
            }
                    
            
        }while(fin==false);
    }
    
}
