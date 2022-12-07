/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooejerciciosaprendisaje;

//import java.util.Scanner;

import Entidades.Libro;
import Entidades.Usuario;
import Servicios.LibroServicio;
import Servicios.UsuarioServicios;
import java.util.Scanner;



/**
 *
 * @author tu
 */
public class JavaPOOejerciciosAprendisaje {

    /**
     * @param args Crear una clase llamada Libro que contenga los siguientes
     * atributos: ISBN, Título, Autor, Número de páginas, y un constructor con
     * todos los atributos pasados por parámetro y un constructor vacío. Crear
     * un método para cargar un libro pidiendo los datos al usuario y luego
     * informar mediante otro método el número de ISBN, el título, el autor del
     * libro y el numero de páginas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Creo(Instanciamos) un Usuario con la clase Usuario(Que Creamos)
        UsuarioServicios Persona1= new UsuarioServicios();
        
        //Creo(Instanciamos) un libro con la clase Libro(Que creamos)  
        LibroServicio PrimerLibro= new LibroServicio();
        
        //Le pido al usuario mediante un metodo sus datos
        Usuario Principal = Persona1.Datos();
        
        //Le pido al usuario los datos del libro
        Libro Segundo = PrimerLibro.L1();
        
        //Se Imprime los objetos 
        System.out.println(Principal);
        System.out.println(Segundo);
    }

}
