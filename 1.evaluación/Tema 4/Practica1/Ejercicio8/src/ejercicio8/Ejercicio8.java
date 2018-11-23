/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    boolean fin=false;
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int numero[][]=new int[10][10];
        int x=0;
        int y=0;
        int[] suma= new int[10];
        boolean fin=false;
        do
        {
            try
            {
                x=Integer.parseInt(JOptionPane.showInputDialog("Introduce colubna del numero, del 0 al 9"));
            }
            
            catch (Exception e)
            {
                fin=true;
            }
            x=controlador(x);
            
            try
            {
            y=Integer.parseInt(JOptionPane.showInputDialog("Introduce fila del numero, del 0 al 9"));
            }
            
            catch (Exception e)
            {
                fin=true;
            }
            
            y=controlador(y);
            try
            {
                numero[x][y]=Integer.parseInt("Introduce numero");
            }
            catch (Exception e)
            {
                fin=true;
            }
            fin=continuar(fin);
        }while(fin==false);
        for(int a=0;a!=numero.length;a++)
        {
            for(int b=0;b!=numero.length;b++)
            {
               suma[a]=suma[a]+numero[a][b];
            }
        }
    }   
    public static int controlador(int numero)
    {
        boolean bien=false;
        do
        {
            try
            {
                if(numero<0||numero>9)  
                {
                    throw new tamañoException();
                }
                bien=true;
            }
            catch(tamañoException e)
            {
                numero=Integer.parseInt(JOptionPane.showInputDialog("A metido un valor no valido\n\nPrueve a meter un valor del 0 al 9"));
            }
        }while(bien==false);
        return numero;
    }
    public static boolean continuar(boolean fin)
    {   
        boolean bien=false;
        String continuar=" ";
        do
        {
            try
            {
                continuar=JOptionPane.showInputDialog("¿Desea continuar? sí o no").toLowerCase();
                if(!continuar.equals("no")&&!continuar.equals("sí"))
                {
                throw new valorException(); 
                }
                bien=true;
            }

            catch(valorException e)
            {
               JOptionPane.showMessageDialog(null, "A metidi un valor no valido prueve a introducir: \n\n Sí o no");
            }

            catch(Exception e)
            {
                bien=true;
                fin=true;
            }
        }while(bien==false);
        
        if(continuar.equals("sí"))
        {
            fin=false;
        }
       else if(continuar.equals("no"))
        {
            fin=true;
        }
        
       return fin;
    }
}
