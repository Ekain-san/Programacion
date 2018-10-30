/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numero_p=1;
       int veces=0;
       int resultado=0;
       int numero= Integer.parseInt(JOptionPane.showInputDialog("Di numero que quieres elevar a 2"));
       resultado= elevador (numero_p,veces,resultado,numero);
       JOptionPane.showMessageDialog(null, "El reslutado de la elevación es "+resultado);
    }
    public static int elevador (int numero_p, int veces, int resultado, int numero)
    {
      if(numero>0)
      {
          while(veces!=numero)
           {
              resultado=numero_p+resultado;
              numero_p=numero_p+2;
              veces++;
            }
        }
      else
      {
      JOptionPane.showMessageDialog(null,"Error, numero no valido para esta tecnica de elevación");    
      }
      return resultado;
    }
}
