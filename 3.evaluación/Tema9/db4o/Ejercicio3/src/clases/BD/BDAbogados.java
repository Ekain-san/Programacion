/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.BD;

import java.sql.Connection;

/**
 *
 * @author Asus
 */
public class BDAbogados {
    private Connection con;
    public BDAbogados(Connection con) {
        this.con=con;
    }

    public void darBaja(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
