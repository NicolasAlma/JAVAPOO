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
package javapooejercicio6;

import Entidades.Cafetera;
import Servicios.servicioCafetera;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se crea mediante la clase Servicio la funcion de la cafetera
        servicioCafetera AU = new servicioCafetera();
        /*Se crea una cafetera con la clase Cafetera
        y se le asigna las funciones de la cafetera con el objeto antes creado
        */
        Cafetera C1 = AU.llenarCafetera();
        //Con los objetos y funciones creados se creara un menu mediante un bucle
        //Variable de salida y entrada del bucle
        boolean salir = true;
        do {
            System.out.println("-------------------------");
            System.out.println("          MENU           ");
            System.out.println("¿Que desea realizar?");
            System.out.println("1-Servir Cafe");
            System.out.println("2-Agregar Cafe");
            System.out.println("3-Vaciar Cafetera");
            System.out.println("4-Consultar Cafe y Capacidad");
            System.out.println("5-Salir");
            System.out.println("-------------------------");
            int var = leer.nextInt();
            
            switch (var) {
                case 1:
                    //Se le consulta al usuario cuanto cafe desea
                    System.out.println("¿Que cantidad de cafe?");
                    System.out.println("1-100ml");
                    System.out.println("2-150ml");
                    System.out.println("3-250ml");
                    System.out.println("4-A eleccion");
                    int decision = leer.nextInt();
                    int capacidad;
                    switch (decision) {
                        case 1:
                            capacidad= 100;
                            AU.servirTaza(capacidad, C1);
                            break;
                        case 2:
                            capacidad= 150;
                            AU.servirTaza(capacidad, C1);
                            break; 
                        case 3:
                            capacidad= 250;
                            AU.servirTaza(capacidad, C1);
                            break;
                        case 4:
                            System.out.println("¿Cuanto Cafe Desea?");
                            capacidad= leer.nextInt();
                            AU.servirTaza(capacidad, C1);
                            break; 
                    }
                    break;
                case 2:
                    //Metodo AgregarCafe
                    AU.agregarCafe(C1);
                    break;
                case 3:
                    //Metodo Vaciar Cafe
                    AU.vaciarCafetera(C1);
                    break;  
                case 4:
                    //Metodo Consulta
                    AU.consulta(C1);
                    break;
                case 5:
                    //Se le consulta al usuario si desea salir
                    System.out.println("¿Desea salir?(S/N)");
                    String ver = leer.next();
                    if (ver.equals("S")) {
                        salir=false;
                    }
                    break;
            } 
        } while (salir); 
    }

}
