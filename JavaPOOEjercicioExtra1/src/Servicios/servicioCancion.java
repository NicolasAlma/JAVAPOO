/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas 
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán 
además definir los métodos getters y setters correspondientes.
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

public class servicioCancion {
    Scanner leer = new Scanner(System.in);
    public Cancion crearCancion(){
        System.out.println("Ingrese el titulo de la Cancion");
        String titulo = leer.next();
        System.out.println("Ingrese el autor de la Cancion");
        String autor = leer.next();
        return new Cancion(titulo, autor);
    }
    
    public void mostrar(Cancion actual){
        System.out.println(actual);
    }
    
}
