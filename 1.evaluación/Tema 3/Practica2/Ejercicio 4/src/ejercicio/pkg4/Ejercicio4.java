/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       boolean error=false;
       do
        {
           try
            {
                String fecha= JOptionPane.showInputDialog("introduce la primera fecha, dd/MM/yy");
                SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yy");
                Date fechaUno=formatter.parse(fecha);
        
                fecha= JOptionPane.showInputDialog("introduce la segubnda fecha, dd/MM/yy");
                Date fechaDos=formatter.parse(fecha);
        
                Long milisegundos= fechaUno.getTime()-fechaDos.getTime();
                Long dias= milisegundos/8400000;
                
                JOptionPane.showMessageDialog(null, "la cantidad de  días que estan entre ambas fechas es "+dias);
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
