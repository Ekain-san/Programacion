/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;


/**
 *
 * @author Asus
 */

import controladores.*;
import clases.UML.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.*;
import java.time.ZoneId;
import javax.swing.JOptionPane;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
      
       
       private static Connection con;
       
       
       private static String ubicacion;

       
    public static void main(String[] args) {
        ControladorClases.accederClaseslBD();
    }

    public static void cercionar(String ventana) {
        VerificadorDeAccion.cercionar(ventana);
    }

    public static void iniciarPrograma() {
        ControladorVentanas.iniciarPrograma();
    }
    
    public static void pantallaAlta(){
        ControladorVentanas.pantallaAlta();
    }
    
    public static void pantallaCancelar(){
        ControladorVentanas.pantallaCancelar();
    }
    
    public static void pantallaCambios(){
        ControladorVentanas.pantallaCambios();
    }
    
     public static void pantallaInscribir(){
        ControladorVentanas.pantallaInscribir();
    }
     
    public static void pantallaAgregarEmpresa(){
        ControladorVentanas.pantallaAgregarEmpresa();
    }
    
    public static void pantallaVer() {
        ControladorVentanas.pantallaVer();
    }
    
    public static void Salir(){
        ControladorVentanas.Salir();
    }
    
    public static void conectar(){
        ControladorClases.conectar();
    }
    
    public static void desconectar(){
        ControladorClases.desconectar();
    }

    public static void volverAPrincipal(String ventana) {
        ControladorVentanas.volverAPrincipal(ventana);
    }

    public static boolean comprobar(String tipo, String ventana, String valor, String nombre, boolean seguir) {
        seguir=Comprobador.comprobar(tipo, ventana, valor, nombre, seguir);
        return seguir;
   }
    
    public static void cancelar(String nombre){
        ControladorClases.cancelar(nombre);
    }
    
    public static void cambiar(String nombreE, String tipo, String valor){
        ControladorClases.cambiar(nombreE, tipo, valor);
    }
    
    public static void cambiarD(String nombreE, String tipo, LocalDate valor){
        ControladorClases.cambiarD(nombreE, tipo, valor);
    }
    
    public static void cambiarH(String nombreE, String tipo, LocalTime valor){
        ControladorClases.cambiarH(nombreE, tipo, valor);
    }
    
     public static void darAlta(String nombre, String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo){
         ControladorClases.darAlta(nombre, ubicacion, fecha, horaI, horaF, aforo);
    }
     
     public  static Evento buscar(String nombre){
        Evento ev;
        ev=ControladorClases.buscar(nombre);
        return ev;
     }

    public static String tomarUbicacion() {
        ubicacion=ControladorClases.tomarUbicacion();
        return ubicacion;        
    }

    public static boolean ComprobarH(String tipo,String nombre, LocalTime hora, boolean seguir) {
        seguir=Comprobador.comprobarH(tipo, nombre, hora, seguir);
        return seguir;
    }

    public static boolean comprobarD(LocalDate dia, String nombre, boolean seguir) {
        seguir=Comprobador.comprobarD(dia, nombre, seguir);
        return seguir;
    }

    public static LocalDate sacarDia(String nombre, String tipo) {
        LocalDate dia;
        dia=ControladorClases.sacarDia(nombre, tipo);
        return dia;
    }

    public static LocalTime sacarHora(String nombre, String tipo) {
        LocalTime hora;
        hora=ControladorClases.sacarHora(nombre,tipo);
        return hora;
    }

    public static String sacarDato(String tipo, String nombre) {
        String dato;
        dato= ControladorClases.sacarDato(tipo, nombre);
        return dato;
    }
}
