/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import ejercicio2.Ejercicio2;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Comprobador {
    public static boolean comprobarH(String tipo,String nombre, LocalTime hora, boolean seguir) {
        LocalTime horaC=Ejercicio2.sacarHora(nombre, tipo);
        if(hora.equals(horaC)){
            JOptionPane.showMessageDialog(null, "Ya tenía esta hora cuando fue creada");
        }       
        return seguir=true;
        
    }

    public static boolean comprobarD(LocalDate dia, String nombre, boolean seguir) {
        String tipo = "fecha";
        LocalDate diaC=Ejercicio2.sacarDia(nombre, tipo);
        if(dia.equals(diaC)){
            JOptionPane.showMessageDialog(null, "Ya tenía esta fecha cuando fue creada");
        }
        return seguir=true;
    }
    
    public static boolean comprobar(String tipo, String ventana, String valor, String nombre, boolean seguir) {
        String dato;
        dato= Ejercicio2.sacarDato(tipo, nombre);
        
        if(dato.equals(valor)){
            switch(ventana){
                case "alta": JOptionPane.showMessageDialog(null, "Ya exista este acontecimiento");
                    return seguir=false;

                case "inscribir": switch(tipo){
                    case "nombre":return seguir=true;
                    case "dni":
                }
                    
                    
                    
                case "agregar": JOptionPane.showMessageDialog(null, "Ya exista este Empresa");
                    return seguir=false;
                    
                default: 
                    if(ventana.equals("cambiar")){
                        JOptionPane.showMessageDialog(null, "Estos datos ya fueron introducidos previamente cuando el elemento fue creado");
                        return seguir=false;
                    }
                    else
                        return seguir=true;
                }
        }

        else if(!dato.equals(valor)){
            switch(tipo){
                case "nombreE": 
                    switch(ventana){
                        case"cambiar": 
                        case "verEvento":
                            JOptionPane.showMessageDialog(null, "Este acontecimiento no existe");
                            return seguir=false;
                            
                        case "verEmpresa":
                            JOptionPane.showMessageDialog(null, "Esta empresa no existe");
                            return seguir=false;
                    
                        case"verPersona":
                            JOptionPane.showMessageDialog(null, "Esta persona no existe");
                            return seguir=false;
                    }
                    
                case "nombre":
                    if(ventana.equals("cancelar")){
                        return seguir=false;
                    }
                    else
                       return seguir=true; 
                        
                default: return seguir=true;
            }
        }
        
        else{
            return seguir=true;
        }
    }
}
