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
            return seguir=false;
        }
        else{
            return seguir=true;
        }
    }

    public static boolean comprobarD(LocalDate dia, String nombre, boolean seguir) {
        String tipo = "fecha";
        LocalDate diaC=Ejercicio2.sacarDia(nombre, tipo);
        if(dia.equals(diaC)){
            JOptionPane.showMessageDialog(null, "Ya tenía esta fecha cuando fue creada");
            return seguir=false;
        }
        else{
            return seguir=true;
        }
    }
    
    public static boolean comprobar(String tipo, String ventana, String valor, String nombre, boolean seguir) {
        String dato;
        dato= Ejercicio2.sacarDato(tipo, nombre);

        if(dato.equals(valor) && ventana.equals("alta")){
            JOptionPane.showMessageDialog(null, "Ya exista este acontecimiento");
            return seguir=false;   
        }

        else{
            if(!dato.equals(valor)&& tipo.equals("nombreE")){
                JOptionPane.showMessageDialog(null, "Este acontecimiento no existe");
                return seguir=false;
            }

            else{
                if(dato.equals(valor)&&!tipo.equals("nombreE")&&ventana.equals("cambiar")){
                    JOptionPane.showMessageDialog(null, "Estos datos ya fueron introducidos previamente cuando el elemento fue creado");
                    return seguir=false;
                }
                else{
                    if(!dato.equals(valor)&& tipo.equals("nombre") && ventana.equals("cancelar")){
                        JOptionPane.showMessageDialog(null, "Este acontecimiento no existe");
                        return seguir=false;
                    }
                    
                    else
                        return seguir=true;
                }   
            }   
        }
    }
}
