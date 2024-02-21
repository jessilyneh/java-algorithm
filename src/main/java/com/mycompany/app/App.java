/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

 package com.mycompany.app;

 import java.util.Arrays;
 
 public class App {
 
     public static void main(String[] args) {
        String[] planets = {"Mercurio", "Vênus", "Terra", "Marte", "Júpiter"};
        System.out.println("Planetas: " + Arrays.toString(planets));
 
        for (int i = planets.length - 1; i > 0; i--) {
            planets[1] = planets[i - 1];
        }
         
        System.out.println("Planetas após a modificação: " + Arrays.toString(planets));
     }
 }