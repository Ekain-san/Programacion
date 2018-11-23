/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        boolean fin=false;
        boolean bien=false;
        String nombre=" ";
        int x=0;
        String[] nombres= new String[5];
        for(x=0;x!=nombres.length&&fin==false;x++)
        {
            nombres[x]=JOptionPane.showInputDialog("Introduce nombre");
            fin=continuar(fin, bien);
        }
        
        fin=false;
        
        int[][][] dias=new int[12][31][5];
        for(x=0;x!=dias.length&&fin==false;x++)
        {
            for(int y=0;y!=dias.length;y++)
            {
                for(int z=0;z!=dias.length;z++)
                {
                   dias[x][y][z]=0;
                   for(int a=0;a!=nombres.length&&bien==false;a++)
                    {
                      nombre=JOptionPane.showInputDialog("Quien a faltado");
                      if(nombre.equals(nombres[a])) 
                      {
                        dias[x][y][z]++;
                        bien=true; 
                      }
                      
                      fin=continuar(fin, bien);
                   }
                }
            }
        }    
    }
    public static boolean continuar(boolean fin, boolean bien)
    {   
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
/*me da un error desconocido*/