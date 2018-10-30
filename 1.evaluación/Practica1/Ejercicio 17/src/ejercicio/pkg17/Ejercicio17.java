/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minimo=10;
        int maximo=0;
        int veces=0;
        String nombre_ma="a";
        String nombre_mi="a";
        while (veces!=40)
        {
            String nombre=JOptionPane.showInputDialog("Introduce nombre de alubno");
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota de alubno"));
            if(nota>=0&&nota<=10)
            {
                if(nota>maximo)
                {
                    nombre_ma=nombre;
                    maximo=nota;
                 }
              else
                {
                    nombre_mi=ContadorMin(nombre_mi,nota,nombre,minimo);
                }  
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error, nota no valida");
            }
        }
        JOptionPane.showMessageDialog(null,nombre_ma+" tiene la nota más alta con un "+maximo+" y "+nombre_mi+" la más bajs con un "+minimo);
    }
    public static String ContadorMin (String nombre_mi, int nota, String nombre, int minimo)
    {
        
        if(minimo>nota)
        {
            nombre_mi=nombre;
            minimo=nota;
        }
        return nombre_mi;
    }
}
