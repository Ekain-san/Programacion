/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import Clases.Persona;
import excepcion.datoSinSentido;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Persona> lista = new ArrayList<Persona>();
    private static String dni;
    private static String nombre;
    private static String apellidos;
    private static String sexo;
    private static Integer edad;
    private static Double peso;
    private static boolean valido;
    
    private static Persona per;
    
    private static Matcher mat;
    private static Pattern pat = Pattern.compile("^[0-9]{9}[A-Z]$");
    private static Pattern pat2 = Pattern.compile("^[A-Z][a-z]*$");
    private static Pattern pat3 = Pattern.compile("^[A-Z][ ]+[A-Z]+[a-z]*[A-Z]+[a-z]*$");
    private static Pattern pat4 = Pattern.compile("^$");
    private static Pattern pat5 = Pattern.compile("^[1]?[0-9]*$");
    private static Pattern pat6 = Pattern.compile("^[0-2],[0-9]{2}$");
    
    private static int opcion;
    
    public static void main(String[] args) {
        rellenar();
        seleccionar();
        ejecutar();
    }

    private static void rellenar() {
        boolean seguir;
        int x;
        
        do{
           dni = JOptionPane.showInputDialog("Introduzca DNI");
           nombre = JOptionPane.showInputDialog("Introduzca nombre");
           apellidos = JOptionPane.showInputDialog("Introduzca apellidos");
           sexo = JOptionPane.showInputDialog("Introduzca sexo");
           edad = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca edad"));
           peso = Double.parseDouble(JOptionPane.showInputDialog ("Introduzca peso"
                                                                + "\n En kilogramos"));
           comprobador();
           if (valido = true){
                per = new Persona (dni, nombre, apellidos, sexo, edad, peso);
                lista.add(per);
                x = JOptionPane.showConfirmDialog(null, "Desea añadir otra persona");
                switch(x){
                    
                }
           }
           
           else
           {    
               JOptionPane.showMessageDialog(null, "Datos no validos. Introduzcalos de nuevo");
               seguir = true;
           }
           
        }while (seguir = true);
    }

    private static void comprobador() {
        try{
            mat = pat.matcher(dni);
            if (mat.matches()){
                mat = pat2.matcher(nombre);
                if (mat.matches()){
                    mat = pat3.matcher(apellidos);
                    if (mat.matches()){ 
                        mat = pat4.matcher(sexo);
                        if (mat.matches()){
                            mat = pat5.matcher(edad.toString());
                            if (mat.matches()){
                                mat = pat6.matcher(peso.toString());
                                if (mat.matches()){
                                    valido = true;
                                }
                                else
                                    throw new datoSinSentido();
                            }
                            else
                                throw new datoSinSentido();
                        }
                        else
                           throw new datoSinSentido();
                    }
                    else
                       throw new datoSinSentido();
                 }
                else
                    throw new datoSinSentido();
            }
            else
                throw new datoSinSentido();
        }
        
        catch(Exception e){
            valido = false;
        }
        
    }
    
    private static void seleccionar() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una de las siguientes opciones"
                                                            + "\n 1. Buscar por DNI"
                                                            + "\n 2. Eliminar una persona"
                                                            + "\n 3. Ordenador por apellidos"
                                                            + "\n 4. Mostrar todo"));
    }

    private static void ejecutar() {
        switch(opcion){
            case 1: buscar();
                break;
            case 2: eliminar();
                break;
            case 3: ordenar();
                break;
            case 4: mostrar();
                break;
        }
    }    

    private static void buscar() {
        
    }

    private static void eliminar() {
        
    }

    private static void ordenar() {
        
    }

    private static void mostrar() {
        
    }
}
