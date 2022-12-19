/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

import com.sun.corba.se.impl.oa.poa.DelegateImpl;
import java.lang.reflect.Parameter;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Ejercicio11 {

    /**
     * @param args Realizar un programa que pida dos números enteros positivos
     * por teclado y muestre por pantalla el siguiente menú: MENU
     *
     * 1. Sumar
     *
     * 2. Restar
     *
     * 3. Multiplicar
     *
     * 4. Dividir
     *
     * 5. Salir
     *
     * Elija opción:
     *
     * El usuario deberá elegir una opción y el programa deberá mostrar el
     * resultado por pantalla y luego volver al menú. El programa deberá
     * ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el
     * usuario selecciona la opción 5, en vez de salir del programa
     * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
     * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
     * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
     * menú.
     */
    public static void main(String[] args) {
        boolean Parar =true;
        int desicion=0;
        do {
            desicion=Principal(desicion);
            if (desicion==5) {
                Parar=false;
            }
        } while (Parar=true);
        
    }

    public static int Principal(int desicion) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int decision = 0;
        int Calculo = 0;
        //Le pido al usuario dos numeros a operar
        do {
            System.out.println("Ingrese dos numeros enteros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while ((num1 < 0) && (num2 < 0));

        //Le muestro el menu de opciones
        decision = MostrarMenu(decision);
        //Realizamos la operacion que decidio el usuario
        Calculo = Operacion(decision, Calculo, num1, num2);
        System.out.println("La operacion resulta: " + Calculo);
        return desicion;
    }

    public static int MostrarMenu(int decision) {
        Scanner leer = new Scanner(System.in);
        String elegi;
        do {
            System.out.println("¿Que operacion desea realizar con ellos?");
            System.out.println("Menu");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            decision = leer.nextInt();
        } while ((decision > 5) || (decision < 1));
        //Si el usuario al iniciar el programa toma la opcion 5
        
        //CORREGIR !!!
        if (decision == 5) {
            System.out.println("¿Está seguro que desea salir del programa (S/N)?");
            elegi = leer.nextLine();
            if (elegi.equals("S")) {
                decision=5;
            }else{
                decision = MostrarMenu(decision);
            }
        }
        return decision;
    }

    public static int Operacion(int decision, int Calculo, int num1, int num2) {
        Scanner leer = new Scanner(System.in);
        int suma;
        int resta;
        int razon;
        int cociente;
        switch (decision) {
            case 1://Sumar las dos variables
                suma = num1 + num2;
                Calculo = suma;
                break;
            case 2:
                resta = num1 - num2;
                Calculo = resta;
                break;
            case 3:
                razon = num1 * num2;
                Calculo = razon;
                break;
            case 4:
                cociente = num1 / num2;
                Calculo = cociente;
                break;
        }

        return Calculo;
    }

}
