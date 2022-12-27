/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
* Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual. 
* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
* Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package javapooejercicio12;

import Entidades.Persona;
import Servicios.servicioPersona;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se instancia las funciones del objeto con la clase Servicio
        servicioPersona AU = new servicioPersona();
        //Se instancia la persona con la clase persona y se le asigna las funciones del objeto antes creado
        Persona P1 = AU.crearPersona();
        //Se muestra la edad de la persona 
        System.out.println("----------------------------------------");
        AU.calcularEdad(P1);
        //Se cuestiona al usuario por una edad 
        System.out.println("----------------------------------------");
        System.out.println("¿Que edad es mayor a la persona creada?");
        int edad = leer.nextInt();
        //Se muestra la persona creada y verificacion de la edad de la persona
        AU.mostrarPersona(P1, AU.menorQue(edad, P1));

    }

}
