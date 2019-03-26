/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;
import vista.*;

/**
 *
 * @author Asus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    private static VentanaCambiar vc;
    private static VentanaCancelar vca;
    private static VentanaDarAlta va;
    private static VentanaPrincipal vp;
    private static VentanaVer vv;
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void volverAPrincipal(String ventana) {
        switch(ventana){
            case "cambios":vca.setVisible(false);
                        break;
            case "alta":va.setVisible(false);
                        break;
            case "cancelar":vc.setVisible(false);
                        break;
            case "ver":vv.setVisible(false);
                        break;
        }
        Ejercicio2.desconectar();
        vp.setVisible(true);
    }

    public static void cambiarH(String text, String tipo, LocalTime hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void cambiarD(String text, String tipo, LocalDate dia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void cambiar(String text, String tipo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String tomarUbicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean comprobar(String tipo, String ventana, String valor, String text, boolean seguir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void cambiarPantalla(String ventana) {
        vp.setVisible(false);
        switch(ventana){
            case "alta": va.setVisible(true);
                break;
            case "cancelar":vca.setVisible(true);
                break;
            case "cambiar":vc.setVisible(true);
                break;
            case "ver":vv.setVisible(true);
                break;
        }   
    }

    public static void salir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void cancelar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void cercionar(String ventana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void darAlta(String text, String text0, LocalDate date, LocalTime time, LocalTime time0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void desconectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LocalDate sacarvalorF(String tipo, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String sacarvalor(String tipo, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LocalTime sacarvalorH(String tipo, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
