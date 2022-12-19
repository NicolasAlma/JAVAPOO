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
public class Ejercicio20 {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] Matriz = new int[3][3];
        //llama la funcion llenar para asignar los valores a la matriz
        Llenar(Matriz);
        //Muestra la Funcion Ingresada
        Mostrar(Matriz);
        //Salto de Linea
        System.out.println("");
        //Calcular los valores
        Calculo(Matriz);
        

    }

    public static void Llenar(int[][] Matriz) {
        Scanner leer = new Scanner(System.in);
        //Rellena la Matriz
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un valor entre 1-9");
                    num = leer.nextInt();
                } while (num > 9 || num < 0);
                Matriz[i][j] = num;
            }
        }

    }

    public static void Mostrar(int[][] Matriz) {
        //Escribe en la consola la matriz ingresada.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + Matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

    public static void Calculo(int[][] Matriz) {
        boolean ColumnasIguales=false;
        boolean FilasIguales=false;
        int DiagonalMAYOR = 0;
        int DiagonalMENOR = 0;
        int Columna1=0;
        int Columna2=0;
        int Columna3=0;
        int Fila1=0;
        int Fila2=0;
        int Fila3=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //Sumo las Diagonales
                if (i == j) {
                    //+= significa que se suma asi: DiagonalMAYOR = DiagonalMAYOR + Matriz[i][j];
                    DiagonalMAYOR += Matriz[i][j];
                }
                if (i == (2 - j)) {
                    DiagonalMENOR += Matriz[i][j];
                }
                //Sumo las Filas
                if (j==0){
                    Columna1+= Matriz[i][j];
                }
                if (j==1){
                    Columna2+= Matriz[i][j];
                }   
                if (j==2){
                    Columna3+= Matriz[i][j];
                }            
                //Sumo las Columnas
                if (i==0){
                    Fila1+= Matriz[i][j];
                }
                if (i==1){
                    Fila2+= Matriz[i][j];
                }    
                if (i==2){
                    Fila3+= Matriz[i][j];
                }
                
            }
        }
        //Comparo las columnas para saber si es magica
        if ((Columna1==Columna2)&&(Columna1==Columna3)&&(Columna2==Columna3)){
            ColumnasIguales=true;
        }else{
            ColumnasIguales=false;
        }
        //lo mismo lo hago con las filas
        if ((Fila1==Fila2)&&(Fila1==Fila3)&&(Fila2==Fila3)) {
            FilasIguales=true;
        }else{
            FilasIguales=false;
        }
        //Comparo todos los resultados
        if ( (FilasIguales==true)&&(ColumnasIguales==true)&&(DiagonalMAYOR==DiagonalMENOR)){
            System.out.println("!La Matriz es Magica!");
        }else{
            System.out.println("La Matriz no es Magica :c");
        }
        //salto de pagina
        System.out.println("");
        //Que valores tomo?
        System.out.println("La Suma de la Diagonal Mayor es: "+DiagonalMAYOR);
        System.out.println("La Suma de la Diagonal Menor es: "+DiagonalMENOR);
        System.out.println("¿Las Filas son iguales?"+FilasIguales);
        System.out.println("¿Las Columnas son iguales?"+ColumnasIguales);
    }

}
