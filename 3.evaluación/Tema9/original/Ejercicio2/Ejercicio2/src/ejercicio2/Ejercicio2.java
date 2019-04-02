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
        ControladorVentanas.iniciarPrograma();
    }

    public static void cercionar(String ventana) {
        VerificadorDeAccion.cercionar(ventana);
    }

    public static void iniciarPrograma() {
        ControladorVentanas.iniciarPrograma();
    }
    
    public static void cambiarPantalla(String ventana){
        ControladorVentanas.cambiarPantalla(ventana);
    }
    
    public static void salir(){
        ControladorVentanas.salir();
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

    public static String tomarUbicacion() {
        ubicacion=ControladorClases.tomarUbicacion();
        return ubicacion;        
    }

    public static boolean comprobarH(String tipo,String nombre, LocalTime hora, boolean seguir) {
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

    public static void verOtro(String ventana) {
        ControladorVentanas.verOtro(ventana);
    }
    
    public static void volverAMenuVer(String ventana){
        ControladorVentanas.volverAMenuVer(ventana);
    }

    public static LocalTime sacarValorH(String tipo, String nombre) {
       LocalTime hora=ControladorClases.sacarHora(nombre, tipo);
       return hora;
    }

    public static String sacarValor(String tipo, String nombre,String ventana) {
        String valor;
        valor= ControladorClases.sacarValor(tipo, nombre,ventana);
        return valor;
    }

    public static LocalDate sacarValorF(String tipo, String nombre) {
        LocalDate dia=ControladorClases.sacarDia(nombre, tipo);
        return dia;
    }

    public static void cancelar() {
        ControladorVentanas.cancelar();
    }

    public static void agregar() {
        ControladorVentanas.agregar();
    }

    public static void darAlta() {
        ControladorVentanas.darAlta();
    }

    public static void inscribir() {
        ControladorVentanas.inscribir();
    }

    public static void vaciar(String ventana) {
        ControladorVentanas.vaciar(ventana);
    }

    public static void agregar(String nombre, String direccion, String telefono) {
        ControladorClases.agregar(nombre, direccion, telefono);
    }

    public static void añadir() {
        ControladorVentanas.añadir();
    }
}
