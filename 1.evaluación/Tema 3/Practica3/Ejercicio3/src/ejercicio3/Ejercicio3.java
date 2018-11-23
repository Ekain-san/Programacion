/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int obcion=0;
        
        int numero=0;
        
        int numero2=0;
        
        int numero3=0;
        
        int numero4=0;
        
        int multiplicador=1;
        
        String cadena=" ";
        
        boolean fin=false;
        
        boolean bien=false;
        
         while (fin==false)
        {
            while(bien==false)
            {
                try
                {
                  obcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de función que quieres ejecutar: \n\n 1:suma \n\n 2:resta \n\n 3:tabla de multiplicación \n\n 4: resultado y sobra de una división \n\n 5:salir del programa\n\n"));
                  
                  if (obcion<1||obcion>5)
                  {
                      throw new ValorException();
                  }
                  
                  else
                  {
                      bien=true;
                  }
                }

                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");
                    
                    bien=false;
                }
                
                catch(ValorException e)
                {
                    JOptionPane.showMessageDialog(null,"Has introducido un numero mayor a 5 o menor a 1, prueba con un numero del 1 al 5 incluyendo a ambos");
                    
                    bien=false;
                }
            }
            
                switch (obcion)
                {
                  case 1:JOptionPane.showMessageDialog(null,"Ha seleccionado sumar");
                         
                        do
                         {
                            try
                            {
                                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
                                bien=true;
                             }
                            
                            catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                bien=false;
                            }
                            
                         }while(bien==false);
                        
                        do
                         {
                            try
                            {
                                numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
                             }
                           
                            catch(NumberFormatException e)
                             {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                 bien=false;
                              }
                            
                         } while(bien==false);
                                
                         numero3=numero+numero2;
                        
                         JOptionPane.showMessageDialog(null,"La solución es: "+numero3);

                 case 2:JOptionPane.showMessageDialog(null,"Ha seleccionado restar");
                         
                        do
                         {
                            try
                            {
                                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
                             }
                           
                            catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                bien=false;
                            }
                         
                         }while(bien=false);
                          
                          do
                         {
                            try
                            {
                                numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
                             }
                            
                            catch(NumberFormatException e)
                             {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                bien=false;
                            }
                            
                         }while(bien=false);
                          
                         numero3=numero-numero2;
                         
                         JOptionPane.showMessageDialog(null,"La solución es: "+numero3);
                         
                         break;

                 case 3:JOptionPane.showMessageDialog(null,"Ha seleccionado hacer la tabla de multiplicaciones");
                          
                        do
                         {
                            try
                            {
                                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
                            
                                bien=true;
                            }
                            
                           catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                bien=false;
                            }
                            
                         }while(bien=false);
                          
                         for(multiplicador=1;multiplicador!=11;multiplicador++)
                         {
                            numero3=numero*multiplicador;
                            
                            cadena=cadena+" "+numero3;
                         }
                         JOptionPane.showMessageDialog(null,"La solución es:"+cadena);
                         
                         break;

                 case 4:JOptionPane.showMessageDialog(null,"Ha seleccionado dividir");
                          do
                         {
                            try
                            {
                                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
                         
                                bien=true;
                            }
                            
                            catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                bien=false;
                            }
                            
                         }while(bien=false);
                             
                          do
                         {
                            try
                            {
                                numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
                             }
                            
                            catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null,"Has introducido un valor no valido, prueba con un numero");

                                bien=false;
                            }
                            
                         }while(bien=false);
                          
                         numero3=numero/numero2;
                         
                         numero4=numero%numero2;
                         
                         JOptionPane.showMessageDialog(null,"La solución es: "+numero3);
                         
                         JOptionPane.showMessageDialog(null,"La sobra es: "+numero4);
                         break;   

                 case 5: fin=true;
                         break;
            }
        }
    }   
}
