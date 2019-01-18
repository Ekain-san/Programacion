/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author Asus
 */
public class DatoNoValido extends Exception{
    private int tipo;
    public DatoNoValido(int tipo)
        {
            this.tipo = tipo;
        }
    
    @Override
    public String getMessage()
    {
        String mensaje="";
        switch(tipo)
        {
            case 1:
                mensaje = "Problemas con el formato del nombre";
                break;
            case 2:
                mensaje = "Problemas con el formato de los apellidos";
                break;
            case 3:
                mensaje = "Problemas con el formato de dni 99999999A";
                break;
            case 4:
                mensaje = "Esta persona ya está dada de alta";
                break;
       }
       return mensaje;
    }  
}
