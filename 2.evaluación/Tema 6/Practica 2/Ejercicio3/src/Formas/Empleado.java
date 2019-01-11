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
public class Empleado extends Persona{
    
    // notación Camel
    private double sueldoBruto;
    
    // private Director d;
    
    public Empleado(String nombre,int edad,double sueldo)
    {
        // Constructor de la clase padre
        super(nombre,edad);
       // this.nombre = nombre;
        this.sueldoBruto = sueldo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    @Override
    public String mostrar(){
       // return nombre + " " + edad + " " + sueldoBruto;
       return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto();
    }
    
    public Double calcularSalarioNeto(){
        return null;
    }
    
}
