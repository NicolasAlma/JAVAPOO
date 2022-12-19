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
public class Ejercicio4 {

    /**
     * @param args 
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
       Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué cantidad de grados centígrados desea convertir a Fahrenheit?");
        double c =leer.nextDouble();
        
        System.out.println("La cantidad de Grados Centigrados en Fahrenheit es: "+Calculo(c)+"F");
    }
    public static double Calculo(double c){
        
       double F = 32 + (9 * c / 5);
        
       return F;
    }
            
}
