/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 

b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores. 

c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematicas;
import static java.lang.Math.round;
import static java.lang.Math.abs;
/**
 *
 * @author tu
 */
public class servicioMatematicas {
    
    //Metodo CrearNumero
    public Matematicas CrearNumero(){
        /*Se le asignan al objeto creado numeros aleatorios entre 0-9 y se retorna a la clase
        para que se asignen a los atributos de la clase.
        */
        return new Matematicas(Math.random()*10, Math.random()*10);  
    }
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(Matematicas ValorActual){
        //Se crea una variable que aloja al atributo mayor
        double mayor;
        //Se utiliza un condicional que compara ambos atributos de la clase:
        //Si el primer atributo de clase es mayor al segundo
        if (ValorActual.getNum1()>ValorActual.getNum2()) {
            //Entonces el primer atributo es mayor al segundo
            mayor = ValorActual.getNum1();
        }else{
            //Entonces el segundo atributo es mayor al primero
            mayor = ValorActual.getNum2();
        }
        //Se retorna el atributo mayor
        return mayor;
    }
    /*
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
    elevado al menor número. Previamente se deben redondear ambos valores.
    */
    public double calcularPotencia(Matematicas ValorActual, double mayor){
        //Se redondea el atributo mayor
        double rouMayor = round(mayor);
        //Condicional para redondear el atributo menor
        double rouMenor;
        //si el primer atributo es menor al segundo
        if (ValorActual.getNum1()<ValorActual.getNum2()) {
            //Entonces se redondea el primer atributo que es el menor
            rouMenor = round(ValorActual.getNum1());
        }else{
            //Entonces se redondea el segundo atributo que es el menor
            rouMenor = round(ValorActual.getNum2());
        }
        //Se elevan a la potencia el mayor atributo y el menor atributo
        double pow = Math.pow(rouMayor, rouMenor);
        //Se retorna la operacion realizada
        return pow;
    }
    /*
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public double calculaRaiz(Matematicas ValorActual,double mayor){
        //Se calcula el valor absoluto del valor menor
        double absMenor;
        //Si el valor de mayor es el primer atributo
        if (mayor==ValorActual.getNum1()) {
            //Entonces el segundo atributo es menor
            absMenor = abs(ValorActual.getNum2());
        }else{
            //Entonces el primer atributo es menor
            absMenor = abs(ValorActual.getNum1());
        }
        //Retorna la raiz cuadrada positiva redondeada del atributo menor
        return Math.sqrt(absMenor);
    }
    
    
}
