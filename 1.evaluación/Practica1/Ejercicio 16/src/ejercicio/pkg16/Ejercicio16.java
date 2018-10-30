/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double media=0;
        int edad_g=0;
        int person=0;
        String sigla= "r";
        while("r".equals(sigla))
        {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad en años"));
            media=ContadorMedia(media,person,edad_g,edad);
            sigla = JOptionPane.showInputDialog("Introduce r si quieres seguir");
        }
        JOptionPane.showMessageDialog(null,"La media de edades es: "+media);
    }
    public static double ContadorMedia (double media, int person, int edad_g,int edad)
    {
        if(edad>=0)
        {
            edad_g=edad_g+edad;
            person=person+1;
            media=edad_g/person;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error, edad no valida");
        }
        return media;
    }
}
