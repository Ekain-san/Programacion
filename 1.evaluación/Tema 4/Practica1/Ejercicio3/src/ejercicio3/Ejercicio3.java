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
                float[] arrayLitrosCaidos = new float[12];
        inicializaArrayLitrosCaidos(arrayLitrosCaidos);
        
        char continuar;
        do
        {
            solicitarDatosEntrada(arrayLitrosCaidos);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        
        visualizarLitrosCaidos(arrayLitrosCaidos);
    }
    
    public static void inicializaArrayLitrosCaidos(float[] arrayLitrosCaidos)
    {
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
            arrayLitrosCaidos[x] = 0;
        }
    }

    private static void solicitarDatosEntrada(float[] arrayLitrosCaidos)
    {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes<1..12>: "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia (nro): "));
        float litros = Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros caídos: "));
        arrayLitrosCaidos[mes-1] += litros;
    }


    private static void visualizarLitrosCaidos(float[] arrayLitrosCaidos)
    {
        String litrosCaidos = "";
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
          litrosCaidos = litrosCaidos + (x+1) + " - " + arrayLitrosCaidos[x]+ "\n";
        }   
       JOptionPane.showMessageDialog(null, "Los litros recogidos durante los doce meses del año son: \n" + litrosCaidos );        
    }
}
    

