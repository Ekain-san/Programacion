/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import clases.*;
import excepcion.datoSinSentido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    private static Comprador comprador;
    private static Envio envio;
    private static Pago pago;
    private static Articulo articulo;
    private static Vendedor vendedor;
    
    private static String tipo;
    
    private static Matcher mat;
    private static Pattern pat = Pattern.compile("^(C.)?[ ]?[A-z][a-z]*/[1]?[1-9]/[1]?[1-9][A-Z]$");
    private static Pattern pat2 = Pattern.compile("^[A-z][a-z]*$");
    
    public static void main(String[] args) {
        crearComprador();
        crearEnvio();
        crearArticulo();
        crearVendedor();
        crearPago();
    }

    private static void crearComprador() {
        try{
            String nombre=JOptionPane.showInputDialog("Introduzca nombre del comprador");
                tipo = "nombre";
            comprobador(nombre);
        
            String apellido=JOptionPane.showInputDialog("Introduzca apellido del comprador");
                tipo = "apellido";            
            comprobador(apellido);
        
            String direccion=JOptionPane.showInputDialog("Introduzca dirección del comprador");
                tipo = "direccion";
            comprobador(direccion);
        
            comprador = new Comprador(nombre, apellido, direccion); 
        }
        
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error, no se ha podido crear opjeto");
        }
    }

    private static void crearEnvio() {
        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha= formato.parse(JOptionPane.showInputDialog("Introduzca fecha de entrega"));
            String direccion = JOptionPane.showInputDialog("Introduzca dirección del envio");
                tipo = "direccion";
            comprobador(direccion);
        
            envio = new Envio(fecha, direccion, comprador);
            comprador.setEnvios(envio);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error, no se ha podido crear opjeto");
        }
        
    }

    private static void crearArticulo() {
        try{
            String nombre=JOptionPane.showInputDialog("Introduzca nombre del articulo");
                tipo = "nombre";
            comprobador(nombre);
        
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio del articulo"));
            articulo = new Articulo (nombre, precio, envio);
            
            envio.setArticulos(articulo);
        }
        
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error, no se ha podido crear opjeto");
        }
    }

    private static void crearVendedor() {
        try{
            String nombre = JOptionPane.showInputDialog("Introduzca nombre del vendedor");
                tipo = "nombre";
            comprobador(nombre);
        
            String apellido = JOptionPane.showInputDialog("Introduzca apellido del vendedor");
                tipo = "apellido";
            comprobador(apellido);
        
            vendedor = new Vendedor(nombre, apellido);
            
            envio.setVendedor(vendedor);
            articulo.setVendedores(vendedor);
            
            vendedor.setArticulos(articulo);
            vendedor.setEnvios(envio);
        }
        
        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error, no se ha podido crear opjeto");
        }
    }

    private static void crearPago() {
        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha= formato.parse(JOptionPane.showInputDialog("Introduzca fecha de pago"));
            double importe = Double.parseDouble(JOptionPane.showInputDialog("Introduzca importe"));
            String direccion = JOptionPane.showInputDialog("Introduzca dirección de factura");
                tipo = "direccion";
            comprobador(direccion);

            pago = new Pago (fecha, importe, direccion, envio);
            envio.setPago(pago);
        }
        
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error, no se ha podido crear opjeto");
        }
    }

    private static void comprobador(String dato) throws Exception {
        switch(tipo){
            case "direccion": mat= pat.matcher(dato);
            if (!mat.matches()){
                throw new datoSinSentido();
            }
            
            default: mat= pat2.matcher(dato);
            if (!mat.matches()){
                throw new datoSinSentido();
            }
        }
    }
    
}
