/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Formas.*;

/**
 *
 * @author Asus
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
        // Vuelo
        Vuelo v= new Vuelo();
        v.setNumeroDeVuelo(1);
        v.setHoraDeSalida("10:00");
        v.setHoraDeLlegada("15:00");
        v.setLugarDeOrigen("Foronda");
        v.setLugarDeDestino("Los Rodeos");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
	String fechaSalida = "15-01-2019";
	Date date = sdf.parse(fechaSalida);
	v.setFechaDeSalida(date);
        
        String fechaLlegada = "20-01-2019";
	date = sdf.parse(fechaLlegada);
        v.setFechaDeRegreso(date);
        
        v.setTipoDeVuelo("comercial");
        
        // Relación de vuelo con avión. Primero creo el objeto y después los relaciono.
        Avion a = new Avion();
        a.setAerolinea("Iberia");
        a.setCodigoDeAvion("001");
        a.setNumeroDeAsientos(100);
        a.setCompartimentos("dos");
        
        // Relación
        v.setAvion(a);
        a.setVuelo(v);
        
        // Relación de vuelo con piloto.
        Piloto p = new Piloto();
        p.setCodigoPiloto("098");
        p.setNombre("Nieves");
        p.setApellido("Ruiz");
        p.setNumeroDeLicencia(9);
        // Relación
        v.setPiloto(p);
        ArrayList<Vuelo> l = p.getListaVuelos();
        l.add(v);
        p.setListaVuelos(l);
        
        // Relación con asientos. Se supone que son 100. Creo sólo tres.
        ArrayList<Asiento> lista = new ArrayList();
        
        Asiento as = new Asiento();
        as.setNumeroAsiento(1);
        as.setEstado(true);
        as.setCompartimento("uno");
        
        as.setVuelo(v);
        
        lista.add(as);
        
        as = new Asiento();
        as.setNumeroAsiento(2);
        as.setEstado(true);
        as.setCompartimento("uno");
        
        as.setVuelo(v);
        
        lista.add(as);
        
        as = new Asiento();
        as.setNumeroAsiento(3);
        as.setEstado(false);
        as.setCompartimento("dos");
        
        as.setVuelo(v);
        
        lista.add(as);
        
        v.setListaAsientos(lista);
        
        // Pasajeros
        Pasajero pa = new Pasajero();
        pa.setCedula("11.111.111A");
        pa.setNombre("Pepe");
        pa.setApellido("Gonzalez");
        pa.setSexo("Masculino");
        pa.setEdad(30);
        
        v.setPasajero(pa);
        pa.setVuelo(v);
        
        pa.setAsiento(as);
        as.setPasajero(pa);
        
        // Ciudad
        Ciudad c = new Ciudad();
        c.setNombre("Vitoria");
        c.setCodigoCiudad("01");
        c.setVuelo(v);
        v.setCiudad(c);
        System.out.println("Fin");
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
}
