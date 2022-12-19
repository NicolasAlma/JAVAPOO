/*
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese 
una frase que puede ser una palabra o varias palabras separadas por un espacio en 
blanco y a través de los métodos set, se guardará la frase y la longitud de manera 
automática según la longitud de la frase ingresada. Deberá además implementar los 
siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
frase ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario. 
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
la frase resultante. 
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package javapooejercicio8;

import Entidades.Cadena;
import Servicios.servicioCadena;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio8 {

    /**
     * @param args En el main se creará el objeto y se le pedirá al usuario que
     * ingrese una frase que puede ser una palabra o varias palabras separadas
     * por un espacio en blanco y a través de los métodos set, se guardará la
     * frase y la longitud de manera automática según la longitud de la frase
     * ingresada.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se instancia las funciones del objeto Cadena mediante la clase Servicio
        servicioCadena AU = new servicioCadena();
        //Se instancia el objeto cadena y se le asigna las funciones del objeto con el objeto antes creado
        Cadena Palabra = AU.crearCadena();
        boolean Salir = true;
        //Menu
        do {
            System.out.println("--------MENU---------");
            System.out.println("¿Que desea realizar?");
            System.out.println("1-Ver vocales de la frase");
            System.out.println("2-Invertir la frase");
            System.out.println("3-Letra que mas se Repite");
            System.out.println("4-Comparar Longitudes");
            System.out.println("5-Unir frases");
            System.out.println("6-Reemplazar letras por A");
            System.out.println("7-Que letra contiene la frase");
            System.out.println("8-Salir");
            System.out.println("---------------------");
            int var = leer.nextInt();
            switch (var) {
                case 1:
                    AU.mostrarVocales(Palabra);
                    break;
                case 2:
                    AU.invertirFrase(Palabra);
                    break;
                case 3:
                    System.out.println("¿Que letra a buscar?");
                    AU.Mostrar(Palabra);
                    String letra= leer.next();
                    AU.vecesRepetido(letra, Palabra);
                    break;
                case 4:
                    System.out.println("¿Que frase desea comparar?");
                    String frase = leer.next();
                    AU.compararLongitud(frase, Palabra);
                    break;
                case 5:
                    System.out.println("¿Que frase desea unir?");
                    String Oracion = leer.next();
                    AU.unirFrases(Oracion, Palabra);
                    break;
                case 6:
                    System.out.println("¿Que letra desea reemplazar por A?");
                    AU.Mostrar(Palabra);
                    String letra1 = leer.next();
                    AU.reemplazar(letra1, Palabra);
                    break;
                case 7:
                    System.out.println("¿Que letra desea saber?");
                    AU.Mostrar(Palabra);
                    String letra2 = leer.next();
                    if (AU.contiene(letra2, Palabra)) {
                        System.out.println("La letra que ingreso esta en la frase");
                    }else{
                        System.out.println("La letra no esta en la frase");
                    }
                    break;
                case 8:
                    System.out.println("¿Desea Salir?(S/N)");
                    String desicion = leer.next();
                    if (desicion.equals("S")) {
                        Salir=false;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (Salir);
    }
}
