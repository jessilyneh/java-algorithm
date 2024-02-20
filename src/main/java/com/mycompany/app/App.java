/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

 package com.mycompany.app;

 import java.util.Arrays;
 
 public class App {
     static String[] planets = {"Mercurio", "Vênus", "Terra", "Marte", "Júpiter"}; // Inicializa o array com valores
 
     public static void main(String[] args) {
         System.out.println("Planetas: " + Arrays.toString(planets));
     }
 }
