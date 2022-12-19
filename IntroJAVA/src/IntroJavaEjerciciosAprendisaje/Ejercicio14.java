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
public class Ejercicio14 {

    /**
     * @param args Crea una aplicación que a través de una función nos convierta
     * una cantidad de euros introducida por teclado a otra moneda, estas pueden
     * ser a dólares, yenes o libras. La función tendrá como parámetros, la
     * cantidad de euros y la moneda a converir que será una cadena, este no
     * devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
     * El cambio de divisas es: 
     * 0.86 libras es un 1 € 
     * 1.28611 $ es un 1 €
     * 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué cantidad de euros desea convertir?");
        Convertidor();
        
    }
    public static void Convertidor() {
        Scanner leer = new Scanner(System.in);
        int euro = leer.nextInt();
        double libra = (euro*0.86);
        double dolar = (euro*1.28611);
        double yen = (euro*129.852);
        System.out.println("La cantidad de introducida de euros en libras es: "+libra+" libras");
        System.out.println("La cantidad de introducida de euros en Dolares es: "+dolar+" $");
        System.out.println("La cantidad de introducida de euros en Yenes es: "+yen+" yenes");
        
    }
}
