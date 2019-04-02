/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import clases.UML.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class BDEmpresas {
    private Connection con;
    public BDEmpresas(Connection con) {
        this.con=con;
    }
    
    public String sacarDato(String tipo, String nombre){
        String dato = null;
        if(tipo.equals("nombroE")){
            tipo="nombre";
        }

        
       try{
            String plantilla = "select ? from empresas where nombre = ?;";
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

    public void agregar(Empresa em) {
        try{
	    String plantilla = "insert into aconticimientos values (?,?,?);";
	    PreparedStatement ps = con.prepareStatement(plantilla);
	    ps.setString(1,em.getNombre());
            ps.setString(2, em.getDireccion());
            ps.setString(3, em.getTelefono());
        }
        
        catch(Exception e){
            
        }
    }
}
