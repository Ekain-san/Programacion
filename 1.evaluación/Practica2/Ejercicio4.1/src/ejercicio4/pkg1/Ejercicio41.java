/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.pkg1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       boolean error;
       do
        {
           try
            {
                DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String fecha= JOptionPane.showInputDialog("introduce la primera fecha, dd/MM/yyyy");
                LocalDate fechaUno=LocalDate.parse(fecha,formatter);
        
                fecha= JOptionPane.showInputDialog("introduce la segunda fecha, dd/MM/yyyy");
                LocalDate fechaDos=LocalDate.parse(fecha,formatter);
        
                Period period=Period.between(fechaUno,fechaDos);
                
                JOptionPane.showMessageDialog(null, "la cantidad de  días que estan entre ambas fechas es "+period.getDays());
                error=false;
             }
            catch (Exception e)
            {
              JOptionPane.showMessageDialog(null, "Error, prueba a poner una fecha a la proxima");
              error=true;
            }
        }while (error==true);
    }
    
}
