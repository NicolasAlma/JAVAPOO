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
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioPersona {
    Scanner leer = new Scanner(System.in);
    /*Metodo crearPersona(). 
    Este método rellena el objeto mediante un Scanner y le pregunta al 
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    public Persona crearPersona(){
        //Se le pide al usuario los datos correspondientes 
        System.out.println("¿Cuál es el nombre de la persona?");
        String nombre = leer.next();
        System.out.println("------------------------------");
        //Variable que actua como entrada y salida de bucles
        boolean Salir = true;
        System.out.println("¿Que día nació?");
        int dia = leer.nextInt();
        //Bucle que realiza la coherencia del dia ingresado
        do {
            if (dia > 31 || dia < 0) {
                System.out.println("Ingrese un dia coherente al calendario gregoriano");
                dia = leer.nextInt();
            } else {
                Salir = false;
            }
        } while (Salir);
        System.out.println("------------------------------");
        Salir = true;
        System.out.println("¿Que mes?");
        int mes = leer.nextInt();
        //Bucle que realiza la coherencia del mes ingresado
        do {
            if(mes<0||mes>12){
                System.out.println("Ingrese un mes coherente al calendario gregoriano");
                mes = leer.nextInt();
            }else{
                Salir=false;
            }
        } while (Salir);
        System.out.println("------------------------------");
        System.out.println("¿Que año?");
        int anio = leer.nextInt();
        //Se crea la fecha con los datos de nacimiento
        Date fecha = new Date(anio-1900, mes, dia);
        //Se retorna a la clase persona los datos ingresados
        return new Persona(nombre, fecha);
    }    
    /*
    * Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
    actual.
    */
    public void calcularEdad(Persona actual){
         //Se crea una variable que aloje la diferencia de años
        int resultado;
        //Se intancia la fecha actual mediante la clase Date
        Date fechaActual = new Date();
        /*
        Se obtiene el año de la fecha actual mediante getYear y tambien de la fecha de nacimiento,
        se realiza el calculo mediante el siguiente condicional:
        */
        //Si la fechaActual es mayor a la persona
        if (fechaActual.getYear()>actual.getFecha().getYear()) {
            //Entonces se realiza el calculo de las fechas:
            resultado = fechaActual.getYear()-actual.getFecha().getYear();
            System.out.println("La edad de la persona es: "+resultado+" años");
        }else{
            //Entonces no se realiza el calculo
            System.out.println("La persona no nació o se ingreso una fecha incorrecta");
        }
    }
    /*
    * Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
    se recibe como parámetro, o false en caso contrario.
    */
    public boolean menorQue(int edad,Persona actual){
        //Se realiza el calculo de la edad de la persona actual:
        //Se realiza un procedimiento similar al calcularEdad
        Date fechaActual = new Date();
        //Edad de la persona actual
        int actualEdad= fechaActual.getYear()-actual.getFecha().getYear();
        /*
        Con la edad de la persona actual obtenida se realiza un condicional para 
        verificar si la edad por parametro es mayor o menor que la actual.
        */
        //Variable logica que aloja la verificacion
        boolean verdad;
        //Si la edad actual es mayor que la por parametro
        if (actualEdad>edad) {
            //entonces la persona por parametro es menor que la actual
            verdad=false;
        }else{
            //entonces la persona por parametro es mayor que la actual
            verdad=true;
        }
        return verdad;
    }
    /*
    * Metodo mostrarPersona(): este método muestra la persona creada en el método 
    anterior.
    */
    public void mostrarPersona(Persona actual,boolean verdad){
        //muestra la persona
        System.out.println(actual);
        //muestra la verificacion de edad entre dos personas
        System.out.println("¿La edad qué ingreso es mayor a la persona? "+verdad);    
    }
    
}
