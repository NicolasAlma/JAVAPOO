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
 */
public class Ejercicio12 {

    /**
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
        segundo, sino informe que no lo son.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero a evaluar");
        int num1 = leer.nextInt();
        System.out.println("ingrese un numero que sea multiplo del Primero que ingreso");
        int num2 = leer.nextInt();
        Evaluar(num1,num2);
        
    }
    
    public static void Evaluar(int num1,int num2) {
      int Resultado = num1 % num2;
        if (Resultado==0){
            System.out.println("El ultimo numero ingresado es multiplo del primero");
        }else{
            System.out.println("El ultimo numero ingresado no es multiplo del primero");
        }
        
    }
    
    
}
