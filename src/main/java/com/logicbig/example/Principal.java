/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbig.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author renzo
 */
public class Principal {

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) {
            while ((cadena = b.readLine()) != null) {
                System.out.println(cadena);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("src/main/java/com/logicbig/example/archivo.txt");
    }
}
