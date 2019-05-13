/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasadicionales.Ejercicio1.Xml;

import java.io.IOException;
import java.util.Arrays;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 *
 * @author Asus
 */
public class Xml {
    public static String tomarXml() {
        String respuesta = null;
        OkHttpClient client = new OkHttpClient.Builder()
                .connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT))
                .addInterceptor(new EncodingInterceptor())
                .build();
        
        Request request = new Request.Builder()
                .url("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/alojamiento_de_euskadi/opendata/alojamientos.xml")
                .get()
                .addHeader("cache-control", "no-cache")
                .build();  
        
        try {
            Response response = client.newCall(request).execute();
            if (response.body() != null) {
                respuesta = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    
    public static void main(String[] args) {
        System.out.println("--- ds_recursos_turisticos XML, alojamientos ---\n");
        System.out.println(tomarXml());
    }
    
    // REF: Corregir la codificación erronea del servidor OpenData: https://stackoverflow.com/a/45285135
    private static class EncodingInterceptor implements Interceptor {
        @Override
        
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response response = chain.proceed(chain.request());
            MediaType mediaType = MediaType.parse("application/json; charset=iso-8859-1");
            ResponseBody modifiedBody = ResponseBody.create(mediaType, response.body().bytes());
            return response.newBuilder()
                .body(modifiedBody)
                .build();
        }
    }   
}
