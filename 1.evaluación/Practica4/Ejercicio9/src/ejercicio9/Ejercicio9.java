/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int[][] clases= new int[3][4];
        
        String clase=" ";
        boolean fin=false;
        int x=0;
        int y=0;
        do 
        {
            x=calculador_nivel(x,fin);
            fin=dador_fin(fin);
            y=calculador_clase(y,fin);
            fin=dador_fin(fin);
            try
            {
               clase[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de alubnos"));
            }
            
            catch(Exception e)
            {
                fin=true;
            }
            fin=continuar(fin);
         }while(fin==false);
    }
    public static int calculador_nivel(int x, boolean fin)
    {
        boolean bien=false;
        String nivel=" ";
        do
        {
            try
            {
                nivel=JOptionPane.showInputDialog("Introduce nivel de los alubnos \n\n 0.Básico \n\n 1.Medio \n\n 2.Perfeccionamiento").toLowerCase();
            }
            catch(Exception e)
            {
                bien=true;
            }
        switch(nivel)
        {
            case "0":
            case "básico":
                x=0;
                bien=true;
                break;
            case "1":
            case "medio":
                x=1;
                bien=true;
                break;
            case "2":
            case "perfeccionamiento":
                x=2;
                bien=true;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Prueva a meter un lo que se pide");
            }
        }while(bien==false);
        fin=dador_fin(fin);
        return x;    
    }
    
    public static int calculador_clase(int y, boolean fin)
    {
        boolean bien=false;
        String nivel=" ";
        do
        {
            try
            {
                nivel=JOptionPane.showInputDialog("Introduce nivel de los alubnos \n\n 0.Básico \n\n 1.Medio \n\n 2.Perfeccionamiento").toLowerCase();
            }
            catch(Exception e)
            {
                bien=true;
            }
        switch(nivel)
        {
            case "0":
            case "inglés":
                y=0;
                bien=true;
                break;
            case "1":
            case "francés":
                y=1;
                bien=true;
                break;
            case "2":
            case "alemán":
                y=2;
                bien=true;
                break;
            case "3":
            case "ruso":
                y=2;
                bien=true;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Prueva a meter un lo que se pide");
            }
        }while(bien==false);
        fin=dador_fin(fin);
        return y;    
    }
    
    public static boolean dador_fin(boolean fin)
    {
       return fin;
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
