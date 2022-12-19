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
public class Ejercicio13 {

    /**
     * @param args Dibujar un cuadrado de N elementos por lado utilizando el
     * carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se
     * deberá dibujar lo siguiente: ***** * * * * * * *****
     *
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del Cuadrado");
        int tam = leer.nextInt();
        //Techo del cuadrado
        for (int i = 0; i < tam; i++) {
            if (i == 0) {
                for (int j = 0; j < tam; j++) {
                    System.out.print("*");
                }
            }
        }

        //salto de linea
        System.out.println("");

        //Lado del cuadrado
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (!(j == 0)&&!(j==tam-1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (j == tam - 1) {
                    System.out.println("");
                }

            }
            
        }

        
        //Base del cuadrado
        for (int i = 0; i < tam; i++) {
            if (i == 0) {
                for (int j = 0; j < tam; j++) {
                    System.out.print("*");
                }
            }
        }
        //salto de linea
        System.out.println("");
    }

}
