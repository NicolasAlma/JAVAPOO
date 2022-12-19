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
public class Ejercicio12 {

    /**
     * @param args the command line arguments Realizar un programa que simule el
     * funcionamiento de un dispositivo RS232, este tipo de dispositivo lee
     * cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
     * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
     * carácter tiene que ser X y el último tiene que ser una O. Las secuencias
     * leídas que respeten el formato se consideran correctas, la secuencia
     * especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
     * secuencia distinta de FDE, que no respete el formato se considera
     * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
     * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
     * ejercicio deberá investigar cómo se utilizan las siguientes funciones de
     * Java Substring(), Length(), equals().
     *
     *
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Palabra;
        String Verdad = "&&&&&";
        String PrimeraLetra;
        String UltimaLetra;
        String equis = "x";
        String O = "o";
        int Correcto = 0;
        int Incorrecto = 0;
        int longitud;
        do {
            do {
                System.out.println("Ingrese una palabra con la primera letra X y La ultima O(Maximo 5 letras)");
                Palabra = leer.nextLine();
                longitud = Palabra.length();
                PrimeraLetra = Palabra.substring(0, 1);
                UltimaLetra = Palabra.substring(longitud - 1, longitud);
                if ((longitud != 5) & (!PrimeraLetra.equals(equis)) & (!UltimaLetra.equals(O))) {
                    Incorrecto++;
                }
            } while (longitud != 5);

            if (longitud == 5) {
                Correcto++;
            } else {
                Incorrecto++;
            }

        } while (!Verdad.equals(Palabra));

        System.out.println("Las palabras correctas son: " + Correcto);
        System.out.println("Las palabras incorrectas son: " + Incorrecto);

    }

}