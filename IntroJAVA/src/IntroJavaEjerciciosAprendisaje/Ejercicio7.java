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
public class Ejercicio7 {

    /**
     * @param args Crear un programa que pida una frase y si esa frase es igual
     * a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un
     * mensaje de Incorrecto. Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Palabra;
        int longitud;
        do {
            
            System.out.println("Ingrese una palabra (Que no sea mayor a 6 letras y menor a 0)");
            Palabra = leer.nextLine();
            longitud = Palabra.length(); 
            
        } while (longitud>6);
        
        if (Palabra.equals("eureka")) {
            System.out.println("La palabra ingresada es correcta");
        }else{
            System.out.println("La palabra ingresada es incorrecta");
        }

        
    }

}
