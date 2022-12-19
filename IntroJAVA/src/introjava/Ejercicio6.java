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
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
   alguno de ellos es mayor a 25.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int Num1 = leer.nextInt();
        System.out.println("Ingrese Otro numero Entero");
        int Num2 = leer.nextInt();
        
        if (Num2>25&Num1>25){//Si ambos son MAYORES A 25
            System.out.println("Los dos numero ingresados son mayores a 25");
            
        }else{
            if ((Num1<25&Num2>25)||(Num1>25&Num2<25)){//Si alguno de ellos es mayor a 25
                System.out.println("Alguno de los numero es mayor a 25");
            }else{//Ninguno es mayor a 25
                System.out.println("Ninguno de los numero es mayor a 25");
            }      
        }
                
    }
    
}
