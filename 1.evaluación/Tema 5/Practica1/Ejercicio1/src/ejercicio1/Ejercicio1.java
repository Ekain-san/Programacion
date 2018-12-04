/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int opcion=0;
        int menu=0;
        boolean fin=false;
        ArrayList<Float>numeros=new ArrayList();
                
        numeros=calculador_de_lista(numeros);
       menu=opciones(menu, fin);
        numeros=menu_opciones(numeros, fin, menu);
    }
    
    public static ArrayList<Float> calculador_de_lista (ArrayList<Float>numeros)
    {
        int seguir=1;
        do
        {
            numeros.add(Float.parseFloat(JOptionPane.showInputDialog("Introduce numero")));
            seguir=JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        }while(seguir==0);
        return numeros;
    }
    
    public static int opciones (int menu, boolean fin)
    {
        if(fin==false)
        {
        menu=Integer.parseInt(JOptionPane.showInputDialog("Introduce uno de estos numeros:"
                                                          + "\n\n1 para saber el máximo y el mínimo"
                                                          + "\n\n2 para buscar un numero"
                                                          + "\n\n3 para buscar y borrar un numero"
                                                          + "\n\n4 para convertir el arrayList en array"
                                                          + "\n\n5 para mostrar los elementos que contiene"
                                                          + "\n\n6 para introducir un elemento por el final"
                                                          + "\n\n7 para introducir un elemento donde quieras"
                                                          + "\n\n8 para borrar en la posición que quieras"
                                                          + "\n\n9 para sumar y calcular media aritmética de los valores dados"));
        }
        return menu;  
    }
    public static ArrayList<Float>menu_opciones ( ArrayList<Float>numeros, boolean fin, int menu)
    {
        if(fin==false)
        {
            switch(menu)
            {
                case 1:calculador_max_min(numeros);
                       break;
                case 2:buscador_de_numero(numeros);
                       break;
                case 3:borrador_numero(numeros);
                       break;  
                case 4:arrayzador(numeros);
                       break;
                case 5:mostrador(numeros);
                       break;
                case 6:numeros=añadir_final(numeros);
                       break;
                case 7:numeros=añadir_en_posicion(numeros);
                       break;
                case 8:numeros=borrar_en_posicion(numeros);
                       break;
                case 9:sumar_y_media(numeros);
                       break;
                case 10:fin=true;
                       break;
            }
        }
        return numeros;
    }
    
    public static void calculador_max_min(ArrayList<Float>numeros)
    {
        Collections.sort(numeros);
        JOptionPane.showMessageDialog(null,"El mínimo es "+numeros.get(0));
        JOptionPane.showMessageDialog(null,"El máximo es "+numeros.get(numeros.size()-1));
    }
    
    public static void buscador_de_numero(ArrayList<Float>numeros)
    {
        float numero=Float.parseFloat(JOptionPane.showInputDialog("Introduce un nuemero"));
        boolean igual=false;
        int x=0;
        for(x=0;x!=numeros.size()-1&&igual==false;x++)
        {
            if(numero==numeros.get(x))
            {
                JOptionPane.showMessageDialog(null, "Esta en la lista");
            }
        }
         if(igual==false)
            {
                JOptionPane.showMessageDialog(null, "No esta en la lista");
            }
    }
    
    public static void borrador_numero(ArrayList<Float>numeros)
    {
        float numero=Float.parseFloat("Inttroduce el numero que quiere borrar");
        numeros.remove(numero);
    }
    
    public static void arrayzador(ArrayList<Float>numeros)
    {
        Double[]lista;
        lista=numeros.toArray(new Double[numeros.size()]);
    }
    
    public static void mostrador(ArrayList<Float>numeros)
    {
        JOptionPane.showMessageDialog(null, numeros);
    }
    
    public static ArrayList<Float> añadir_final(ArrayList<Float>numeros)
    {
       float numero=Float.parseFloat("Inttroduce el numero que quiere añadir"); 
        numeros.add(numero);
        return numeros;
    }
    
    public static ArrayList<Float> añadir_en_posicion(ArrayList<Float>numeros)
    {
        int posicion=Pedir_numero();
        float numero=Float.parseFloat("Inttroduce el numero que quiere añadir");
        numeros.add(posicion,numero);
        return numeros;
    }
    
    public static ArrayList<Float> borrar_en_posicion(ArrayList<Float>numeros)
    {
        int posicion=Integer.parseInt("Inttroduce posición del numero que quiere borrar");
        numeros.remove(posicion);
        return numeros;
    }
    
    public static void sumar_y_media(ArrayList<Float>numeros)
    {
        float suma=0;
        float media=0;
        for(int x=0;x!=numeros.size();x++)
        {
            suma=suma+numeros.get(x);
        }
        media=suma/(numeros.size());
        JOptionPane.showMessageDialog(null, "el total es "+suma);
        JOptionPane.showMessageDialog(null, "la media es "+media);
    }
    
    public static int Pedir_numero ()
    {
        int posicion=Integer.parseInt("Inttroduce posición del numero que quiere añadir");
        return posicion;
    }
}
