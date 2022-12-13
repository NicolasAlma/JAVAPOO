/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
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
package javapooejercicio3;

import Entidades.Operacion;
import Servicios.operacionServicio;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un objeto Atraves de la clase Servicio
        operacionServicio OP = new operacionServicio();
        //Creo un Objeto Atraves de la clase Operacion Y le asigno los valores del metodo crearOperacion
        //Sino se llega a asignar los atributos del Objeto OM, estos quedan Vacios.
        Operacion OM = OP.crearOperacion();;
        ///Llamo los metodos correspondientes (Mediante el Objeto OM que posee los valores) :
        //Metodo Suma de la Clase Servicio
        OP.sumar(OM);
        //Metodo Resta de la Clase Servicio
        OP.restar(OM);
        //Metodo Multiplicar de la Clase Servicio
         OP.multiplicar(OM);
        //Metodo Dividir de la Clase Servicio
        OP.dividir(OM);
    }

}
