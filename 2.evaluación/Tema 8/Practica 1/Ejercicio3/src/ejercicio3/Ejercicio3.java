/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Asus
 */import Ventana.VentanaPersona;
   import Formas.*;
   import java.util.ArrayList;
   public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
   
    
    
      
     private static VentanaPersona v;
    
    private static Cursos[] listaCursos;
    private static ArrayList<Personas> listaPersonas;
    
    private static Cursos cu;
    private static Personas p;
    
    public static void main(String[] args) {
        generarCursos();
        listaPersonas = new ArrayList<Personas>();
        
        mostrarVentana();
    }
    
    public static void mostrarVentana(){
        v = new VentanaPersona();
        v.setVisible(true);
    }
    
    public static void generarCursos(){
        listaCursos= new Cursos[16];
        cu = new Cursos("1A");
        listaCursos[0]= cu;
        cu = new Cursos("1B");
        listaCursos[1]= cu;
        cu = new Cursos("1C");
        listaCursos[2]= cu;
        cu = new Cursos("1D");
        listaCursos[3]= cu;
        cu = new Cursos("2A");
        listaCursos[4]= cu;
        cu = new Cursos("2B");
        listaCursos[5]= cu;
        cu = new Cursos("2C");
       listaCursos[6]= cu;
        cu = new Cursos("2D");
        listaCursos[7]= cu;
        cu = new Cursos("3A");
       listaCursos[8]= cu;
        cu = new Cursos("3B");
       listaCursos[9]= cu;
        cu = new Cursos("3C");
        listaCursos[10]= cu;
        cu = new Cursos("3D");
      listaCursos[11]= cu;
        cu= new Cursos("4A");
       listaCursos[12]= cu;
        cu = new Cursos("4B");
      listaCursos[13]= cu;
        cu = new Cursos("4C");
      listaCursos[14]= cu;
        listaCursos[15]=new Cursos("4D");
    }
    
    public static boolean validarDni(String dni){
        int x;
        for(x = 0;x < listaPersonas.size() && listaPersonas.get(x).getDni().compareTo(dni)!= 0;x++){}
        if (x == listaPersonas.size())
            return false;
        
        p = listaPersonas.get(x);
        return true;
    }
    
    public static Personas getPersona(){
        return p;
    }
    
    public static boolean validarCurso(String c){
        int x;
        for(x = 0;x < listaCursos.length && listaCursos[x].getCurso().compareToIgnoreCase(c)!= 0;x++){}
        if (x == listaCursos.length)
            return false;
        
        cu = listaCursos[x];
        return true;
    }
    
    public static void altaPersona(String d, String n, String a){
        listaPersonas.add(new Personas (d,n,a,cu));
        volverEmpezar();
    }
    
    public static void volverEmpezar(){
        v.dispose();
        mostrarVentana();
    }
    
    public static void borrarPersona(){
        p.getC().borrarAlumno(p);
        listaPersonas.remove(p);
        volverEmpezar();
    }
    
    public static void modificarPersona(){
        p.getC().borrarAlumno(p);
        p.setC(cu);
        volverEmpezar();
    }
    
    public static void terminar(){
        v.dispose();
       System.out.println(generarDatos());
       System.exit(0);
    }
    
    public static String generarDatos(){
        String datos="";
        int x;
        
        for(x = 0; x < listaPersonas.size();x++)
        {
            datos += listaPersonas.get(x).getDni() + "  " + listaPersonas.get(x).getNombre() + listaPersonas.get(x).getApellidos();
            datos += "  " + listaPersonas.get(x).getC().getCurso() + " \n";
        }
        
        datos += "\n Listado de alumnos por curso \n";
        for(x = 0; x < listaCursos.length;x++)
        {
            datos += "\n Curso: " + listaCursos[x].getCurso() + " \n";
            for(int y=0; y < listaCursos[x].getListaAlumnos().size(); y++)
                datos += listaCursos[x].getListaAlumnos().get(y).getNombre() + " \n";
    
        }
        
        if (datos.isEmpty())
            datos = "No hay datos";
        return datos;
    }
    
    public static boolean revisar_dni(boolean iguales, String dni){
       for (int x=0; x<listaPersonas.size()&&iguales==false; x++){
           if(!(listaPersonas.get(x).getDni().compareTo(dni)==0))
           {
           } else {
               iguales=true;
           }
       }
       return iguales;
    }
}