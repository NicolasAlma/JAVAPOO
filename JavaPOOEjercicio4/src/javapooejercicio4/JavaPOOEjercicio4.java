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
package javapooejercicio4;

import Servicios.servicioRectangulo;
import entidades.Rectangulo;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un objeto auxiliar que aloje los valores del rectangulo mediante la clase Servicio
        servicioRectangulo AU = new servicioRectangulo();
        //Ahora se crea un rectangulo con la clase rectangulo y se le asigna los valores mediante el objeto anterior
        Rectangulo R1 = AU.crearRectangulo();
        //Llamo a los metodos Correspondientes:
        //Metodo Area:
        AU.Area(R1);
        System.out.println(" ");
        //Metodo Perimetro
        AU.Perimetro(R1);
        //Metodo Imprimir
        AU.Imprimir(R1);  
    }

}
