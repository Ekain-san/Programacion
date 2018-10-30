/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int person=0;
    int niño_v=0;
     int niña_v=0;
     while (person!=30)
            {
                String nombre=JOptionPane.showInputDialog("introduce nombre");
                String genero=JOptionPane.showInputDialog("introduce genero, niño o niña");  
                double metro = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura en metros"));
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad en años"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce peso"));
                switch(genero)
                {
                    case "niño": niño_v= ContadorDeNiñosValidas (metro,niño_v,peso);
                    break;
                     case "niña": niña_v= ContadorDeNiñosValidas (metro,niña_v,peso);
                    break;
                     default: JOptionPane.showMessageDialog(null,"Error, pruebe con niño o niña");
                }
            person=person+1;
            }
    JOptionPane.showMessageDialog(null,niño_v+" niños y "+niña_v+" niñas pueden jugar a baloncesto");
    }
 public static int ContadorDeNiñasValidas (double metro,int niña_v, double peso)
 {
     if(metro>1.6&&peso>60)
         {
             niña_v=niña_v+1;
         }
     return niña_v;
 }
  public static int ContadorDeNiñosValidas (double metro, int niño_v, double peso)
 {
     if(metro>1.7&&peso>70)
     {
             niño_v=niño_v+1;
     }
 return niño_v;
  }
}
