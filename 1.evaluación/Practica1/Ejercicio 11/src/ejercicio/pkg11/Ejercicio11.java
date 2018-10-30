/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String numero = JOptionPane.showInputDialog("Introduce primer numero");
        int n = Integer.parseInt(numero);
       
        int  n2 = Integer.parseInt(JOptionPane.showInputDialog("introduce segundo numero"));
        
        int  n3 = Integer.parseInt(JOptionPane.showInputDialog("introduce tercer numero"));
        
        if(n>n2&&n>n3)
        {
            JOptionPane.showMessageDialog(null,n+" es el mayor");
            if(n2<n3){JOptionPane.showMessageDialog(null,n2+" es el menor");}
            else{
                if(n2==n3)
                {
                 JOptionPane.showMessageDialog(null,"Error, no hay menor");       
                }
                else{JOptionPane.showMessageDialog(null,n3+" es el menor");}
            }
        }
        else{ 
            if (n==n2&&n==n3)
            {
                JOptionPane.showMessageDialog(null,"Error, no hay mayor ni menor");
            }
            else{
                if(n2>n&&n2>n3)
                {
                JOptionPane.showMessageDialog(null,n2+" es el mayor");
                 if(n<n3){JOptionPane.showMessageDialog(null,n+" es el menor");}
                 else{
                if(n==n3)
                {
                 JOptionPane.showMessageDialog(null,"Error, no hay menor");       
                }
                else{JOptionPane.showMessageDialog(null,n3+" es el menor");}
                }
                }
                else{
                    if(n3>n&&n3>n2)
                     {
                        JOptionPane.showMessageDialog(null,n3+" es el mayor");
                        if(n<n2){JOptionPane.showMessageDialog(null,n+" es el menor");}
                    else{
                        if(n2==n)
                            {
                                JOptionPane.showMessageDialog(null,"Error, no hay menor");       
                             }
                         else{JOptionPane.showMessageDialog(null,n2+" es el menor");}
               }
           }
         }
       }
    }
  }  
}
