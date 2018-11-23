/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        boolean bien=false;
        boolean fin=false;
        String dato=" ";
        mirar_si_esta_bien_o_mal(bien,fin,dato); 
        System.exit(0);
    }  
    public static void mirar_si_esta_bien_o_mal(boolean bien, boolean fin, String dato)
    {
        String[] mes= new String[12];
            mes[0]="enero";
            mes[1]="febrero";
            mes[2]="marzo";
            mes[3]="abril";
            mes[4]="mayo";
            mes[5]="junio";
            mes[6]="julio";
            mes[7]="agosto";
            mes[8]="septiembre";
            mes[9]="octubre";
            mes[10]="noviembre";
            mes[11]="diciembre";
            int x;
            do
            {
            do
            {
                try
                 {
                     dato=JOptionPane.showInputDialog("Introduce mes, introuce fin si desea terminar");
                     dato=dato.toLowerCase();
                     switch(dato)
                     {
                         case "fin":
                             bien=true;
                             fin=true;
                             break;

                         default:
                         for(x=0;x!=mes.length&&mes[x].compareTo(dato)!=0;x++)
                         {
                             
                         }
                         if(x==mes.length)
                         {
                             throw new MesException();
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(null,"Ha introducido un mes correcto");
                         }
                     }
                     bien=true;
                 }
                catch(MesException e)
                {
                     JOptionPane.showMessageDialog(null, "A metido un valor erroneo \n\n Pruebe a meter: \n\n Enero \n\n Febrero \n\n Marzo \n\n Abril \n\n Mayo \n\n Junio \n\n Julio \n\n Agosto \n\n Septiembre \n\n Octubre \n\n Noviembre \n\n Diciembre \n\n Fin");
                     bien=false;
                 }
                 catch(Exception e)
                 {
                     bien=true;
                     fin=true;
                 }

             }while(bien==false);
         }while(fin==false);
        JOptionPane.showMessageDialog(null, "Gracias por cedernos una parte de su tiempo");
        }
    }
