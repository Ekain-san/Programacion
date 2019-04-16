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
   
   public static void crear(){
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
       
    public static void cambiarPantalla(String ventana){
        vp.setVisible(false);
        switch (ventana){
            case "alta":va.setVisible(true);
                break;
            case "cancelar":vc.setVisible(true);
                break;
            case "cambiar": vca.setVisible(true);
                break;
            case "agregar":ve.setVisible(true);
                break;
            case "inscribir":vi.setVisible(true);
                break;
            case "ver":vv.setVisible(true);
                break;
        }
    }
    
    public static void salir(){
        System.exit(0);
    }

    public static void cancelar() {
        vc.cancelar();
    }

    public static void darAlta(){
        va.darAlta();
    }
    
    public static void agregar() {
        ve.agregar();
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

    public static void vaciar(String ventana) {
        switch (ventana){
            case "agregar":ve.removeAll();
                           ve.revalidate();
                           ve.repaint();
                           break;
                           
            case "alta":va.removeAll();
                        va.revalidate();
                        va.repaint();
                        break;
                        
            case "inscribir":ve.removeAll();
                             ve.revalidate();
                             ve.repaint();
                             break;
        }
    }

    public static void inscribir() {
        vi.inscribir();
    }

    public static void añadir() {
        vi.añadir();
    }
}
