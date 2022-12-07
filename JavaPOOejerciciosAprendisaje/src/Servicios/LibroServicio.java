/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class LibroServicio {
    
    public Libro L1(){
        //Instancio el objecto mediante la clase Libro
        Libro L1 = new Libro();
        //Le pido al usuario mediante el teclado los valores a llevar a los atributos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ISBN(De solo 13 digitos)");
        L1.setISBN(leer.nextInt());
        System.out.println("Ingrese el Título Del libro");
        L1.setTitulo(leer.next());
        System.out.println("Ingrese el Autor Del libro");
        L1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas del libro");
        L1.setNumPag(leer.nextInt());
        return L1; 
    }
    
}
