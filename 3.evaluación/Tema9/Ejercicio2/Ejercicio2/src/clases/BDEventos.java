/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
        Statement sentencia =con.createStatement();
        
        String plantilla = "insert into eventos values (?,?,?,?,?,?);";
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
        catch(Exception e)
        {
            System.out.println(e.getClass() + e.getMessage());
        }
    
}    

    public void cambiar(Evento ev, String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void cancelar(String nombre)
    {
        try{
            String plantilla = "delete * from eventos where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1, nombre);
        }
        catch(Exception e){
            
        }
    }
    
    public String sacarDato(String tipo, String nombre){
        String dato = null;
       try{
           String plantilla = "select ? from eventos where nombre = ?;";
           PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,tipo);
            ps.setString(2,nombre);
            ResultSet resultado = ps.executeQuery();
            dato=resultado.getString(1);
            return dato;
       }
       catch(Exception e){
           return null;
       }
    }

    public void cambiar(Evento ev) {
        throw new UnsupportedOperationException("Not supported yet."); 
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
            String plantilla = "select UBICACION from EVENTOS;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next())
                return resultado.getString(1);
            else
                return "No hay datos";
        }
   
        catch(Exception e){
           return null; 
        }
    }

    public String consultar(String nombre) {
        try{    
            String plantilla = "select * from personas where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,nombre);
            ResultSet resultado = ps.executeQuery();
            return resultado.getString(1) + resultado.getInt(2)+resultado.getDate(3)+resultado.getTime(4)+resultado.getTime(5)+resultado.getInt(6);
        }
        catch(Exception e){
            return null;
        }
    }
}

