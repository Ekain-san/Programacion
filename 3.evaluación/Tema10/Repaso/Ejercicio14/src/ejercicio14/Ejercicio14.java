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
    
    private static int x;
    private static int y;
    private static String tipo;
    
    private static Persona per;
    
    private static Matcher mat;
    private static Pattern pat = Pattern.compile("^[0-9]{9}[A-Z]$");
    private static Pattern pat2 = Pattern.compile("^[A-Z][a-z]*$");
    private static Pattern pat3 = Pattern.compile("^[A-Z][ ]+[A-Z]+[a-z]*[A-Z]+[a-z]*$");
    private static Pattern pat4 = Pattern.compile("^)(hombre|mujer)??{hm}?$");
    private static Pattern pat5 = Pattern.compile("^[1]?[0-9]*$");
    private static Pattern pat6 = Pattern.compile("^[1]?[0-9][0-9],[0-9]{2}$");
    
    private static int opcion;
    private static String listaString;
    
    public static void main(String[] args) {
        rellenar();
        seleccionar();
        ejecutar();
    }

    private static void rellenar() {
        boolean seguir;
        
        do{
            try{
                dni = JOptionPane.showInputDialog("Introduzca DNI");
                tipo = "DNI";
                comprobador();
                
                nombre = JOptionPane.showInputDialog("Introduzca nombre");
                tipo = "nombre";
                comprobador();
                
                apellidos = JOptionPane.showInputDialog("Introduzca apellidos");
                tipo = "apellidos";
                comprobador();
                
                sexo = JOptionPane.showInputDialog("Introduzca sexo"
                                                 + "sólo se puede hombre o mujer, o h o m").toLowerCase();
                tipo = "sexo";
                comprobador();
                
                edad = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca edad"));
                tipo = "edad";
                comprobador();
                
                peso = Double.parseDouble(JOptionPane.showInputDialog ("Introduzca peso"
                                                                     + "\n En kilogramos '..,..' "));
                tipo = "peso";
                comprobador();
                
                per = new Persona (dni, nombre, apellidos, sexo, edad, peso);
                lista.add(per);
                x = JOptionPane.showConfirmDialog(null, "Desea añadir otra persona");
                switch(x){
                    case 0: seguir = true;
                        break;
                    default: seguir = false;
                        break;
                }
                
            }
            
            catch(Exception e){
               JOptionPane.showMessageDialog(null, "Datos no validos. Introduzcalos de nuevo");
               seguir = true; 
            }
           
        }while (seguir = true);
    }

    private static void comprobador() throws Exception {
        switch (tipo.toLowerCase()){
            case "dni":mat = pat.matcher(dni);
            if (mat.matches()==false)
                throw new datoSinSentido();
                   
            case "nombre": mat = pat2.matcher(nombre);
            if (mat.matches()==false)
                throw new datoSinSentido();
            
            case "apellidos": mat = pat3.matcher(apellidos);
            if (mat.matches()==false)
                throw new datoSinSentido();
            
            case "sexo": mat = pat4.matcher(sexo);
            if (mat.matches()==false)
                throw new datoSinSentido();
            
            case "edad": mat = pat5.matcher(edad.toString());
            if (mat.matches()==false)
                throw new datoSinSentido();
            
            case "peso": mat = pat6.matcher(peso.toString());
            if (mat.matches()==false)
                throw new datoSinSentido();
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
        try{
            dni = JOptionPane.showInputDialog("Introduzca DNI");
            tipo = "DNI";
            comprobador();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "DNI no valido");
        }
        
        for (x=0;x<lista.size()&&!lista.get(x).getDni().equals(dni);x++){
            
        }
        
        if(x==lista.size())
            JOptionPane.showMessageDialog(null, "DNI no encontrado");
        else
            JOptionPane.showMessageDialog(null, "DNI encontrado");
    }

    private static void eliminar() {
        try{
            dni = JOptionPane.showInputDialog("Introduzca DNI");
            tipo = "DNI";
            comprobador();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "DNI no valido");
        }
        
        for (x=0;x<lista.size();x++){
            if(lista.get(x).getDni().equals(dni)){
                lista.remove(x);
                JOptionPane.showMessageDialog(null, "Persona borrada en la posición: " + x);
            }
        }
    }

    private static void ordenar() {
        for (x=0;x<lista.size();x++){
            per = lista.get(x);
            for(y=x+1;y<lista.size();y++){
                if(lista.get(y).getApellidos().compareToIgnoreCase(per.getApellidos()) < 0)
                    per = lista.get(y);
            }
            lista.set(x, per);
        }
    }

    private static void mostrar() {
        try{
            dni = JOptionPane.showInputDialog("Introduzca DNI");
            tipo = "DNI";
            comprobador();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "DNI no valido");
        }
        
        for (x=0;x<lista.size()&&!lista.get(x).getDni().equals(dni);x++){
            
        }
        
        if(x==lista.size())
            JOptionPane.showMessageDialog(null, "DNI no encontrado");
        else
            JOptionPane.showMessageDialog(null, "DNI: " + lista.get(x).getDni()
                                              + "\n Nombre: " + lista.get(x).getNombre()
                                              + "\n Apellidos: " + lista.get(x).getApellidos()
                                              + "\n Sexo: " + lista.get(x).getSexo()
                                              + "\n Edad: " + lista.get(x).getEdad()
                                              + "\n Peso: " + lista.get(x).getPeso());
    }
}
