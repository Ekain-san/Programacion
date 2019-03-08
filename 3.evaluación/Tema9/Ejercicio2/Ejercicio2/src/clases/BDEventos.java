/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Asus
 */
public class BDEventos {
public void darAlta(Evento E)
    {
        try
        {
        Statement sentencia =con.createStatement();
        
        String plantilla = "insert into eventos values (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,p.getNombre());
        ps.setInt(2,p.getNro());
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
         // Hay datos
         return resultado.getString("nombre") + resultado.getInt(2);
         // return resultado.getString(1) + resultado.getInt("edad");
     else
         // Cero filas seleccionadas
         return "No hay datos";
    }
    catch(Exception e)
    {
        return null;
    }
   }    

    public void cambiar(Evento e, String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

