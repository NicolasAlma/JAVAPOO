/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos: 
a) Método constructor con todos los atributos pasados por parámetro. 
b) Metodo constructor sin los atributos pasados por parámetro. 
c) Métodos get y set. 
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
en los atributos del objeto. 
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
f) Método restar(): calcular la resta de los números y devolver el resultado al main 
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al main 
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class operacionServicio {

    Scanner leer = new Scanner(System.in);

    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto. 
    public Operacion crearOperacion() {
        //Instanciamos un objeto, con la clase Operacion
        Operacion Opera = new Operacion();
        //Variable Auxiliar que guarda numero ingresados por el usuario
        System.out.println("Ingrese un numero");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese Otro numero");
        double num2 = leer.nextDouble();
        //Con los numeros ingresados por el usuario los setiamos al objeto Creado
        Opera.setNumero1(num1);
        Opera.setNumero2(num2);

        return Opera;
    }

    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(Operacion Opera) {
        //Creo una varible que aloje la suma
        double suma;

        suma = (Opera.getNumero1()) + (Opera.getNumero2());

        System.out.println("La Suma de los numeros ingresados es: " + suma);
    }

    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void restar(Operacion Opera) {
        //Creo una varible que aloje la suma
        double resta;

        resta = (Opera.getNumero1()) - (Opera.getNumero2());

        System.out.println("La Resta de los numeros ingresados es: " + resta);
    }

    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    public double multiplicar(Operacion Opera) {
        //Primero se evalua que no se haga una multiplicacion por cero
        double Resultado;
        Resultado = (Opera.getNumero1()) * (Opera.getNumero2());
        if (Resultado != 0) {
            System.out.println("La multiplicacion de los numeros ingresados es: " + Resultado);
        } else {
            System.out.println("El resultado da cero");
        }
        return Resultado;
    }

    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public double dividir(Operacion Opera) {
        double Res2;
        //Se evalua que la division no se entre cero
        if (Opera.getNumero1() == 0 || Opera.getNumero2() == 0) {
            Res2 = 0;
            System.out.println("La division no existe: " + Res2);
        } else {
            Res2 = (Opera.getNumero1()) / (Opera.getNumero2());
            System.out.println("La Resultado es : " + Res2);
        }
        return Res2;
    }

}
