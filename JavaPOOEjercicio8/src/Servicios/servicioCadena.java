/*
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
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
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class servicioCadena {

    Scanner leer = new Scanner(System.in);

    //Metodo crearCadena: crea la Cadena que el usuario escribe y mide su longitud
    public Cadena crearCadena() {
        //Se le pide al usuario una frase de cualquier tipo
        System.out.println("Ingrese una frase a Operar");
        String frase = leer.nextLine();
        //Calculamos su longitud(Incluso si posee espacio)
        int longitud = frase.length();
        //Retornamos los valores que ingreso el usuario a la clase Cadena
        return new Cadena(frase, longitud);
    }

    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
    frase ingresada.
     */
    public void mostrarVocales(Cadena PalabraActual) {
        //Se crea una variable auxiliar que aloja las letras de la palabra que el usuario ingresa
        String letra;
        //Se crea un contador que cuenta cuantas vocales tiene la palabra
        int cont = 0;
        //Bucle que recorre toda la palabra
        for (int i = 0; i < PalabraActual.getLongitud(); i++) {

            letra = PalabraActual.getFrase().substring(i, i + 1);
            //Condicional que compara cada letra y detecta vocales
            switch (letra) {
                case "a":
                    cont++;
                    break;
                case "u":
                    cont++;
                    break;
                case "e":
                    cont++;
                    break;
                case "i":
                    cont++;
                    break;
                case "o":
                    cont++;
            }
        }
        System.out.println("La cantidad de vocales que posee la frase ingresada es: " + cont);
    }

    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena PalabraActual) {
        //Se crea una variable auxiliar que aloja las letras de la palabra que el usuario ingresa
        String letra;
        /*
        Se crea una variable auxiliar asignada con un caracter vacio, que se 
        utiliza para concatenar con las letras anteriores y no haya error.
        */
        String Oracion = "";
        //Se utiliza un for que iteara de forma inversa y escribira la frase al revez
        for (int i = (int) PalabraActual.getLongitud() - 1; i >= 0; i--) {
            //Variable que iterara y escribe las letras de forma inversa
            Oracion += PalabraActual.getFrase().charAt(i);
        }
        //Por ultimo las escribe todas juntas
        System.out.println(Oracion);
    }

    /*
    c)Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(String letra, Cadena PalabraActual) {
        //Se realiza un procedimiento analogo al de mostrar vocales:
        int j = 0;
        
        String Otra;
        
        for (int i = 0; i < PalabraActual.getLongitud(); i++) {

            Otra = PalabraActual.getFrase().substring(i, i + 1);

            if (Otra.equals(letra)) {
                j++;
            }
        }

        System.out.println("La letra " + letra + " se repite: " + j + " veces");

    }

    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
    compone la clase con otra nueva frase ingresada por el usuario. 
     */
    public void compararLongitud(String frase, Cadena PalabraActual) {
        //Se saca la longitud de la frase que usuario ingresa
        int LongNum = frase.length();
        //Se compara si son iguales o no
        if (LongNum == PalabraActual.getLongitud()) {
            System.out.println("Las longitudes de ambas frases son iguales");
        } else {
            System.out.println("Las longitudes de ambas frases son distintas");
        }
    }

    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases(String Oracion, Cadena PalabraActual) {

        System.out.println("Las frases unidas forman la siguiente oracion:");
        System.out.println(PalabraActual.getFrase() + Oracion);
        
    }

    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
    la frase resultante.
     */
    public void reemplazar(String letra1, Cadena PalabraActual) {
        //Se crea una variable que aloja las letras de la palabra del objeto
        String otra="";
        String oracion="";
        //Bucle que recorre toda la frase
        for (int i = 0; i < PalabraActual.getLongitud(); i++) {

            otra = PalabraActual.getFrase().substring(i, i + 1);

            if (otra.equals("a")) {
                oracion+=letra1;
            }else{
                oracion+=otra;
            }
        }
        System.out.println("La palabra reemplazada es: ");
        System.out.println(oracion);
    }

    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(String letra, Cadena PalabraActual) {
        //Variable que aloja las letras de la palabra del objeto
        String Otra;
        //Variable logica que devuelve el metodo
        boolean verdad = false;
        //Bucle que recorre toda la frase letra por letra
        for (int i = 0; i < PalabraActual.getLongitud(); i++) {

            Otra = PalabraActual.getFrase().substring(i , i+1);

            if (Otra.equals(letra)) {
                verdad = true;
            }
        }
        return verdad;
    }
    //Metodo que muestra la palabra o frase que ingrese el usuario al principio
    public void Mostrar(Cadena PalabraActual) {
        System.out.println(PalabraActual.getFrase());
    }

}
