/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author tu Escribir un programa que procese una secuencia de caracteres
 * ingresada por teclado y terminada en punto, y luego codifique la palabra o
 * frase ingresada de la siguiente manera: cada vocal se reemplaza por el
 * carácter que se indica en la tabla y el resto de los caracteres (incluyendo a
 * las vocales acentuadas) se mantienen sin cambios. a e i o u
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 *
 *
 *
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una oracion a codificar");
        String Palabra = leer.nextLine();
        int largo;
        largo = Palabra.length();
        System.out.println("La Parabra codificada es: " + Codificar(Palabra, largo));

    }

    public static String Codificar(String Palabra, int largo) {
        String letra;
        String Oracion = null;
        for (int i = 0; i < largo; i++) {
            letra = Palabra.substring(i, i+1);

            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    letra = letra;
            }

            Oracion = letra.concat((String) letra);
        }

        return Oracion;

    }

}
