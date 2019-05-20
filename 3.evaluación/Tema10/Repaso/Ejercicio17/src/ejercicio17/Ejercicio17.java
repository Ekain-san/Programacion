/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import clases.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    
    public static void main(String[] args) {
        crearComprador();
        crearEnvio();
        crearArticulo();
        crearVendedor();
        crearPago();
    }

    private static void crearComprador() {
        String nombre=JOptionPane.showInputDialog("Introduzca nombre del comprador");
        String apellido=JOptionPane.showInputDialog("Introduzca apellido del comprador");
        String direccion=JOptionPane.showInputDialog("Introduzca dirección del comprador");
        comprador = new Comprador(nombre, apellido, direccion);
    }

    private static void crearEnvio() {
        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha= formato.parse(JOptionPane.showInputDialog("Introduzca fecha de entrega"));
            String direccion = JOptionPane.showInputDialog("Introduzca dirección del envio");
            
            envio = new Envio(fecha, direccion, comprador);
            comprador.setEnvios(envio);
        }
        catch(Exception e){
            
        }
        
    }

    private static void crearArticulo() {
        try{
            String nombre=JOptionPane.showInputDialog("Introduzca nombre del articulo");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio del articulo"));
            articulo = new Articulo (nombre, precio, envio);
            
            envio.setArticulos(articulo);
        }
        
        catch(Exception e){
            
        }
    }

    private static void crearVendedor() {
        try{
            String nombre=JOptionPane.showInputDialog("Introduzca nombre del vendedor");
            String apellido=JOptionPane.showInputDialog("Introduzca apellido del vendedor");
            vendedor = new Vendedor(nombre, apellido);
            
            envio.setVendedor(vendedor);
            articulo.setVendedores(vendedor);
            
            vendedor.setArticulos(articulo);
            vendedor.setEnvios(envio);
        }
        
        catch (Exception e){
            
        }
    }

    private static void crearPago() {
        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha= formato.parse(JOptionPane.showInputDialog("Introduzca fecha de pago"));
            double importe = Double.parseDouble(JOptionPane.showInputDialog("Introduzca importe"));
            String direccion = JOptionPane.showInputDialog("Introduzca dirección de factura");

            pago = new Pago (fecha, importe, direccion, envio);
            envio.setPago(pago);
        }
        
        catch(Exception e){
            
        }
    }
    
}
