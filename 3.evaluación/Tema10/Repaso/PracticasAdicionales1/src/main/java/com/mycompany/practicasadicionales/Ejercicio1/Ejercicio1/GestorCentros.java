/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasadicionales.Ejercicio1.Ejercicio1;

import com.mycompany.practicasadicionales.Ejercicio1.Clases.Centro;
import com.mycompany.practicasadicionales.Ejercicio1.Clases.tipoDato;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Asus
 */
public class GestorCentros {
    public class Gestor extends DefaultHandler{
    private List<Centro> centros = new ArrayList<>();

    private Centro cent = null;

    private tipoDato tipo = null;

    private StringBuilder builder = new StringBuilder();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {
            case "centro":
                cent = new Centro();
            case "codigo":
                tipo=tipoDato.CODIGO;
                break;
            case "nombre":
                tipo = tipoDato.NOMBRE;
                break;
            case "direccion":
                tipo = tipoDato.DIRECCION;
                break;
            case "desc_provincia_es":
                tipo = tipoDato.LOCALIDAD;
                break;
            case "provincia":
                tipo = tipoDato.PROVINCIA;
        }
        builder.setLength(0);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        builder.append(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String provincia = "";
        String texto = builder.toString();
        
        if (qName.equals("row")) {
            centros.add(cent); 
        }
        
        else{
            switch (tipo) {
                case CODIGO:
                    cent.setCodigo(Integer.parseInt(texto));
                    cent.setProvincia(provincia);
                    break;
                case NOMBRE:
                    cent.setNombre(texto);
                    break;
                case DIRECCION:
                    cent.setDireccion(texto);
                    break;
                case LOCALIDAD:
                    cent.setLocalidad(texto);
                    break;
                case PROVINCIA:
                    provincia=texto;
                    break;
            }
        }
    }

    public List<Centro> getDatos() {
        return centros;
    }
}
}
