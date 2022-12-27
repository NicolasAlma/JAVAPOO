/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que 
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda 
almacenar cada producto con su información. Crear una entidad Movil con los atributos 
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
correspondiente al código. A continuación, se implementarán los siguientes métodos: 
* Un constructor por defecto. 
* Un constructor con todos los atributos como parámetro. 
* Métodos getters y setters de cada atributo. 
* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
  instanciar un objeto Celular y poder cargarlo en nuestro programa. 
* Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
package Servicio;

import Entidades.Movil;
import java.util.Scanner;
import java.util.Arrays;

public class servicioMovil {
    Scanner leer = new Scanner(System.in);
   /*
    Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
    instanciar un objeto Celular y poder cargarlo en nuestro programa.
   */ 
    public Movil cargarCelular(){
        System.out.println("Ingrese la marca del Celular");
        String mark = leer.next();
        System.out.println("Indique un precio al Celular");
        int pre = leer.nextInt();
        System.out.println("¿Que modelo es el celular?");
        int mod = leer.nextInt();
        System.out.println("¿Qué memoria ram posee el Celular?");
        int ram = leer.nextInt();
        System.out.println("¿Qué almacenamiento posee el celular?");
        int storage = leer.nextInt();
        return new Movil(mark, pre, mod, ram, storage);
    }
    /*
    Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
    números de un celular. Para ello, puede utilizarse un bucle repetitivo
    */
    public void ingresarCodigo(Movil actualMovil){
        System.out.println("Codigo numerico de 7 digitos del celular");
        //Se crea un arreglo auxiliar que aloja los valores que se piden al usuario
        int [] num = new int[7];
        //Variable logica que actua como entrada y salida de bucles
        boolean Salir = true;
        //bucle repetivito que pide los valores al usuario
        for (int i = 0; i < 7; i++) {
            System.out.println("Digito "+(i+1)+" Del celular" );
            num[i]= leer.nextInt();
            //Condiconal que verfica que solo se ingrese un digito
            do {
                if (num[i]>9||num[i]<0) {
                    System.out.println("ingrese un solo digito");
                    num[i] = leer.nextInt();
                }else{
                    Salir=false;
                }  
            } while (Salir);
            //Se setea la variable logica para el siguiente valor
            Salir=true;
        }
        //Terminado todo los valores se setea a la clase
        actualMovil.setCodigo(num);
    }
    //Metodo mostrar: muestra la informacion antes agregada al objeto
    public void mostrar(Movil actualMovil){
        System.out.println("****************************************");
        System.out.println(actualMovil);
        System.out.println("****************************************");
        System.out.println("El Codigo del celular es:");
        System.out.println(Arrays.toString(actualMovil.getCodigo()));
    }
    
    
    
    
    
}
