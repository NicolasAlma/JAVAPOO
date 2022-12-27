/*
 * En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();
 */
package javapooejercicio11;

import Entidades.Fecha;
import Servicios.servicioFecha;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se instancia mediante la clase servicio el objeto
        servicioFecha AU = new servicioFecha();
        //Se asigna las funciones de la clase servicio a la clase fecha
        Fecha F1 = AU.crearFecha();
        //Se Llama al metodo fechaActual Que muestra la fecha y poder ver y comparar con la antes ingresada
        AU.fechaActual();
        System.out.println("---------------------");
        //Muestra la fecha ingresada
        AU.mostrarFecha(F1);
        System.out.println("---------------------");
        //Realiza el calculo entre las fechas
        AU.Calculo(F1);
    }
    
}
