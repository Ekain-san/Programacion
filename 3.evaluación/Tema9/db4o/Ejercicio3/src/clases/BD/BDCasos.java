/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import clases.UML.Caso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class BDCasos {
    private Connection con;
    public BDCasos(Connection con) {
        this.con=con;
    }
    
    public ArrayList<Caso> sacarNumerosCaso() {
        ArrayList<Caso> listaCasos = null;
        try{
            String plantilla = "select numeroExpediente from casos;";
            Statement ps = con.createStatement();
            ResultSet resultado = ps.executeQuery(plantilla);
            while (resultado.next()){
                Caso caso=new Caso();
                caso.setNumeroExp(resultado.getInt(1));
                listaCasos.add(caso);  
            }
            return listaCasos;
        }
        
        catch(Exception e){
            return null;
        }
    }

    public void cambiarEstado(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
