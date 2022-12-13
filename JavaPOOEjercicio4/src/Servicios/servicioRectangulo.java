/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
con los datos del Rectángulo dados por el usuario. También incluirá un método para 
calcular la superficie del rectángulo y un método para calcular el perímetro del 
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
asteriscos usando la base y la altura. Se deberán además definir los métodos getters, 
setters y constructores correspondientes. 
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioRectangulo {
    Scanner leer = new Scanner(System.in);
    //Metodo CrearRectangulo
    public Rectangulo crearRectangulo(){
        //Le pido al usuario los datos de la base y altura
        System.out.println("Ingrese la Base del Rectangulo");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese la Altura del Rectangulo");
        double num2 = leer.nextDouble();
        //Retorno los datos que el usuario ingreso a la clase Rectangulo
        return new Rectangulo(num1, num2);
    }
    //Metodo Area
    public void Area(Rectangulo ValorActual){
        //creo una variable auxiliar que aloje el area del rectangulo
        double Area = ValorActual.getBase()*ValorActual.getAltura(); 
        System.out.println("La Superficie del rectangulo es: "+Area);
    }
    //Metodo Perimetro     
    public void Perimetro(Rectangulo ValorActual){
        //Se realiza un procedimiento analogo al metodo Area
        double Perimeto = (ValorActual.getBase()+ValorActual.getBase())*2;
        System.out.println("El Perimetro del Rectangulo es: "+Perimeto);
    }
    
    //Metodo Imprimir
    public void Imprimir(Rectangulo ValorActual){
        //Primera Base
        for (int i = 0; i < ValorActual.getBase(); i++) {
            System.out.print(" *");
        }
        //Salto de linea
        System.out.println("");
        
        //Lados del Rectangulo(Se le resta 3, para que la ALTURA se acorde a la indicada por el usuario)
        for (int i = 0; i <= ValorActual.getAltura()-3; i++) {
            //Lado Izquierdo del Rectangulo, Desde la Perspectiva de la pantalla
            System.out.print(" *");
            //Espacios dentro del Triangulo(Se le resta 2, para que la BASE se acorde a la indicada por el usuario)
            for (int j = 0; j < ValorActual.getBase()-2; j++) {
                System.out.print("  ");    
            }
            //Lado Derecho del Rectangulo, Desde la Perspectiva de la pantalla
            System.out.print(" *");
            //Salto de linea
            System.out.println("");

        }
        //Segunda Base
        for (int i = 0; i < ValorActual.getBase(); i++) {
            System.out.print(" *");
        }
        System.out.println("");
  
        
        
    }
    
    
}
    
    
    
    
    
    
