/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import ejecutable.*;

/**
 *
 * @author Asus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
        private static String[] todosIdiomas;
    private static String[] todosNiveles;
    private static ArrayList<ArrayList<Integer>> alumnos;
    private static ArrayList<String> idiomas;
    private static ArrayList<ArrayList<String>> niveles;

    public static void main(String[] args) {
        try{
            crearEstructuras();
            entradaDatos();
            listados();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getMessage());
        }
    }
    
    public static void crearEstructuras() throws Exception{
        todosIdiomas=new String[4];
        todosIdiomas[0] = "Inglés";
        todosIdiomas[1] = "Francés";
        todosIdiomas[2] = "Alemán";
        todosIdiomas[3] = "Ruso";
        
        todosNiveles = new String[3];
        todosNiveles[0] = "Básico";
        todosNiveles[1] = "Intermedio";
        todosNiveles[2] = "Superior";
        
        alumnos = new ArrayList();
        idiomas = new ArrayList();
        niveles = new ArrayList();
        
        
        
        
    }

    public static void entradaDatos() throws Exception{
        boolean correcto;
        do
        {
            do
            {
                String idioma = introducirDato("idioma", todosIdiomas);
                String nivel = introducirDato("nivel", todosNiveles);

                correcto = introducirAlumnos(idioma,nivel);
            }
            while(correcto == false);
            
        }
        while(JOptionPane.showConfirmDialog(null, "¿ Quieres continuar?")==0);
    }
    
    public static String introducirDato(String dato, String[] array) throws Exception{
        boolean correcto;
        String datoEntrada="";
        do
        {
            try
            {
                datoEntrada = JOptionPane.showInputDialog("Teclea un " + dato);
                if (Arrays.asList(array).contains(datoEntrada)== false)
                    throw new DatoNoValidoException();
                correcto = true;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null, dato + " no válido");
                correcto = false;
            }
        }
        while(correcto == false);
        return datoEntrada;
    }

    public static boolean introducirAlumnos(String idioma, String nivel)
    {
            boolean correcto;
            try
            {
                int posIdioma,posNivel;
                if (idiomas.isEmpty()== false)
                {
                    posIdioma= idiomas.indexOf(idioma);
                    if (posIdioma== -1)
                    {
                        // Añadir el idioma
                        idiomas.add(idioma);
                        posIdioma = idiomas.size() - 1;
                        // Añadir el nivel
                        niveles.add(new ArrayList());
                        niveles.get(niveles.size()-1).add(nivel);
                        
                        alumnos.add(new ArrayList());
                        
                    }
                    else
                    {
                        // El idioma y la fila existen.
                        // ¿ El nivel?
                        posNivel = niveles.get(posIdioma).indexOf(nivel);
                        if (posNivel == -1)
                        {
                            niveles.get(posIdioma).add(nivel);
                        }
                        else
                            throw new DatoNoValidoException();
                    }
                }
                else
                {
                    posIdioma = 0;
                    // Guardamos el idioma
                    idiomas.add(idioma);
                    // Guardamos el nivel
                    niveles.add(new ArrayList());
                    niveles.get(0).add(nivel);
                    alumnos.add(new ArrayList());
                }
                int nroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Indica el número de alumnos"));
                // Guardamos alumnos
                alumnos.get(posIdioma).add(nroAlumnos);
                correcto = true;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null,"Ya has indicado alumnos para ese idioma y nivel");
                correcto = false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Problemas con el tipo de dato");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
                correcto = false;
            }
        return correcto;
    }
    public static void listados() throws Exception{
        String datos = "";
        for (int x = 0; x < alumnos.size(); x++)
        {
            datos += "Idioma: " + idiomas.get(x) + "\n";
            for ( int y = 0; y < niveles.get(x).size(); y++)
                datos += "Nivel: "+ niveles.get(x).get(y) + " " + alumnos.get(x).get(y) + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);   
    }
}