/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clases.BD.BD;
import clases.BD.BDAsistentes;
import clases.BD.BDEmpresas;
import clases.BD.BDEventos;
import clases.BD.BDPersonas;
import clases.UML.Empresa;
import clases.UML.Evento;
import clases.UML.Persona;
import ejercicio2.Ejercicio2;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class ControladorClases {
    private static BD bd;
    private static BDEventos bde;
    private static BDEmpresas bdem;
    private static BDAsistentes bda;
    private static BDPersonas bdp;
       
    private static Evento ev;
    private static Empresa em;
    private static Persona pe;
    
    private static Connection con;
    private static String ubicacion;
    
    public static void accederClaseslBD(){
        bd = new BD();
        
        con=bd.conectar();
        if (con == null){
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
        }
        bde = new BDEventos(con);
        bdem = new BDEmpresas(con);
        bda = new BDAsistentes(con);
        bdp = new BDPersonas(con);
        bd.desconectar();
        Ejercicio2.iniciarPrograma();
    }

    public static void cancelar(String nombre){
        bde.cancelar(nombre);
    }
    
    public static void cambiar(String nombreE, String tipo, String valor){
    bde.cambiar(nombreE, tipo, valor);
    }
    
    public static void cambiarD(String nombreE, String tipo, LocalDate valor){
        bde.cambiarD(nombreE, tipo, valor);
    }
    
    public static void cambiarH(String nombreE, String tipo, LocalTime valor){
        bde.cambiarT(nombreE, tipo, valor);
    }
    
     public static void darAlta(String nombre, String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo){
        ev= new Evento(nombre,ubicacion, fecha, horaI, horaF, aforo);
        bde.darAlta(ev);
    }
     
    public static String tomarUbicacion() {
        ubicacion=bde.tomarUbicacion();
        return ubicacion;        
    }
     
    public static Evento buscar(String nombre){
       ev=bde.consultar(nombre); 
       return ev;
    }

    public static void conectar() {
        bd.conectar();
    }
    
    public static void desconectar(){
        bd.desconectar();
    }
    
    public static String sacarDato(String tipo, String nombre){
        String dato;
        dato=bde.sacarDato(tipo, nombre);
        return dato;
    }

    public static LocalDate sacarDia(String nombre, String tipo) {
        LocalDate dia;
        dia=bde.sacarDia(nombre, tipo);
        return dia;
    }

    public static LocalTime sacarHora(String nombre, String tipo) {
        LocalTime hora;
        hora=bde.sacarHora(nombre,tipo);
        return hora;
    }
   
}
 