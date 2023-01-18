/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;
/**
 *
 * @author tu
 */
public class serviciosPuntos {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        System.out.println("¿Cual es el primer punto?");
        System.out.println("ingrese la primera coordenada de x");
        double x1 = leer.nextDouble();
        System.out.println("ingrese la segunda coordenada de y");
        double y1 = leer.nextDouble();
        System.out.println("¿Cual es el segundo punto?");
        System.out.println("ingrese la primera coordenada de x");
        double x2 = leer.nextDouble();
        System.out.println("ingrese la segunda coordenada de y");
        double y2 = leer.nextDouble();
        return new Puntos(x1, y1, x2, y2);
    }
    
    public void calcular(Puntos actual){
        /*
        Formula para calcular la distancia entre dos puntos:
        dist =√(x1-x2)^2+(y1-y2)^2
        */
       double Resultado=Math.sqrt(Math.pow(  actual.getX1() - actual.getX2() ,2) + Math.pow(actual.getY1()-actual.getY2(), 2));
       System.out.println("La distancia entre dos puntos es: "+Resultado);
    }
}
