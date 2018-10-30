/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio20 {
    static int numero= (int)(Math.random()*100);
    static int respuesta=0;
    static int numero2=Integer.parseInt(JOptionPane.showInputDialog("pon un numero del, 0 al 100"));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    adivinar (numero,numero2,respuesta);
    }
    public static void adivinar (int numero,int numero2, int respuesta)
    {
        if(numero2>=0&&numero<=100)
        {
          if(numero2==numero)
            {
              JOptionPane.showMessageDialog(null, "Has acertado");
            }     
           else   
            {
                while (respuesta==0&&numero2>=0&&numero2<=100)
                    {
                        if(numero>numero2)
                        {
                            JOptionPane.showMessageDialog(null, "Es mayor");
                        }
                        else if(numero2==numero)
                            {
                            JOptionPane.showMessageDialog(null, "Has acertado");
                            respuesta=1;
                            }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Es menor");
                        }
                        respuesta=JOptionPane.showConfirmDialog(null,"clicke sí si desea continuar, pero en caso de que no lo haga cierre esta pestaña o dele a no", "¿Desea continuar?", JOptionPane.YES_NO_OPTION);
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("pon otro numero del, 0 al 100"));
                    }
                    if (numero2<0||numero2>100)
                        JOptionPane.showMessageDialog(null, "Error, numero no valido. Pruebe a darle a un numero del 0 al 100 a la proxima");
                }      
            }
       else
        {
        JOptionPane.showMessageDialog(null, "Error, numero no valido. Pruebe a darle a un numero del 0 al 100 a la proxima");   
        }
    JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
}        

