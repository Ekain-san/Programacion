/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

/**
 *
 * @author Asus
 */
import ejercicio2.Ejercicio2;
import vista.*;
import vista.vistaVer.*;
public class ControladorVentanas {
   private static VentanaPrincipal vp;
   private static VentanaDarAlta vd;
   private static VentanaCancelar vc;
   private static VentanaCambiar vca;
   private static VentanaVer vv;
   private static VentanaInscribir vi;
   private static VentanaAgregarEmpresa vap; 
   
   
    public static void iniciarPrograma() {
        vp.setVisible(true);
    }
    
    public static void pantallaAlta(){
        vp.setVisible(false);
        Ejercicio2.conectar();
        vd.setVisible(true);
    }
    
    public static void pantallaCancelar(){
        vp.setVisible(false);
        Ejercicio2.conectar();
        vc.setVisible(true);
    }
    
    public static void pantallaCambios(){
        vp.setVisible(false);
        Ejercicio2.conectar();
        vca.setVisible(true);
    }
    
     public static void pantallaInscribir(){
        vp.setVisible(false);
        Ejercicio2.conectar();
        vi.setVisible(true);
    }
     
    public static void pantallaAgregarEmpresa(){
        vp.setVisible(false);
        Ejercicio2.conectar();
        vap.setVisible(true);
    }
    
        public static void pantallaVer() {
        vp.setVisible(false);
        Ejercicio2.conectar();
        vv.setVisible(true);
    }
    
    public static void Salir(){
        System.exit(0);
    }

    public static void cancelar() {
        vc.cancelar();
    }

    public static void agregar() {
        vd.agregar();
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
        Ejercicio2.desconectar();
        vp.setVisible(true);
    }
}
