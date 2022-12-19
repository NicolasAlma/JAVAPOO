/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author tu
 * Escriba un programa que valide si una nota está entre 0 y 10, sino no está entre 0 y 10 la nota se
   pedirá de nuevo hasta que la nota sea correcta.
 * 
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextByte();
        while (nota>10||nota<0){
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextByte();    
        }         
    }
    
}
