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
public class BDJuicios {
    private Connection con;
    public BDJuicios(Connection con) {
        this.con=con;
    }
}
