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
   private static VentanaAlta va;
   private static VentanaCancelar vc;
   private static VentanaCambiar vca;
   private static VentanaVer vv;
   private static VentanaInscribir vi;
   private static VentanaAgregarE ve; 
   
   private static VentanaVEmpresa vvm;
   private static VentanaVEvento vve;
   private static VentanaVPersona vvp;
   
   private static void crear(){
       vp= new VentanaPrincipal();
       va= new VentanaAlta();
       vc=new VentanaCancelar();
       vca= new VentanaCambiar();
       vv= new VentanaVer();
       vi= new VentanaInscribir();
       ve=new VentanaAgregarE();
       
       vvm=new VentanaVEmpresa();
       vve=new VentanaVEvento();
       vvp=new VentanaVPersona();
   }
   
    public static void iniciarPrograma() {
        vp.setVisible(true);
    }
    
    public static void pantallaAlta(){
        vp.setVisible(false);
        Ejercicio2.conectar();
        va.setVisible(true);
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
        ve.setVisible(true);
    }
    
        public static void pantallaVer() {
        vp.setVisible(false);
        Ejercicio2.conectar();
        vv.setVisible(true);
    }
    
    public static void salir(){
        System.exit(0);
    }

    public static void cancelar() {
        vc.cancelar();
    }

    public static void agregar() {
        va.agregar();
    }
    
    public static void volverAPrincipal(String ventana) {
        Ejercicio2.desconectar();
        switch(ventana){
            case "cambios":vca.setVisible(false);
                        break;
            case "alta":va.setVisible(false);
                        break;
            case "cancelar":vc.setVisible(false);
                        break;
            case "ver":vv.setVisible(false);
                        break;
            case "agregar":ve.setVisible(false);
                        break;
            case "inscribir": vi.setVisible(false);
                        break;
        }
        Ejercicio2.desconectar();
        vp.setVisible(true);
    }

    public static void verOtro(String ventana) {
        vv.setVisible(false);
        Ejercicio2.conectar();
        switch(ventana){
            case "verEvento":vve.setVisible(true);
                break;
            case "verEmpresa":vvm.setVisible(true);
                break;
            case "verPersona":vvp.setVisible(true);
                break;
        }
    }
    
    public static void volverAMenuVer(String ventana) {
        Ejercicio2.desconectar();
        switch(ventana){
            case "verEvento":vve.setVisible(false);
                break;
            case "verEmpresa":vvm.setVisible(false);
                break;
            case "verPersona":vvp.setVisible(false);
                break;
        }
        vv.setVisible(true);
    }
}
