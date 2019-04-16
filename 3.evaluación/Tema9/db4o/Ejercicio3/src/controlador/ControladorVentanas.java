/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.*;

/**
 *
 * @author Asus
 */
public class ControladorVentanas {
    
    private static VentanaCasos vcs;
    private static VentanaCaso vc;
    private static VentanaPrincipal vp;
    private static VentanaBaja vb;
    private static VentanaAlta va;
    
    public static void crear() {
        vcs = new VentanaCasos();
        vp = new VentanaPrincipal();
        vb = new VentanaBaja();
        va = new VentanaAlta();
    }
    
    public static void establecerFuncion(String funcion, int caso) {
        vc = new VentanaCaso(funcion);
        vc.establecerCaso(caso);
        vcs.setVisible(false);
        vc.setVisible(true);
    }

    public static void iniciarPrograma() {
        vp.setVisible(true);
    }
    
    public static void cambiarPantalla(String ventana){
        vp.setVisible(false);
        switch (ventana){
            case "caso": vcs.setVisible(true);
                break;
            case "baja": vb.setVisible(true);
                break;
            case "alta": va.setVisible(true);
                break;
        }
    }
    
    public static void volverAAnterior(String ventana){
        switch (ventana){
            case "casos": vcs.setVisible(false);
                          vp.setVisible(true);
                break;
            case "baja": vb.setVisible(false);
                         vp.setVisible(true);
                break;
            case "alta": va.setVisible(false);
                         vp.setVisible(true);
                break;
            case "case": vc.setVisible(false);
                         vcs.setVisible(true);
                break;
        }
    }
}
