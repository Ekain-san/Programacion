/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import clases.UML.Empresa;
import clases.UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class BDPersonas {
private Connection con;

    public BDPersonas(Connection con) {
        this.con=con;
    }

    public String sacarDato(String tipo, String nombre){
        String dato = null;
        if(tipo.equals("nombroE")){
            tipo="nombre";
        }

        
       try{
            String plantilla = "select ? from personas where nombre = ?;";
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

    public void inscribir(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
