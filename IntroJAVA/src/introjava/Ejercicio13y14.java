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
public class Ejercicio13y14 {

    /**
     * @param args the command line arguments Crea un vector llamado ‘Equipo’
     * cuya dimensión sea la cantidad de compañeros de equipo y define su tipo
     * de dato de tal manera que te permita alojar sus nombres más adelante.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[6];
        int cont = 0;
        do {
            System.out.println("Ingrese un nombre a almacenar");
            String Nombre = leer.nextLine();
            Equipo[cont] = Nombre;
            cont++;
        } while (cont != 6);
        Escribir(Equipo);

    }

    public static void Escribir(String[] Equipo) {
        System.out.println("Los nombres Del equipo son:");
        for (int i = 0; i < 6; i++) {
            System.out.println(Equipo[i]);
        }
    }
}
