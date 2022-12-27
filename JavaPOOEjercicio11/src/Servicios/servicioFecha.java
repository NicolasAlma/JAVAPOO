/*
 *En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Servicios;

import Entidades.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioFecha {

    Scanner leer = new Scanner(System.in);

    //Metodo crearFecha que le pide al usuario el dia,mes,año de la fecha y la agrega a la clase Fecha
    public Fecha crearFecha() {
        //Se crean las variables que alojan el dia, mes y año elegido por el usuario
        int dia;
        int mes;
        int anio;
        //Variable que actua como entrada y salida de bucles
        boolean Salir = true;
        
        System.out.println("¿Qué dia ingresa?");
        dia = leer.nextInt();
        //Bucle que realiza la coherencia del dia ingresado
        do {
            if (dia > 31 || dia < 0) {
                System.out.println("Ingrese un dia coherente al calendario gregoriano");
                dia = leer.nextInt();
            } else {
                Salir = false;
            }
        } while (Salir);
        Salir = true;
        System.out.println("-------------------");
        System.out.println("¿Qué mes ingresa?");
        mes = leer.nextInt();
        //Bucle que realiza la coherencia del mes ingresado
        do {
            if(mes<0||mes>12){
                System.out.println("Ingrese un mes coherente al calendario gregoriano");
                mes = leer.nextInt();
            }else{
                Salir=false;
            }
        } while (Salir);
        System.out.println("-------------------");
        System.out.println("¿Qué año ingresa?");
        anio = leer.nextInt();
        System.out.println("-------------------");
        //Se crea la fecha mediante la clase Date
        Date fecha = new Date(anio - 1900, mes, dia);
        //Se retorna a la clase fecha correspondiente
        return new Fecha(fecha);
    }

    //Metodo fechaActual que muestra la fecha Actual
    public void fechaActual() {
        //Se intancia la fecha actual mediante la clase Date
        Date fechaActual = new Date();
        //Se imprime y muestra la fecha Actual 
        System.out.println("La fecha Actual es: " + fechaActual);
    }

    //Metodo MostrarFecha muestra la fecha ingresada
    public void mostrarFecha(Fecha actual) {
        System.out.println("La fecha ingresada es: " + actual.getFecha());
    }
    
    //Metodo calculo que muestra cuantos años hay entre esa fecha y la fecha actual
    public void Calculo(Fecha actual){
        //Se crea una variable que aloje la diferencia de años
        int resultado;
        //Se intancia la fecha actual mediante la clase Date
        Date fechaActual = new Date();
        /*
        Se obtiene el año de la fecha actual mediante getYear y tambien de la fecha ingresada,
        se realiza el calculo mediante el siguiente condicional:
        */
        //Si la fechaActual es mayor a la ingresada
        if (fechaActual.getYear()>actual.getFecha().getYear()) {
            //Entonces se realiza el calculo de las fechas:
            resultado = fechaActual.getYear()-actual.getFecha().getYear();
            System.out.println("La cantidad de años entre las fechas es: "+resultado+" años");
        }else{
            //Entonces no se realiza el calculo
            System.out.println("No hay años entre la fecha actual y la ingresada");
        }
    }
    
    
    
    
    
    
}
