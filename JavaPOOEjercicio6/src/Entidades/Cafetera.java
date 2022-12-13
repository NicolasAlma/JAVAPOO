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
cuanto quedó la taza. 
6) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
7) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Entidades;

/**
 *
 * @author tu
 */
public class Cafetera {
    //Atributos
    private double capacidadMaxima;//capacidadMaxima(la cantidad máxima de café que puede contener la cafetera)
    private double cantidadActual;//cantidadActual (la cantidad actual de café que hay en la cafetera)
    //1) Constructor predeterminado o vacío
    public Cafetera() {
    }
    //2) Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    //3) Métodos getters y setters.
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    //Metodo ToString
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }   
}
