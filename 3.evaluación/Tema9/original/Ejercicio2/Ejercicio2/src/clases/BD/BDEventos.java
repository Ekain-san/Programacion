/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import clases.UML.Evento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class BDEventos {
    private Connection con;
    private Date fechaD;
    private Time horaTI;
    private Time horaTF;
    private ArrayList listaUbicaciones;


    public BDEventos(Connection con) {
        this.con = con;
    }


    public void darAlta(Evento ev){
    	try{
	    String plantilla = "insert into aconticimientos values (?,?,?,?,?,?);";
	    PreparedStatement ps = con.prepareStatement(plantilla);
	    ps.setString(1,ev.getNombre());
	    ps.setString(2,ev.getUbicacion());
	    fechaD=convertidor(ev.getFecha());
	    ps.setDate(3, fechaD);
	    horaTI = convertidorT(ev.getHoraI());
	    ps.setTime(4, horaTI);
	    horaTF = convertidorT(ev.getHoraF());
	    ps.setTime(5, horaTF);
	    ps.setInt(6, Integer.parseInt(ev.getAforo()));
	
	    int n = ps.executeUpdate();
	
	    if (n == 0)
	        System.out.println("Cero filas");
            }
        
        catch(Exception e){
            System.out.println(e.getClass() + e.getMessage());
        }   
    }    


    public void cambiar(String nombreE, String tipo, String valor) {
        try{
            String plantilla = "update table aconticimientos  set ?=? where nombre=?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,tipo);
            ps.setString(2,valor);
            ps.setString(3,nombreE);            
            ResultSet resultado = ps.executeQuery();          
        } 
        catch(Exception e){
                
        }
    }
    
    public void cambiarD(String nombreE, String tipo, LocalDate dia) {
        try{
            fechaD=convertidor(dia);
            String plantilla = "update table aconticimientos  set ?=? where nombre=?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,tipo);
            ps.setDate(2,fechaD);
            ps.setString(3,nombreE);             
            ps.executeQuery();
        } 
        
        catch(Exception e){
            
        }
    }
    
    public void cambiarT(String nombreE, String tipo, LocalTime hora) {
        try{
	   if(tipo.equals("horaI")){
               horaTI = convertidorT(hora);
               tipo="horaInicio";
               String plantilla = "update table aconticimientos  set ?=? where nombre=?;";
               PreparedStatement ps = con.prepareStatement(plantilla);
               ps.setString(1,tipo);
               ps.setTime(2,horaTI);
               ps.setString(3,nombreE);            
               ps.executeQuery();

           }
            
           else if(tipo.equals("horaF")){
               horaTF = convertidorT(hora);
               tipo="horaFin";
               String plantilla = "update table aconticimientos  set ?=? where nombre=?;";
               PreparedStatement ps = con.prepareStatement(plantilla);
               ps.setString(1,tipo);
               ps.setTime(2,horaTF);
               ps.setString(3,nombreE);
               ps.executeQuery();
           }
        }
        
        catch(Exception e){
            
        }
    }


    public void cancelar(String nombre)
    {
        try{
            String plantilla = "delete * from aconticimientos where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1, nombre);
            ps.executeQuery();
        }

        catch(Exception e){        
        }
    }

    
    public String sacarDato(String tipo, String nombre){
        String dato = null;
        if(tipo.equals("nombroE")){
            tipo="nombre";
        }

        
       try{
            String plantilla = "select ? from aconticimientos where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,tipo);
            ps.setString(2,nombre);
            ResultSet resultado = ps.executeQuery();
            resultado.next();
            dato=resultado.getString(1);
            return dato;
       }

       catch(Exception e){
           return null;
       }
    }
    
    public Date convertidor(LocalDate fecha) {
        Date fechaE = java.sql.Date.valueOf(fecha);
        return fechaE;
    }
    

    public Time convertidorT(LocalTime hora) {
        Time horaT = java.sql.Time.valueOf(hora);
        return horaT;
    }    


    public String tomarUbicacion() {
        try{
             String plantilla = "select Initcap(UBICACION) from aconticimientos;";
            Statement ps = con.createStatement();
            ResultSet resultado = ps.executeQuery(plantilla);
            if (resultado.next())
                return resultado.getString(1);
            else
                return "No hay datos";
        }
        
        catch(Exception e){
           return null; 
        }
    }

    public LocalTime sacarHora(String nombre, String tipo) {
        try{
            if(tipo.equals("horaI"))
                tipo="horaInicio";
            
            if(tipo.equals("horaF"))
                tipo="horaFin";
            
            String plantilla = "select ? from aconticimientos where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,tipo);
            ps.setString(2,nombre);
            ResultSet resultado = ps.executeQuery();
            resultado.next();
            LocalTime hora= resultado.getTime(1).toInstant() .atZone(ZoneId.systemDefault()) .toLocalTime();
            return hora;
        }
        
        catch(Exception e){
            return null;
        }  
    }


    public LocalDate sacarDia(String nombre, String tipo) {
        try{
            String plantilla = "select ? from aconticimientos where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,tipo);
            ps.setString(2,nombre);
            ResultSet resultado = ps.executeQuery();
            resultado.next();
            LocalDate dia= resultado.getDate(1).toInstant() .atZone(ZoneId.systemDefault()) .toLocalDate();
            return dia;
             
        }
        
        catch(Exception e){
            return null;
        }
    }
}

