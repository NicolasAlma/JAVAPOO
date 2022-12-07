package Servicios;

import Entidades.Usuario;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class UsuarioServicios {
    //Metodo que llama a la clase usuario para rellenar sus Atributos
    public Usuario Datos(){
        //Instancio el objeto mediante la clase usuario
        Usuario Datos = new Usuario();
        //Le pido al usuario sus datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        Datos.setNombre(leer.nextLine());
        System.out.println("Ingrese su Apellido");
        Datos.setApellido(leer.nextLine());
        System.out.println("Ingrese su DNI(8 digitos)");
        Datos.setDNI(leer.nextInt());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();
        Date Nacimiento = new Date(anio-1900,mes-1,dia);
        Datos.setNacimiento(Nacimiento);
        return Datos;
    }
    
}
