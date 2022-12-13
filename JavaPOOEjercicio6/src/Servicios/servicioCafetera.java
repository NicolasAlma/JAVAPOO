/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la 
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes 
métodos: 
1) Constructor predeterminado o vacío 
2) Constructor con la capacidad máxima y la cantidad actual 
3) Métodos getters y setters. 
4) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
5) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.(Formula del volumen de semiesfera para tomar de ejemplo a la taza: [2/3*PI*Radio^3]) 
6) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
7) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioCafetera {

    Scanner leer = new Scanner(System.in);

    //4) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public Cafetera llenarCafetera() {
        System.out.println("Ingrese la capacidad Maxima de la Cafetera");
        double cantidadMaxima = leer.nextDouble();//capacidadMaxima(la cantidad máxima de café que puede contener la cafetera)
        double cantidadActual = cantidadMaxima;//cantidadActual (la cantidad actual de café que hay en la cafetera)
        return new Cafetera(cantidadActual, cantidadMaxima);
    }

    /*
    5) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
    cuanto quedó la taza.(Formula del volumen ejemplo a la taza: [1/3*PI*Altura(BaseSuperior^2+BaseSuperior*BaseInferior+BaseInferior^2)])
     */
    public void servirTaza(int capacidad, Cafetera ValorActual) {
        //Se pide las medidas de tamaño de una taza vacía
        System.out.println("Ingrese la medida de la base inferior de su taza(En cm el radio)");
        int BaseInferior = leer.nextInt();
        System.out.println("Ingrese la medida de la base Superior de su taza(En cm el radio)");
        int BaseSuperior = leer.nextInt();
        System.out.println("Ingrese la Altura de su Taza(En cm la medida)");
        int Altura = leer.nextInt();
        //Se utiliza la siguiente formula: [1/3*PI*Altura(BaseSuperior^2+BaseSuperior*BaseInferior+BaseInferior^2)]
        double TazaVol = ((0.333333) * Math.PI * Altura) * (Math.pow(BaseSuperior, 2) + BaseSuperior * BaseInferior + (Math.pow(BaseInferior, 2)));
        /*
        Con el volumen de la taza se puede utilizar de referencia para saber si se lleno o no,
        Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
        El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
        cuanto quedó la taza.
         */
        if (TazaVol - capacidad > 0) {
            System.out.println("Se sirvió el cafe, puede retirarlo");
            //Se le resta a la cantidad actual de cafe la capacidad para que indique que se sirvió cafe
            ValorActual.setCantidadActual((int) (ValorActual.getCantidadActual() - capacidad));
        } else if (TazaVol < capacidad) {
            System.out.println("¡Cuidado! Puede que el cafe se desborde, esta seguro de servir?(S/N)");
            String decision = leer.next();
            if (decision.equals("S")) {
                //Se le resta a la cantidad actual de cafe la capacidad para que indique que se sirvió cafe
                ValorActual.setCantidadActual((int) (ValorActual.getCantidadActual() - capacidad));
            }
        } else {
            System.out.println("Se sirvió lo que queda de cafe " + ValorActual.getCantidadActual() + "ml (No hay mas cafe)");
            /*
            Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. Y le seteamos Cero
            Para indicar que se quedo sin cafe
             */
            ValorActual.setCantidadActual(0);
        }

    }

    //6) Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera ValorActual) {
        //Mediante un set se sobreescribe la cantidadActual(café que hay en la cafetera)
        ValorActual.setCantidadActual(0);
    }

    //7) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera ValorActual) {
        //Se crea una variable auxiliar que contenga la cantidad a agregar del cafe
        int cantidad;
        //bucle para evitar pasarse de la capacidad maxima de la cafetera
        do {
            System.out.println("Indique que cantidad de cafe agregar a la cafetera(Que no sea mayor a la capacidad de la Cafetera)");
            cantidad = leer.nextInt();
        } while (cantidad > ValorActual.getCapacidadMaxima());
        //Condicional que verifica que no haya cafe en la cafetera para vaciarla o si la cantidad a agregar excede a la capacidad
        String decision;
        if (ValorActual.getCantidadActual() == 0) {
            //Si no hay cafe se setea
            ValorActual.setCantidadActual(cantidad);
        } else if ((ValorActual.getCantidadActual() + cantidad) > ValorActual.getCapacidadMaxima()) {
            //Si se agrega cafe y excede a la capacidad de la cafetera, no agrega mas cafe 
            System.out.println("No se puede agregar mas cafe, excede a la capacidad de la cafetera");
        } else if (ValorActual.getCantidadActual() > 0) {
            //Si aun hay cafe se pregunta si se agrega
            System.out.println("Aún hay cafe en la maquina, Desea agregar mas cafe?(S/N)");
            decision = leer.next();
            if (decision.equals("S")) {
                ValorActual.setCantidadActual((int) ValorActual.getCantidadActual() + cantidad);
            }
        }
    }

    //Metodo Consulta
    public void consulta(Cafetera ValorActual) {
        System.out.println("La cantidad de cafe de la Cafetera es: " + ValorActual.getCantidadActual() + "ml");
        System.out.println("----------------------------------------------------");
        System.out.println("La Capacidad Maxima de la Cafetera es: " + ValorActual.getCapacidadMaxima() + "ml");
    }

}
