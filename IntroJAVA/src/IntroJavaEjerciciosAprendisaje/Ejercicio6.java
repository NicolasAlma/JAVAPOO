/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author tu
 */
public class Ejercicio6 {

    /**
     * @param args Crear un programa que dado un numero determine si es par o
     * impar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o impar");
        int num = leer.nextInt();
        if (num == 0) {
            System.out.println("El numero ingresado no es par ni impar");
        } else {
            double Resultado = num % 2;
            if (Resultado == 0) {
                System.out.println("El numero ingresado es par");
            } else {
                System.out.println("El numero ingresado es impar");
            }
        }

    }

}
