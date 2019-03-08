/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Asus
 */import Formas.*;
import java.util.ArrayList;
import Ventanas.*;
import java.util.Random;
import javax.swing.JOptionPane;
public class Ejercicio1 {

    /****/
    private static int x=1;
    private static String usuario;
    private static String clase;
    public static void salir() 
    {
        System.exit(0);
    }
    private static ArrayList<Usuario>ListaUsuarios;
    private static ArrayList<Empleado>ListaEmpleados;
    private static ArrayList<Contrato>ListaContratos;
    private static ArrayList<Departamento>ListaDeparamentos;
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int comprobar(String valor, int contador, String tipo){
        int x=0;
        if (tipo.equals("usuario")){
            for(x=0;ListaUsuarios.get(x).getUsuario().equals(valor)&&x<ListaUsuarios.size();x++){  
            }

           if(!valor.equals(ListaUsuarios.get(x).getUsuario())){  
                JOptionPane.showMessageDialog(null, "Has puesto un "+tipo+" equivocado");
                contador++;
            }
           
             if(valor.equals(ListaUsuarios.get(x).getUsuario())){
                usuario=valor;
             }
        }
        
        if (tipo.equals("codigo")){
            for(x=0;ListaUsuarios.get(x).getCodigo().equals(valor)&&x<ListaUsuarios.size();x++){  
            }

           if(!valor.equals(ListaUsuarios.get(x).getCodigo())){  
               JOptionPane.showMessageDialog(null, "Has puesto un "+tipo+" equivocado");
               contador++;
            }
           
           if(valor.equals(ListaUsuarios.get(x).getCodigo())){  
               iniciarVentana();
            }
        }
       
        return contador;
    }
    
    public static void añadirUsuario(){
        ListaUsuarios.add(valor);
    }

    private static void iniciarVentana() {
        
    }

    public static void mostrar_bienvenida() {
        String bienvenida="Bienvenid@"+usuario; 
    }
    
   public static void iniciarCambios(String tipo){
       clase=tipo;
   }

    public static String establecerTipo(String tipo) {
     tipo=clase;
     return tipo;
    }

    public static void comprobarDatos(String valor, String elemento) {
        
    }
    public static void validar(String valor,String tipo, String dni, String nombre, String nss, String fechaAlta, String genero, String estadoCivil){
    if(dni.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
        }
       else{
            valor=dni;
            tipo="DNI";
            comprobarDatos(valor,tipo);
            if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
            }
            else{
                valor=nombre;
                tipo="Nombre apellidos";
                Ejercicio1.comprobarDatos(valor,tipo);
                
                if(nss.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
                }
          
                else{
                    valor=nss;
                    tipo="NSS";
                    Ejercicio1.comprobarDatos(valor,tipo);
                    if(fechaAlta.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
                    }
                    else{
                        if(genero.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Debes darle a una obción de 'Sexo'");
                       }
                        else{
                            
                            if(estadoCivil.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Debes darle a una obción de 'Estado civil'");
                            }
                            
                            else{
                                guardarPersona(dni, nombre, nss, fechaAlta, genero, estadoCivil);
                            }
                        }
                    }     
                }
            }
        }
    }
       
    public static void guardarPersona(String DNI, String nombre, String nss, String fechaAlta, String genero, String estadoCivil) {
        
    }

    public static boolean revisar(boolean eleccion,String tipo, String valor, String dni, String nombre) {
        valor=dni;
            tipo="DNI";
            comprobarDatos(valor,tipo);
            if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
            }
            else{
                valor=nombre;
                tipo="Nombre apellidos";
                comprobarDatos(valor,tipo);
                }
            return eleccion;
        }
    public static void validar2(String valor,String tipo, String dni, String nombre, String nss, String fechaAlta, String genero, String estadoCivil)
    {
        if(nss.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
        }        
        else{
            valor=nss;
            tipo="NSS";
            comprobarDatos(valor,tipo);
            if(fechaAlta.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debes llenar el hueco");
            }
            else{
                if(genero.isEmpty()){
                   JOptionPane.showMessageDialog(null, "Debes darle a una obción de 'Sexo'");
                }
                else{
                    if(estadoCivil.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Debes darle a una obción de 'Estado civil'");
                    }
                            
                    else{
                        guardarCambios(dni, nombre, nss, fechaAlta, genero, estadoCivil);
                    }
                }
            }     
        }
    }

    private static void guardarCambios(String dni, String nombre, String nss, String fechaAlta, String genero, String estadoCivil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    public static String generarNumeroEmpleado() throws Exception{
        Random r = new Random();
        String numeroE;
        int x;
        do{
            numeroE="";
            for(x = 0; x < 4; x++)
            {
                numeroE = numeroE + r.nextInt(9);
            }
            for(x = 0; x < ListaEmpleados.size() && ListaEmpleados.get(x).getNumeroContrato().compareTo(numeroE)!= 0; x++){}

        }while (x != ListaEmpleados.size());

        return numeroE;
    }

    private static void crearUsuario(){
        ListaUsuarios.get(x).setUsuario("a");
        ListaUsuarios.get(x).setCodigo("b");
    }
    
    private static void crearContrato(){
        ListaContratos.get(x).setContrato("dentista");
    }
    
    private static void crearPersona(){
        ListaEmpleados.get(x).getUsuario().setUsuario(ListaUsuarios.get(x).getUsuario());
        ListaEmpleados.get(x).getUsuario().setCodigo(ListaUsuarios.get(x).getCodigo());
        ListaEmpleados.get(x).getContrato().setContrato(ListaContratos.get(x).getContrato());
        ListaEmpleados.get(x).setNumeroContrato("1");
        
    }
}
