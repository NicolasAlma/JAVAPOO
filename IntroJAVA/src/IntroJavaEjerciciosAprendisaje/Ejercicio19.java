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
public class Ejercicio19 {

    /**
     * @param args Realice un programa que compruebe si una matriz dada es anti
     * simétrica. Se dice que una matriz A es anti simétrica cuando ésta es
     * igual a su propia traspuesta, pero cambiada de signo. Es decir, A es anti
     * simétrica si A = -AT. La matriz traspuesta de una matriz A se denota por
     * AT y se obtiene cambiando sus filas por columnas (o viceversa).
     *
     */
    public static void main(String[] args) {
        int[][] MatrizA = new int[3][3];
        int[][] MatrizB = new int[3][3];
        AsignarMatriz(MatrizA);
        MostrarMatriz(MatrizA);
        //salto de linea
        System.out.println("");
        //Matriz Transpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizB[i][j]= (MatrizA[i][j]*(-1));
            }
        }
        //Imprime la matriz
        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+MatrizB[i][j]+"]");
            }
            System.out.println("");
        }  
    }

    public static void AsignarMatriz(int[][] MatrizA) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero para la matriz A");
                MatrizA[i][j] = leer.nextInt();
            }
        }
    }

    public static void MostrarMatriz(int[][] MatrizA) {
        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + MatrizA[i][j] + ")");
            }
            System.out.println("");
        }
    }
}
