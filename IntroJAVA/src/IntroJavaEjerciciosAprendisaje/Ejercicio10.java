/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author tu
 */
public class Ejercicio10 {

    /**
     * @param args Escriba un programa en el cual se ingrese un valor límite
     * positivo, y a continuación solicite números al usuario hasta que la suma
     * de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int num1;
        int suma=0;
        //Do para que el usuario ingrese solo valores positivos
        do {
            System.out.println("Ingrese un valor limite positivo");
            num = leer.nextInt();
        } while (num<=0);
        //white para que el usuario ingrese valores que se suman hasta el limite ingresado
        while (num>=suma) {
            System.out.println("Ingrese valor para sumar");
            num1 = leer.nextInt();
            suma = num1 + suma;
        }
        System.out.println("Supero el limite inicial"); 
        
        
        
        
    }

}
