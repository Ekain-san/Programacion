/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int aprobado=0;
    String sigla= "a";
    do 
    {
      int  nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota"));  
      aprobado= ContadorAprobados (nota, aprobado);
      sigla= JOptionPane.showInputDialog("Si desea seguir introduce r");
    }while ("r".equals(sigla));
    JOptionPane.showMessageDialog(null,"La cantidad de aprobados es "+aprobado);
  }
  public static int ContadorAprobados (int nota, int aprobado)  
  {
     if(nota>=0&&nota<=10)
        {
            if(nota>=6)
            {
                aprobado=aprobado+1;
            }
        }
     else
     {
         JOptionPane.showMessageDialog(null, "Error, nota no valida");
     }
     return aprobado;
   }
}
