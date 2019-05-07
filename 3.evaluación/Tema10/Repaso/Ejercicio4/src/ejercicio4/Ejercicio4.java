/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    private static int [] posicion;
    private static String [] alumno;
    private static String [] calificacion;
    private static double [] nota;
    private static int x;
    private  static String datos = "";
    
    public static void main(String[] args) {
       creadorLista();
        clasificador();
        aula();
        calificador();
        seleccionador();
    }

    private static void creadorLista() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alubnos"));
        posicion = new int [x];
        alumno = new String [x];
        calificacion = new String [x];
        nota = new double [x];
    }
    
    private static void clasificador() {
        for (x=0; x<posicion.length; x++){
            posicion [x] = x+1;
        }
    }

    private static void aula() {
        for (x=0; x<alumno.length; x++){
            alumno [x] = JOptionPane.showInputDialog("Introduce nombre de alumno");
        }
    }

    private static void calificador() {
         for (x=0; x<nota.length; x++){
             nota [x] = Double.parseDouble(JOptionPane.showInputDialog("Introduzca nota de alumno"));
             while (nota[x]<0 || nota[x]>10){
                nota [x] = Double.parseDouble(JOptionPane.showInputDialog("Introduzca nota de alumno de nuevo")); 
             }
             darCalficacion();
        }
    }

    private static void darCalficacion() {
        if (nota[x]<5)
            calificacion[x]= "Suspenso";
        else{
            if (nota[x]>4.99 && nota[x]<7)
                calificacion[x]= "Bien";
            else{
                if (nota[x]>6.99 && nota[x]<9)
                    calificacion[x]= "Notable";
                else
                    calificacion[x]= "Sobresaliente";
            }
        }
    }

    private static void seleccionador() {
        int y = posicion.length + 1;
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero cuya información desea saber "
                                                       + "\n"+ y + " para el de todos los alumnos"));
        if (x==y){
            for(x=0;x<posicion.length;x++){
                datos = datos + "\n numero: " + posicion[x] + "  nombre: " + alumno[x] + "  nota: "+nota[x] + "  calificación: "+calificacion[x];
            }
        }
        
        else{
            x = x - 1;
            datos = datos + " Numero: " + posicion[x] + "\n Nombre: " + alumno[x] + "\n Nota: "+nota[x] + "\n Calificación: "+calificacion[x];
        }
    
        JOptionPane.showMessageDialog(null, datos);
    }
}
