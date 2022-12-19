/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

/**
 *
 * @author tu
 */
public class Ejercicio18 {

    /**
     * @param args Realizar un programa que rellene un matriz de 4 x 4 de
     * valores aleatorios y muestre la traspuesta de la matriz. La matriz
     * traspuesta de una matriz A se denota por B y se obtiene cambiando sus
     * filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        int[][]MatrizA = new int[4][4];
        int[][]MatrizB = new int[4][4];
        AsignarMatriz(MatrizA);
        System.out.println("Matriz A");
        MostrarMatriz(MatrizA);
        //Salto de linea
        System.out.println("");
        //Asignamos a la matriz b, que es la traspuesta los valores de la matriz a
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                MatrizB[j][i]=MatrizA[i][j];
            }
        }
        //Se imprime la matriz Traspuesta
        System.out.println("Matriz B (Traspuesta de la A)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+MatrizB[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    
    public static void MostrarMatriz(int [][]MatrizA) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("("+MatrizA[i][j]+")"); 
            }
            System.out.println("");
        }
    }
  
    public static void AsignarMatriz(int [][]MatrizA) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                MatrizA[i][j]=(int) (Math.random()*10);
            }
        }
    }
}
