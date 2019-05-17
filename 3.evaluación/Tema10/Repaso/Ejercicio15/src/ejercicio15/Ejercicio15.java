/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import clases.Producto;
import excepcion.datoSinSentido;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    
    private static ArrayList <Producto> productos = new ArrayList <Producto> ();
    private static ArrayList <Double> costes = new ArrayList <Double> ();
    
    private static boolean seguir;
    private static boolean valido;
    
    private static int x;
    private static int venta;
    
    private static String producto;
    private static String ticket="";
    private static String tipo;
    private static Double precio;
    private static Integer cBarras;
    private static Integer cantidad;
    
    private static double total = 0;
    
    private static Matcher mat;
    private static Pattern pat = Pattern.compile("^[0-9]{12}$");
    private static Pattern pat2 = Pattern.compile("^[A-z][a-z]*$");
    private static Pattern pat3 = Pattern.compile("^[1]?[0-9]$");
    private static Pattern pat4 = Pattern.compile("^[1]?[0-9],[0-9]{2}$");
    
    public static void main(String[] args) {
        vender();
        calcolador();
        JOptionPane.showMessageDialog(null, ticket +"\n Total: "+total);
    }

    private static void vender() {
        do{
            do{
                try{        
                    cBarras = Integer.parseInt(JOptionPane.showInputDialog("Introduzca codigo de barras del producto"));
                    tipo = "codigo de barras";
                    validar();
                    seguir=true;
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Valor incorrecto");
                    seguir=false;
                }
            }while(seguir==false);
            
            x = JOptionPane.showConfirmDialog(null, "¿Va a vender otro producto?");
            switch (x){
                case 0: seguir = true;
                    break;
                default: seguir = false;
                   break;
            }
        
            comparador();
            
            
        }while(seguir==true);
    }

    private static void comparador() {
        do{    
            for(x=0; x<productos.size()&&productos.get(x).getCBarras()!=cBarras;x++);
            if (x==productos.size()){
                do{
                    try {
                        producto = JOptionPane.showInputDialog("Introduzca nombre del producto que va a vender");
                        tipo = "nombre";
                        validar();
                        
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad del producto"));
                        tipo = "cantidad";
                        validar();
                        
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio del producto"));
                        tipo = "precio";
                        validar();
                    }
                
                    catch(Exception e){
                        valido = false;
                    }
                    
                }while(valido==false);
                
                productos.add(new Producto(cBarras, producto, cantidad, precio));
                seguir = true;
            }
            else
                seguir=false;
            
        }while(seguir == false);
        
        venta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad que va a vender"));
        coste();
        ticket = ticket + "\n" + producto + " " + venta + "   " + precio;
        restos();
    }

    private static void validar() throws Exception {
        switch (tipo){
            case "codigo de barras": mat = pat.matcher(cBarras.toString());
                if(!mat.matches())
                    throw new datoSinSentido();
                break;
                
            case "nombre": mat = pat2.matcher(producto);
                if(!mat.matches())
                    throw new datoSinSentido();
                break;
                
            case "cantidad": mat = pat3.matcher(cantidad.toString());
                if(!mat.matches())
                    throw new datoSinSentido();
                break;
                
            case "precio": mat = pat4.matcher(precio.toString());
                if(!mat.matches())
                    throw new datoSinSentido();
                break;
        }
            
    }

    private static void coste() {
        precio = venta * productos.get(x).getPrecio();
        costes.add(precio);
    }

    private static void restos() {
        cantidad = productos.get(x).getCantidad() - venta;
        productos.get(x).setCantidad(cantidad);
        if(productos.get(x).getCantidad()<= 0)
            productos.remove(x);
    }

    private static void calcolador() {
        for (x=0; x<costes.size();x++){
            total = total + costes.get(x);
        }
    }
    
}
