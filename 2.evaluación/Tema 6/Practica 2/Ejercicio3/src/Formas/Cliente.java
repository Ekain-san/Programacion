/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

/**
 *
 * @author Asus
 */
public class Cliente extends Persona
   {
    private String telefonoContacto;
    
    public Cliente(String nombre,int edad,String telefono)
    {
        super(nombre,edad);
        telefonoContacto =  telefono;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    
    
    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getTelefonoContacto();
    }
    
}