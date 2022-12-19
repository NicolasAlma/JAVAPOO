/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author tu
 *  Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
    ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 ** 
 * 
 * 
 * 
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Ingrese un numero (Aviso debe ser en el Rango 1 a 20)");
                num = leer.nextInt();
                
            }while(num>=21||num<=0);
            
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
