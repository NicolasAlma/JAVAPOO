/*
 * * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un 
programa para organizar la información de cada curso. Para ello, crearemos una clase 
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, 
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde 
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los 
nombres de cada alumno. A continuación, se implementarán los siguientes métodos: 
* Un constructor por defecto. 
* Un constructor con todos los atributos como parámetro. 
* Métodos getters y setters de cada atributo. 
* método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el 
nombre de cada alumno. 
* Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor 
al atributo alumnos 
* Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
se repite el encuentro.
 */
package servicios;

import Entidades.Curso;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author tu
 */
public class servicioCurso {

    Scanner leer = new Scanner(System.in);

    /*
    método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el 
    nombre de cada alumno.
     */
    public String[] cargarAlumnos() {
        //Se crea un arreglo auxiliar que aloja el nombre de los alumnos
        String[] Aux = new String[5];
        System.out.println("¿Cuales son los nombres de los alumnos?");
        System.out.println("---------------------------------------");
        //Se crea un bucle que recorre el arreglo alumnos
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            Aux[i] = leer.next();
        }
        //Retorna los valores ingresados por el usuario
        return Aux;
    }

    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor 
    al atributo alumnos
     */
    public Curso crearCurso() {
        //Se invoca al metodo cargarAlumnos para asignarle valor al atributo alumnos
        String[] Aux = cargarAlumnos();
        System.out.println("---------------------------------------");
        //Se pregunta el nombre del curso para asignarle valor al atributo nombreCurso
        System.out.println("¿Cómo se llama el curso?");
        String nombre = leer.next();
        System.out.println("---------------------------------------");
        //Se pregunta por la cantidad de horas para asignarle valor al atributo cantidadHorasPorDia
        System.out.println("¿Qué cantidad de horas por dia se dan en clase?");
        int horas = leer.nextInt();
        //Variable logica que actua de entrada y salida de bucles
        boolean Salir = true;
        //Bucle que verifica un horario coherente
        do {
            if (horas > 24 || horas < 0) {
                System.out.println("Ingrese un horario coherente");
                horas = leer.nextInt();
            } else {
                Salir = false;
            }
        } while (Salir);
        //Se pregunta por la cantidad de dias por semana para asignarle valor al atributo cantidadDiasPorSemana
        Salir = true;
        System.out.println("---------------------------------------");
        System.out.println("¿Que cantidad de dias por semana se realiza el curso?");
        int dias = leer.nextInt();
        do {
            if (dias > 7 || dias <= 0) {
                System.out.println("Ingrese un numero coherente de dias por semana");
                dias = leer.nextInt();
            } else {
                Salir = false;
            }
        } while (Salir);
        //Se pregunta por el turno para asignarle valor al atributo Turno
        System.out.println("---------------------------------------");
        System.out.println("¿Qué turno se realiza el curso?(Matutino(M)/Vespertino(V)/Nocturno(N))");
        String turno = leer.next();
        Salir = true;
        do {
            //Se transforma la escritura a miniscula para comparar
            turno = turno.toLowerCase();
            //Se compara el turno elegido
            if (turno.equals("m") || turno.equals("v") || turno.equals("n")) {
                Salir = false;
            } else {
                System.out.println("Ingrese un turno");
                turno = leer.next();
            }
        } while (Salir);
        //Se pregunta por el precio para asignarle valor al atributo precioPorHora
        System.out.println("---------------------------------------");
        System.out.println("¿Cuánto es el precio por cada hora?");
        int precio = leer.nextInt();
        return new Curso(nombre, horas, dias, turno, precio, Aux);
    }

    /*
    * Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
    se repite el encuentro.
     */
    public void calcularGananciaSemanal(Curso actual) {
        //Se muestra el curso creado
        System.out.println("Los Alumnos que Cursan son:");
        System.out.println(Arrays.toString(actual.getAlumnos()));
        System.out.println("---------------------------------------");
        System.out.println("El nombre del curso es: " + actual.getNombreCurso());
        System.out.println("---------------------------------------");
        System.out.println("La cantidad de dias por semana es: " + actual.getCantidadDiasPorSemana()+" Dias");
        System.out.println("---------------------------------------");
        System.out.println("La Cantidad de horas por dia es: " + actual.getCantidadHorasPorDia()+" horas");
        System.out.println("---------------------------------------");
        switch (actual.getTurno()) {
            case "m":
                System.out.println("El turno del curso se realiza: Matutino");
                break;
            case "v":
                System.out.println("El turno del curso se realiza: Vespertino");
                break;
            case "n":
                System.out.println("El turno del curso se realiza: Nocturno");
                break;
        }
        System.out.println("---------------------------------------");
        System.out.println("El precio por hora del curso es: " + actual.getPrecioPorHora() + " $");
        System.out.println("---------------------------------------");
        //Se realiza la operacion entre todos los atributos:
        double ganancia = actual.getCantidadDiasPorSemana() * actual.getCantidadHorasPorDia() * actual.getPrecioPorHora() * 5;
        //Por ultimo se muestra la cantidad total
        System.out.println("La ganancia semanal del curso es: " + ganancia + " $");
    }
}
