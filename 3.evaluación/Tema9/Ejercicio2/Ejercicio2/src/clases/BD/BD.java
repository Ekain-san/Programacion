/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asus
 */
public class BD {
private Connection con;
    
    public Connection conectar()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/"+"Eventos";
            String usuario = "root";
            String pass = "usbw";
            con = DriverManager.getConnection (url,usuario,pass);
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    public void desconectar()
    {
        try{
        con.close();
        }
        catch(Exception e){}
    }
    
}
