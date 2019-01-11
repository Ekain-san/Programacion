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
public class Asiento 
{
  private int numero_asiento;
  private boolean estado;
  private String compartimiento;

    public boolean isEstado() 
    {
        return estado;
    }

    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }

    public String getCompartimiento()
    {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) 
    {
        this.compartimiento = compartimiento;
    }

    public int getNumero_asiento() 
    {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento)
    {
        this.numero_asiento = numero_asiento;
    }
    
   public void reservar ()
   {
       
   }
   
    public void comprar ()
   {
       
   }
    
   public boolean mostrar_disponivilidad()
   {
      return false;      
   }
}
