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
public class Ejercicio16 {

    /**
     * @param args Realizar un algoritmo que rellene un vector de tamaño N con
     * valores aleatorios y le pida al usuario un numero a buscar en el vector.
     * El programa mostrará donde se encuentra el numero y si se encuentra
     * repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Vector");
        int tam = leer.nextInt();
        //define el vector y le asigna el tamaño elegido
        int[] vector = new int[tam];
        //rellena el vector con numeros aletorios
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        //Escribe el vector
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        //Salto de linea
        System.out.println("");
        //Se define un numero a ingresar
        int num;
        //Se asegura que ingrese el usuario numero entre 0 y 9
        do {
            System.out.println("¿Qué numero desea buscar?(entre 0 a 9)");
            num = leer.nextInt();
        } while ((num > 9) || (num < 0));
        //Busca en el vector
        int pos;
        int Rep = 0;
        for (int i = 0; i < tam; i++) {
            if (num == vector[i]) {
                //Condicional para que no escriba el numero repetido, sino lo escribe de nuevo.
                if (Rep == 0) {
                    pos = i;
                    //Escribe la posicion que esta el numero elegido
                    System.out.println("El numero " + num + " se encuentra en la posicion: " + i);
                    //busca en el resto del vector si esta repetido el numero elegido
                    for (int j = pos + 1; j < tam; j++) {
                        if (num == vector[j]) {
                            Rep++;
                        }
                    }
                    
                    //Escribe si se repite el numero
                if (Rep != 0) {
                    System.out.println("El numero se repite: " + Rep + " veces");
                    for (int j = pos + 1; j < tam; j++) {
                        if (num == vector[j]) {
                            System.out.println("los numeros repetidos se encuentran en las posiciones: [" + j + "]");
                        }
                    }
                }
                    
                }

                
            }
        }

    }

}
