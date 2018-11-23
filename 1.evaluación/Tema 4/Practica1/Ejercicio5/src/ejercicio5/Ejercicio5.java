/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        float sobra=0;
        sobra=contador_sobra(sobra);
        contador_de_canvios(sobra);
    }
    
   public static float contador_sobra (float sobra)
   {
    float precio=Float.parseFloat(JOptionPane.showInputDialog("Introduce precio"));
    float pago=Float.parseFloat(JOptionPane.showInputDialog("Introduce pago"));
    sobra=pago-precio;
    return sobra;
   }
  
   public static void contador_de_canvios(float sobra)
   {
       float[] dinero=new float[15];
       dinero[0]=500;
       dinero[1]=200;
       dinero[2]=100;
       dinero[3]=50;
       dinero[4]=20;
       dinero[5]=10;
       dinero[6]=5;
       dinero[7]=2;
       dinero[8]=1;
       dinero[9]=(float) 0.5;
       dinero[10]=(float)0.2;
       dinero[11]=(float)0.1;
       dinero[12]=(float)0.05;
       dinero[13]=(float)0.02;
       dinero[14]=(float)0.01;
       
       int[] cantidad=new int[15];
       
       String vueltas=" ";
       
       for(int x=0;x<dinero.length&&sobra!=0;x++)
       {
           if(dinero[x]<=sobra)
           {
               sobra=sobra-dinero[x];
               cantidad[x]++;
               vueltas=dinero[x]+": "+cantidad[x];
               /*Por aquí tengo un problema ya que no me coge lo correcto*/
           }
       }
      JOptionPane.showMessageDialog(null, vueltas);
   }
 }

