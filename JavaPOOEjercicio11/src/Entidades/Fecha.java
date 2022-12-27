/*
 *En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author tu
 */
public class Fecha {
    //Atributo
    private Date fecha;
    //Constructor Vacio
    public Fecha() {
    }
    //Constructor Con Parametro
    public Fecha(Date fecha) {
        this.fecha = fecha;
    }
    //Get and Set
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    //Metodo ToString
    @Override
    public String toString() {
        return "Fecha{" + "fecha=" + fecha + '}';
    }
}
