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

/**
 *
 * @author Asus
 */
public class BDEventos {
    private Connection con;
    private Date fechaD;
    private Time horaTI;
    private Time horaTF;

    public BDEventos(Connection con) {
        this.con = con;
    }  
public void darAlta(Evento ev)
    {
        try
        {
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
    
public String consultar(String nombre)
{
    try
    {
     String plantilla = "select * from personas where nombre = ?;";
     PreparedStatement ps = con.prepareStatement(plantilla);
     ps.setString(1,nombre);
     ResultSet resultado = ps.executeQuery();
     if (resultado.next())
         return resultado.getString("nombre") + resultado.getInt(2);
        else
         return "No hay datos";
    }
    catch(Exception e)
    {
        return null;
    }
   }    

    public void cambiar(Evento ev, String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cancelar(String nombre)
    {
        try{
            String plantilla = "delete * from eventos where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1, nombre);
        }
        catch(Exception E){
            
        }
        
    }

    public void cambiar(String nombreE, Evento ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Date convertidor(LocalDate fecha) {
        Date fechaE = java.sql.Date.valueOf(fecha);
        return fechaE;
    }
    
    public Time convertidorT(LocalTime hora) {
        Time horaT = java.sql.Time.valueOf(hora);
        return horaT;
    }
}

