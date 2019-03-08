/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Asus
 */
import Formas.*;
import Errores.*;
import Ventana.VentanaTIenda;
import java.util.ArrayList;
public class Ejercicio1 
{
    private ArrayList<Producto>ListaProductos;

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void vender() 
    {
       
    }

    public static void comprar() 
    {
       
    }
    
    public static void comprobar()
    {
        
    }
    
    public static void mostrar()
    {
        
    }
    
    public static double calcular(double precio, double unidades,boolean descuentoA, boolean descuentoB)
    {   double descuento1;
        double descuento2;
        precio=coste*unidades;
        if (descuentoA=true)
        {
            descuento1=;
            precio=precio-(precio*descuento1);
        }
        if (descuentoB=true)
        {
            descuento2=;
            precio=precio-(precio*descuento2);
        }
        double coste;
        return precio;
    }
    
    public static boolean revisar(boolean iguales, String producto) {
        for (int x=0; x<ListaProductos.size()&&iguales==false; x++){
           if(!(ListaProductos.get(x).getNombre().compareTo(producto)==0))
           {
           } else {
               iguales=true;
           }
       }
       return iguales;
    }   
}
