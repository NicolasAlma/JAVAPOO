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
public class Ejercicio1 {

    /**
     * @param args 
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
       dos. El programa deberá después mostrar el resultado de la suma
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Primer numero a sumar");
        int num1 = leer.nextInt();
        System.out.println("Segundo numero a sumar");
        int num2 =leer.nextInt();
        System.out.println("El resultado de ambas es: "+Calculo(num1,num2));
        
    }
    public static int Calculo(int num1, int num2) {
        
        int suma = num1 + num2;
        
        return suma;
        
    }
}
