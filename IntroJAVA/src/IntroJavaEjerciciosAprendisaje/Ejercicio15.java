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
public class Ejercicio15 {

    /**
     * @param args Realizar un algoritmo que rellene un vector con los 100
     * primeros números enteros y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        int[] Vector = new int[100];
        int a=0;
        //Rellena el vector
        for (int i = 0; i < 100; i++) {
            a++;
            Vector[i]=a;
        }
        
        //Muestra el vector de forma descendente
        for (int i = 99; i > -1; i--) {
            System.out.println("["+Vector[i]+"]");
        }
        
        
    }

}
