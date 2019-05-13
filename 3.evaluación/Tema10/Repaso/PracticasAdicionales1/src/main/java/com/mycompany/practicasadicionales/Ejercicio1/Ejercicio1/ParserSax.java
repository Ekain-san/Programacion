/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasadicionales.Ejercicio1.Ejercicio1;

import com.mycompany.practicasadicionales.Ejercicio1.Xml.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Asus
 */
public class ParserSax {
    public static void main(String[] args) {
    System.out.println("--- SAX (lectura) ---\n");

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();

            GestorCentros handler = new GestorCentros();
            InputSource centros = new InputSource(new StringReader(Xml.tomarXml()));

            saxParser.parse(centros, handler);

            List<Centro> tendencias = handler.getCentro();

            for (Dato d : tendencias)
                System.out.println(d);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
