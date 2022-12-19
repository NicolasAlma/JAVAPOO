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
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
   Scanner.
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Un numero entero");
        int Num1 = leer.nextInt();
        System.out.println("Ingrese verdadero o falso");
        boolean verificar = leer.nextBoolean();
        System.out.println("Ingrese un numero para caracter");
        char Num2 = (char) leer.nextInt();
        
    }
    
}
