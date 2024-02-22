/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

 package com.mycompany.app;

 import java.util.Arrays;
 
 public class App {
    static String[] planets = {"Mercurio", "Vênus", "Terra", "Marte", "Júpiter"};
     public static void main(String[] args) {
        System.out.println("Planetas: " + Arrays.toString(planets));


        for (int i = planets.length - 1; i > 0; i--) {
            planets[1] = planets[i - 1];
        }
        System.out.println("Planetas após a modificação: " + Arrays.toString(planets));

        // adiciona um novo valor
        planets[1] = "VENUS";
        System.out.println("Adiciona novo elemento:" + Arrays.toString(planets));

        // Insere um elemento em uma posição arbitrária
        int position = 3;
        for (int i = planets.length-1; i > position; i--) {
            planets[i] = planets[i-1];
            planets[position] = "MARTE";
            System.out.println("Adiciona novo elemento na posição "  + position + ":" + Arrays.toString(planets));
        }

        // apaga um elemento em uma posição arbitrária
        int newPosition = 2;
        for (int i = newPosition; i < planets.length -1 ; ++i) {
            planets[i] = planets[i + 1];
            System.out.println("remove o elemento "  + newPosition + ":" + Arrays.toString(planets));
        }
     }
 }