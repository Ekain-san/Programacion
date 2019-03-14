/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Asus
 */import vista.*;
    import clases.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.*;
import java.time.ZoneId;
import javax.swing.JOptionPane;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */private static VentanaPrincipal vp;
       private static VentanaDarAlta vd;
       private static VentanaCancelar vc;
       private static VentanaCambios vca;
       private static BD bd;
       private static BDEventos bde;
       private static Evento ev;
       private static Connection con;
       private static String otro;
       private static String estarSeguro;
       private static String ubicacion;

    public static void cambiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void cercionar(String ventana) {
        if(ventana.equals("cambiar") ||ventana.equals("alta")|| ventana.equals("cancelar")){
            boolean esta;
            esta=comprobar(ventana);
            if (esta=true){
            estarSeguro=seguridad();
            }
            else{
                JOptionPane.showMessageDialog(null, "ha metido datos no validos");
            }
        }
        if(estarSeguro.equals("sí")){
            if(ventana.equals("cambiar"))
                vca.cambiar();
            if(ventana.equals("cancelar"))
                vc.cancelar();
                if(ventana.equals("agregar"))
                vd.agregar();
            otro=seguir();
        }
        
        else{
            volverAPrincipal(ventana);
        }
        
        if(otro.equals("no")){
            volverAPrincipal(ventana);
        }
    }

    private static boolean comprobar(String ventana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        vp = new VentanaPrincipal();
        vd = new VentanaDarAlta();
        vc = new VentanaCancelar();
        bd = new BD();
        con=bd.conectar();
        if (con == null){
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
        }
        bd.desconectar();
        bde = new BDEventos(con);
        iniciarPrograma();
    }

    private static void iniciarPrograma() {
        vp.setVisible(true);
    }
    
    public static void pantallaAlta(){
        vp.setVisible(false);
        bd.conectar();
        vd.setVisible(true);
    }
    
    public static void pantallaCancelar(){
        vp.setVisible(false);
        bd.conectar();
        vc.setVisible(true);
    }
    
    public static void pantallaCambios(){
        vp.setVisible(false);
        bd.conectar();
        vca.setVisible(true);
    }
    
    public static void Salir(){
        System.exit(0);
    }
    
    public static void desconectar(){
        bd.desconectar();
    }

    public static void volverAPrincipal(String ventana) {
        switch(ventana){
            case "cambios":vca.setVisible(false);
                           break;
            case "alta":vd.setVisible(false);
                        break;
            case "cancelar":vc.setVisible(false);
                            break;
        }
        bd.desconectar();
        vp.setVisible(true);
    }

    public static void comprobar(String tipo, String ventana, String valor, String nombre) {
        String dato; 
        dato= bde.sacarDato(tipo, nombre);
        
        if(dato.equals(valor) && ventana.equals("alta"))
            JOptionPane.showMessageDialog(null, "");
    }
    
    public static void cancelar(String nombre){
        bde.cancelar(nombre);
    }
    
    public static void cambiar(String nombre, String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo){
    ev= new Evento(nombre,ubicacion, fecha, horaI, horaF, aforo);
    bde.cambiar(ev);
    }
    
     public static void darAlta(String nombre, String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo){
    
    ev= new Evento(nombre,ubicacion, fecha, horaI, horaF, aforo);
    bde.darAlta(ev);
    }
     
     public static void buscar(String nombre){
        String valor=bde.consultar(nombre); 
     }
     
      private static String seguridad() {
        estarSeguro=JOptionPane.showInputDialog("¿Esta seguro? N (no), s (sí)");
        switch (estarSeguro){
            case "s": estarSeguro="sí";
                      break;
            case "S": estarSeguro="sí";
                      break;
            case "n": estarSeguro="no";
                      break;
            case "N": estarSeguro="no";
                      break;
            default: estarSeguro="no";
                      break;
        }; 
        return estarSeguro;
    }

    private static String seguir() {
        otro=JOptionPane.showInputDialog("¿Desea hacer más? N (no), s (sí)");
        switch (otro){
            case "s": otro="sí";
                      break;
            case "S": otro="sí";
                      break;
            case "n": otro="no";
                      break;
            case "N": otro="no";
                      break;
            default: otro="no";
                      break;
        }; 
        return estarSeguro;
    }

    public static String tomarUbicacion() {
        ubicacion=bde.tomarUbicacion();
        return ubicacion;
        
    }

    public static void ComprobarH(String tipo,String nombre, LocalTime hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void comprobarD(LocalDate dia, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
