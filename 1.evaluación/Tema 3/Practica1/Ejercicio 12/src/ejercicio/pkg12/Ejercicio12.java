/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String minutos = JOptionPane.showInputDialog("Introduce cantidad de minutos");
        double m = Double.parseDouble(minutos);
        double n=0;
        n = CalculadorDeNomina(m,n);
        JOptionPane.showMessageDialog(null,"Tu nomina es de "+n+" €");
    }

    public static double CalculadorDeNomina (double m, double n)
    {
         if(m>0)
        {
            if(m>300)
            {
                if(m>500)
                {
                    n=m*0.02;
                    if(m>800)
                    {
                        n=n-((n*1.25)/100);
                    }
                }
            }
            else 
            {
                n=m*0.04;
            }
        }
        else{JOptionPane.showMessageDialog(null,"Error, cifa erronea");}
    return n;
    }
   }

