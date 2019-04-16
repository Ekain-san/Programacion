/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.BD.*;
import clases.UML.*;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ControladorClases {
    private static BD bd;
    private static BDAbogados bda;
    private static BDCasos bdca;
    private static BDClientes bdcl;
    private static BDJuicios bdj;

    private static Connection con;
    
    public static void accederClasesBD() {
        bd= new BD();
        
        con=bd.conectar();
        if(con==null){
        } else {
            System.out.println("Problemas con la base de datos");
            System.exit(-1);
        }
        
        bda= new BDAbogados(con);
        bdca = new BDCasos(con);
        bdcl = new BDClientes(con);
        bdj = new BDJuicios(con);
    }
    
    public static void conectar(){
        bd.conectar();
    }
    
    public static void desconectar(){
        bd.desconectar();
    }
    
    public static ArrayList<Caso> sacarNumerosCaso() {
        ArrayList<Caso> listaCasos = bdca.sacarNumerosCaso();
        return listaCasos;
    }


    public static void darBaja(String tipo, String dni) {
        switch(tipo){
            case "abogado": bda.darBaja(dni);
                break;
            case "cliente": bdcl.darBaja(dni);
                break;
        }
    }

    public static void cambiarEstado(String estado) {
        bdca.cambiarEstado(estado);
    }
}
