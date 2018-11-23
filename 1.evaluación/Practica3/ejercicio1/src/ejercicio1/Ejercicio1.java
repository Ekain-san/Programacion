/*
package ejercicio1;

import Excepciones.EstadoCivilException;
import Excepciones.MuchosCaracteresException;
import Excepciones.NivelEstudiosException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */import javax.swing.JOptionPane;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    byte horasTrabajadas = 0;
    float valorNormal = 10;
    float valorExtra = 15;
    float plus = 100f;
    char estadoCivil = 0;
    char nivelEstudios = 0;
    boolean correcto = false;
    float sueldo;
        do
        {
            try
            {
                horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));
                correcto = true;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "La información dada no es valida, prueve con un numero");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error, vuelva a intentarlo de nuevo");
            } 
        }while(correcto == false);
        
        do
        {
            try
            {
                String ne = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador").toUpperCase();
                if (ne.length()!= 1)
                    throw new MuchosCaracteresException();
                nivelEstudios = ne.charAt(0);
                if (nivelEstudios != 'P'  && nivelEstudios != 'M' && nivelEstudios != 'S')
                    throw new NivelEstudiosException();
                correcto = true;
            }
            
            catch(MuchosCaracteresException e)
            {
                JOptionPane.showMessageDialog(null, "A metido un termino no valido, pruebe a meter alguna de las siglas ya mencionadas");
            }
            
            catch(NivelEstudiosException e)
            {
                JOptionPane.showMessageDialog(null, "A metido un termino no valido, pruebe a meter alguna de las siglas ya mencionadas");
            }
            
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "A metido un termino no valido, pruebe a meter alguna de las siglas ya mencionadas");
            } 
        }while(correcto == false);
        
        do
        {
            try
            {
                estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador").charAt(0);
                estadoCivil = Character.toUpperCase(estadoCivil);

                if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V')
                     throw new EstadoCivilException();
                correcto = true;
            }
            catch(EstadoCivilException e){
                JOptionPane.showMessageDialog(null, "A metido un termino no valido, pruebe a meter alguna de las siglas ya mencionadas");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "A metido un termino no valido, pruebe a meter alguna de las siglas ya mencionadas");
            }
            
            }while(correcto == false);
                
        if (horasTrabajadas > 40) // 40 podría ser otra constante
            sueldo = (horasTrabajadas - 40) * valorExtra + 40 * valorNormal;
        else
            sueldo = horasTrabajadas * valorNormal; 
                
        if (nivelEstudios == 'S')
            sueldo = sueldo + plus;
        else
            if (estadoCivil == 'S')
                sueldo= sueldo + plus;
            else
                if (estadoCivil == 'V' && nivelEstudios == 'P')
                    sueldo=sueldo + plus;
        JOptionPane.showMessageDialog(null,"El seueldo es de "+sueldo+"€");   
        } 
    }
    
