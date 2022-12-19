/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Ejercicio5 {

    /**
     * @param args Escribir un programa que lea un número entero por teclado y
     * muestre por pantalla el doble, el triple y la raíz cuadrada de ese
     * número. Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a calcular");
        double num = leer.nextDouble();
        Evaluar(num);

    }

    public static void Evaluar(double num) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué desea calcular de ese numero?");
        System.out.println("1-El doble del numero");
        System.out.println("2-El triple del numero");
        System.out.println("3-La raiz cuadrada del numero");
        int Elegir = leer.nextInt();
        switch (Elegir) {
            case 1:
                double doble = num * 2;
                System.out.println("El doble de numero ingresado es: " + doble);
                break;
            case 2:
                double triple = num * 3;
                System.out.println("El triple de numero ingresado es: " + triple);
                break;
            case 3:
                double raiz = sqrt(num);
                System.out.println("La Raiz Cuadrada del numero ingresado es: " + raiz);
                break;
            default:
                break;
        }

    }

}
