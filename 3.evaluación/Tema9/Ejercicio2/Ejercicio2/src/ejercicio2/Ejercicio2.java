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
import clases.UML.*;
import clases.BD.*;
import vista.*;
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
       private static VentanaCambiar vca;
       private static VentanaVer vv;
       private static VentanaInscribir vi;
       private static VentanaAgregarEmpresa vap;
       
       private static BD bd;
       private static BDEventos bde;
       private static BDEmpresas bdem;
       private static BDAsistentes bda;
       private static BDPersonas bdp;
       
       private static Evento ev;
       private static Empresa em;
       private static Persona pe;
       
       private static Connection con;
       
       private static String otro;
       private static String estarSeguro;
       private static String ubicacion;

       
    public static void main(String[] args) {
        vp = new VentanaPrincipal();
        vd = new VentanaDarAlta();
        vc = new VentanaCancelar();
        vv = new VentanaVer();
        vi = new VentanaInscribir();
        vap= new VentanaAgregarEmpresa();
        
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
        iniciarPrograma();
    }

    public static void cercionar(String ventana) {
        if(estarSeguro.equals("sí")){
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
    
     public static void pantallaInscribir(){
        vp.setVisible(false);
        bd.conectar();
        vi.setVisible(true);
    }
     
    public static void pantallaAgregarEmpresa(){
        vp.setVisible(false);
        bd.conectar();
        vap.setVisible(true);
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

    public static boolean comprobar(String tipo, String ventana, String valor, String nombre, boolean seguir) {
        if(valor.isEmpty()){
            if(tipo.equals("nombreE")){
                JOptionPane.showMessageDialog(null,"Tiene que rellenar el apartado del nombre del acontecimiento cuyos datos desea cambiar");
                return seguir=false;
            }
            else{
                if(ventana.equals("cancelar")){
                    JOptionPane.showMessageDialog(null,"Tiene que rellenar el apartado del nombre del acontecimiento que desea cancelar");
                return seguir=false;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Tiene que rellenar el apartado "+tipo);
                    return seguir=false;
                }
            }
        }
        else{
            String dato;
            dato= bde.sacarDato(tipo, nombre);

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

    public static boolean ComprobarH(String tipo,String nombre, LocalTime hora, boolean seguir) {
        LocalTime horaC=bde.sacarHora(nombre, tipo);
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
        LocalDate diaC=bde.sacarDia(nombre, tipo);
        if(dia.equals(diaC)){
            JOptionPane.showMessageDialog(null, "Ya tenía esta fecha cuando fue creada");
            return seguir=false;
        }
        else{
            return seguir=true;
        }
    }

    public static void pantallaVer() {
        vp.setVisible(false);
        bd.conectar();
        vv.setVisible(true);
    }
}
