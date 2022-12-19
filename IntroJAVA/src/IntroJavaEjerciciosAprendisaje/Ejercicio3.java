/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Ejercicio3 {

    /**
     * @param args 
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
       en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese alguna palabra");
        String Palabra = leer.nextLine();
        String PalabraMAY=Palabra.toUpperCase();
        String PalabraMIN=Palabra.toLowerCase();
        System.out.println("");
        System.out.println("Palabra ingresada en Minusculas "+PalabraMIN);
        System.out.println("");
        System.out.println("Palabra ingresada en Mayusculas "+PalabraMAY);
    }
    
}
