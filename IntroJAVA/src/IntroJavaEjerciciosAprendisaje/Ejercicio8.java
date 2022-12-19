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
public class Ejercicio8 {

    /**
     * @param args Realizar un programa que solo permita introducir solo frases
     * o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8
     * de largo se deberá de imprimir un mensaje por pantalla que diga
     * “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
     * investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int longitud;
        do {            
            System.out.println("Ingrese alguna palabra o frase de solo 8 de largo");
            frase = leer.nextLine();
            longitud = frase.length();
            if ((longitud<8)&&(longitud<8)) {
                System.out.println("Incorrecto");
            }
        } while (longitud!=8);
        
        System.out.println("correcto");
        
        
        
        
        
        
        
        
        
    }

}
