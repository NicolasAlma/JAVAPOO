/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 

a)Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 

b)Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores. 

c)Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package javapooejercicio9;

import Entidades.Matematicas;
import Servicios.servicioMatematicas;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio9 {

    /**
     * @param args En el main se creará el objeto y se usará el Math.random para
     * generar los dos números y se guardaran en el objeto con su respectivos
     * set.
     */
    public static void main(String[] args) {
       //Se instancia el objeto servicioMatematicas con el metodo CrearNumero
       servicioMatematicas AU = new servicioMatematicas();
       //Se intancia la clase Matematica y se le asigna la funciones del objeto antes creado
       Matematicas math = AU.CrearNumero();
        System.out.println("Los numeros que se generaron en la clase son: ");
        System.out.println(math);
        System.out.println("--------------------------------------------------");
        System.out.println("El numero mayor de ellos es: ");
        System.out.println(AU.devolverMayor(math));
        System.out.println("****************************************************");
        System.out.println("La Potencia del mayor de ellos, elevado al menor es: ");
        System.out.println(AU.calcularPotencia(math, AU.devolverMayor(math)));
        System.out.println("****************************************************");
        System.out.println("La Raiz cuadrada del menor de ellos es: ");
        System.out.println(AU.calculaRaiz(math, AU.devolverMayor(math)));
        System.out.println("--------------------------------------------------");
    }

}
