/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class BDAsistentes {
private Connection con;
    public BDAsistentes(Connection con) {
        this.con=con;
    }
    
    public int sacarAsistentes(){
        int asistentes;
        try{
            String plantilla = "select COUNT(*) FROM PERSONASACONTECIMIENTOS GROUP BY NOMBREACONTECIMIENTOS;";       
            Statement ps = con.createStatement();        
            ResultSet resultado = ps.executeQuery(plantilla);
            resultado.next();
            asistentes = resultado.getInt(1);
        }
        catch(Exception e){
            asistentes = 01;
        }
        return asistentes;
    }
}
