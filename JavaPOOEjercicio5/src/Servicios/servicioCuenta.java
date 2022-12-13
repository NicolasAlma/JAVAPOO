/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
Las operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual. 
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
pondrá el saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%. 
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioCuenta {
    Scanner leer = new Scanner(System.in);
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta(){
        //Se le pide al usuario los datos correspondientes
        System.out.println("Indique el numero de cuenta");
        int num1 = leer.nextInt();
        System.out.println("Indique el DNI");
        long num2 = leer.nextLong();
        System.out.println("Ingrese el Saldo Actual");
        int num3 = leer.nextInt();
        //Se retorna a la clase cuenta los valores que el usuario ingreso
        return new Cuenta(num1, num2, num3);
    }
    //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
    //y se la sumara a saldo actual.
    public void ingresar(double ingreso,Cuenta ValorActual){
        //Se le ingresa el valor que indico el usuario al saldo actual(Mediante un Set)
        ValorActual.setSaldoActual((int) ingreso+ValorActual.getSaldoActual());    
    }
    //e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
    //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
    //pondrá el saldo actual en 0.
    public void retirar(double retiro,Cuenta ValorActual){
        //Se compara con un condicional el retiro que ingrese el usuario
        if (ValorActual.getSaldoActual()-retiro<0) {
            //Se setea 0 si la resta devuelve negativo
            ValorActual.setSaldoActual(0);
            System.out.println("El Saldo Actual es 0");
        }else{
            //Se setea la diferencia si es lo contrario
            ValorActual.setSaldoActual((int) (ValorActual.getSaldoActual()-retiro));
        }
    }
    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
    //usuario no saque más del 20%.
    public void extraccionRapida(double Rapido,Cuenta ValorActual){
        //Se comprueba el 20% del saldo Actual
        double Ver = ValorActual.getSaldoActual()*0.20;
        //Se compara el resultado con el retiro del usuario para evitar que retire mas del 20%
        if (Ver<Rapido) {
            System.out.println("En una Extraccion Rapida no se puede Sacar mas del 20%");
        }else{
            ValorActual.setSaldoActual((int) (ValorActual.getSaldoActual()-Rapido));
        }     
    }
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
    public void consultarSaldo(Cuenta ValorActual){
        System.out.println("El Saldo Actual es: "+ValorActual.getSaldoActual());
    }
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta ValorActual){
        System.out.println(ValorActual); 
    }
}
