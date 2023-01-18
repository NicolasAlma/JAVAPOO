/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

* Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 

* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 

* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 

* Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime las 2 
posibles soluciones. 

* Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 

* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones
que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de
no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioRaices {

    Scanner leer = new Scanner(System.in);

    //Metodo asignar():asigna los valores a, b y c que el usuario ingresa a la clase Raices para instanciarla
    public Raices asignar() {
        System.out.println("¿Qué valor posee el coefiente principal(a)?");
        double a = leer.nextDouble();
        System.out.println("¿Qué valor posee el Segundo Coeficiente(b)?");
        double b = leer.nextDouble();
        System.out.println("¿Qué valor posee el termino independiente(c)?");
        double c = leer.nextDouble();
        System.out.println("La ecuacion ingresada es la siguiente:");
        if (b > 0 && c > 0) {
            System.out.println(+a + "x²+" + b + "x+" + c);
        } else if (b == 0 && c > 0) {

            System.out.println(+a + "x²+" + c);

        } else if (b == 0 && c < 0) {

            System.out.println(+a + "x²" + c);

        } else if (b > 0 && c == 0) {

            System.out.println(+a + "x²+" + b + "x");

        } else if (b < 0 && c == 0) {

            System.out.println(+a + "x²" + b + "x");

        } else if (b < 0 && c < 0) {

            System.out.println(+a + "x²" + b + "x" + c);
            
        }else if (b<0 && c>0){
            
            System.out.println(a + "x²" + b + "x+" + c);
        }else if (b>0 && c<0){
            
            System.out.println(a + "x²+" + b + "x" + c);
            
        } else if (b == 0 && c == 0) {
            
            System.out.println(a + "x²");
        }
        return new Raices(a, b, c);
    }

    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El 
    discriminante tiene la siguiente formula: (b^2)-4*a*c 
     */
    public double getDiscriminante(Raices actual) {
        //Se retorna el calculo del discriminante mediante la formula (b^2)-4*a*c 
        return Math.pow(actual.getB(), 2) - 4 * actual.getA() * actual.getC();
    }

    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices actual) {
        //Se utiliza una variable auxiliar que actua como verificador
        boolean verdad = false;
        //Se llama al metodo getDiscriminante que realiza el calculo y se verifica
        if (getDiscriminante(actual) > 0) {
            verdad = true;
        }
        return verdad;
    }

    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
    que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices actual) {
        //Se utiliza una variable auxiliar que actua como verificador
        boolean verdad = false;
        //Se llama al metodo getDiscriminante que realiza el calculo y se verifica
        if (getDiscriminante(actual) == 0) {
            verdad = true;
        }
        return verdad;
    }

    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime las 2 
    posibles soluciones.
     */
    public void obtenerRaices(Raices actual) {
        //Se verifica que la equacion tenga dos raices 
        if (tieneRaices(actual)) {
            //Si posee las raices se calculan mediante la formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
            //La primera solucion es con signo positivo de la raiz cuadrada
            double sol1 = (-actual.getB() + Math.sqrt(Math.pow(actual.getB(), 2) - 4 * actual.getA() * actual.getC())) / (2 * actual.getA());

            //La segunda solucion es con signo negativo de la raiz cuadrada
            double sol2 = (-actual.getB() - Math.sqrt(Math.pow(actual.getB(), 2) - 4 * actual.getA() * actual.getC())) / (2 * actual.getA());

            System.out.println("La primera solucion es: " + sol1);
            System.out.println("---------------------------------");
            System.out.println("La segunda solucion es: " + sol2);
        }
    }

    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime una única raíz. 
    Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices actual) {
        //Se verifica que la equacion tenga una unica raiz
        if (tieneRaiz(actual)) {
            //Si posee una raiz se calcula mediante la formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) aqui no importa el signo que tenga la raiz
            //Por lo que se le asigna solamente el signo + o -
            double sol = (-actual.getB() + Math.sqrt(Math.pow(actual.getB(), 2) - 4 * actual.getA() * actual.getC())) / (2 * actual.getA());

            System.out.println("La unica solucion de la ecuacion es: " + sol);
        }
    }

    /*
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones
    que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de
    no existir solución, se mostrará un mensaje.
     */
    public void calcular(Raices actual) {
        //Se llama a los metodos correspondientes para verificar si la ecuacion posee raices o no tiene:
        //Si posee mas de una raiz 
        if (tieneRaices(actual) == true) {
            //entonces imprime las raices mediante el metodo obtenerRaices
            obtenerRaices(actual);
            //Si posee una unica raiz
        } else if (tieneRaiz(actual) == true) {
            //Entonces imprime la unica raiz mediante el metodo ObtenerRaiz
            obtenerRaiz(actual);
            //Sino se cumple ninguna de las anteriores
        } else {
            //entonces no posee ninguna solucion
            System.out.println("La ecuacion anteriormente ingresada no posee soluciones reales");
        }
    }

}
