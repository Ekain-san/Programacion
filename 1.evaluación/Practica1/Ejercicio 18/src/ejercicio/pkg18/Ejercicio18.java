/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int veces=2;
        int numero=1;
        int numero2=1;
        int numero3=0;
        int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce posición limite"));
        serieFivonacci(veces,posicion,numero,numero2,numero3);
    }
    public static void serieFivonacci(int veces, int posicion, int numero, int numero2, int numero3)
    {
     if(posicion>0)
     {
         switch(posicion)
         {
             case 1:JOptionPane.showMessageDialog(null,numero);
                break;
              case 2:JOptionPane.showMessageDialog(null,numero);
                break;
               default:
                   while(veces!=posicion)
                   {
                       numero3=numero+numero2;
                       numero=numero2;
                       numero2=numero3;
                       veces=veces+1;
                   }
                   JOptionPane.showMessageDialog(null,numero3);
                break;
            }
        }
     else
     {
         JOptionPane.showMessageDialog(null,"Numero no valido");
     }
    }
}
