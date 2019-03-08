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
       private static Conection con;
    
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
    
    public void agregar(String nombre, String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo){
        ev= new Evento(nombre,ubicacion, fecha, horaI, horaF, aforo);
        bde.agregar(ev);
    }
    
    public void cancelar(String nombre){
        bde.cancelar(nombre);
    }
    
    public void cambiar(String nombreE, String nombre, String ubicacion, LocalDate fecha, LocalTime horaI, LocalTime horaF, String aforo){
    ev= new Evento(nombre,ubicacion, fecha, horaI, horaF, aforo);
    bde.cambiar(nombreE,ev);
}
    
}
