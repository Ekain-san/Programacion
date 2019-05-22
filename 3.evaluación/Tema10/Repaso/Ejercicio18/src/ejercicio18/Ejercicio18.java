/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    private static int id;
    private static String nombre;
    private static String email;
    private static String objetivo;
    
    private static Docente docente;
    private static Grupo grupo;
    private static Alumno alumno;
    private static Asignatura asignatura;
    private static Unidad unidad;
    private static Criterio criterio;
    
    public static void main(String[] args) {
        crearDocente();
        crearGrupo();
        crearAlumno();
        crearAsignatura();
        crearUnidad();
        crearCriterio();
    }
    
    private static void crearDocente() {
        try{
            id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del docente"));
            nombre = JOptionPane.showInputDialog("Introduzca el nombre del docente");
            String profesion = JOptionPane.showInputDialog("Introduzca la profesión del docente");
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cedula del docente"));
            email = JOptionPane.showInputDialog("Introduzca el email del docente");
            
            docente = new Docente (id, nombre, profesion, cedula, email);
        }
        
        catch (Exception e){
            
        }
    }

    private static void crearGrupo() {
        try{
            id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del grupo"));
            nombre = JOptionPane.showInputDialog("Introduzca el nombre del grupo");
            String noIntegrantes = JOptionPane.showInputDialog("Introduzca el nombre de los alumnos que no forman parte del grupo"); 
        
           grupo = new Grupo(id, nombre, noIntegrantes, docente);
           docente.setGrupos(grupo);
        }
        
        catch (Exception e){
            
        }
    }

    private static void crearAlumno() {
        try{
            id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del alumno"));
            nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
            int matricula  = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la matricula del alumno"));
            String apePat = JOptionPane.showInputDialog("Introduzca el apellido paterno del alumno");
            String apeMat = JOptionPane.showInputDialog("Introduzca el apellido materno del alumno");
            String direccion =JOptionPane.showInputDialog("Introduzca la direeción del alumno");
            int edad  = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del alumno"));
            email = JOptionPane.showInputDialog("Introduzca email del docente");
            
            alumno = new Alumno(id, matricula, nombre, apePat, apeMat, direccion, edad, email, grupo);
            grupo.setAlumnos(alumno);
        }
        
        catch (Exception e){
            
        }
    }

    private static void crearAsignatura() {
        try{
            id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id de la asignatura"));
            nombre = JOptionPane.showInputDialog("Introduzca el nombre de la asignatura");
            int creditos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los creditos de la asignatura"));
            objetivo = JOptionPane.showInputDialog("Introduzca el objetivo de la asignatura");
            String unidades = JOptionPane.showInputDialog("Introduzca las unidades de la asignatura");
        
            asignatura = new Asignatura (id, nombre, creditos, objetivo, unidades, grupo, alumno);
            grupo.setAsignaturas(asignatura);
            alumno.setAsignaturas(asignatura);
        }
        
        catch (Exception e){
            
        }
    }

    private static void crearUnidad(){
        try{
            id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id de la unidad"));
            objetivo = JOptionPane.showInputDialog("Introduzca el objetivo de la unidad");
            String criterios = JOptionPane.showInputDialog("Introduzca los criterios de la unidad");
            int valorUnidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca valor de la unidad"));
            
            unidad = new Unidad(id, objetivo, criterios, valorUnidad, alumno, asignatura);
            alumno.setUnidad(unidad);
            asignatura.setUniades(unidad);
        }
        
        catch (Exception e){
            
        }
    }

    private static void crearCriterio() {
        try{
            id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del criterio"));
            String descripcion = JOptionPane.showInputDialog("Introduzca la descripcion del criterio");
            String valor = JOptionPane.showInputDialog("Introduzca el valor del criterio");
            
            criterio = new Criterio (id, descripcion, valor, alumno, unidad);
            alumno.setCriterios(criterio);
            unidad.setCriterios(criterio);
        }
        
        catch (Exception e){
            
        }
    }
    
}
