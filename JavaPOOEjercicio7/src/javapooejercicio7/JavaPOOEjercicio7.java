/*
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 

1) Un constructor por defecto. 

2) Un constructor con todos los atributos como parámetro. 

3) Métodos getters y setters de cada atributo.

4) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 

5) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 

6) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 

A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package javapooejercicio7;

import Entidades.Persona;
import Servicios.servicioPersona;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio7 {

    /**
     * @param args A continuación, en la clase main hacer lo siguiente: Crear 4
     * objetos de tipo Persona con distintos valores, a continuación, llamaremos
     * todos los métodos para cada objeto, deberá comprobar si la persona está
     * en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
     * indicar para cada objeto si la persona es mayor de edad.
     *
     * Por último, guardaremos los resultados de los métodos calcularIMC y
     * esMayorDeEdad en distintas variables, para después en el main, calcular
     * un porcentaje de esas 4 personas, cuantas están por debajo de su peso,
     * cuantas en su peso ideal y cuantos, por encima, y también calcularemos un
     * porcentaje de cuantos son mayores de edad y cuantos menores
     */
    public static void main(String[] args) {
        /*Creamos los objetos persona con la clase Servicio Persona, para cuatro personas
        Primera Persona:
        Se crea una persona con las funciones de la clase servicio
         */
        servicioPersona Au1Persona = new servicioPersona();
        //Se crea otro objeto con la clase persona y se le asigna el anterior objeto creado
        System.out.println("Primera Persona:");
        Persona P1 = Au1Persona.crearPersona();
        //Para la Primera Persona le llamaremos los metodos:
        //Metodo Calcular IMC(Indice De Masa Corporal)
        int IMC1 = Au1Persona.calcularIMC(P1);
        int Ideal1 = 0;
        int Sobre1 = 0;
        int Debajo1 = 0;
        switch (IMC1) {
            case 1:
                System.out.println("la persona " + P1.getNombre() + " tiene sobrepeso");
                Sobre1 = 1;
                break;
            case 0:
                System.out.println("la persona " + P1.getNombre() + " está en su peso ideal");
                Ideal1 = 1;
                break;
            case -1:
                System.out.println("la persona " + P1.getNombre() + " está por debajo de su peso ideal");
                Debajo1 = 1;
                break;
            default:
                System.out.println("No se Realizo el Calculo");
        }
        //Metodo esMayorDeEdad
        //Variables auxilares que alojan de la primera persona el dato de edad mayor
        int Mayor1 = 0;
        int Menor1 = 0;
        if (Au1Persona.esMayorDeEdad(P1)) {
            System.out.println("La persona " + P1.getNombre() + " es de mayor Edad");
            Mayor1 = 1;
        } else {
            System.out.println("La persona " + P1.getNombre() + " es de menor Edad");
            Menor1 = 1;
        }

        //Salto de linea
        System.out.println("********************");
        //Se crea las demas personas de manera analoga:
        servicioPersona Au2Persona = new servicioPersona();
        System.out.println("Segunda Persona:");
        Persona P2 = Au2Persona.crearPersona();
        //Para la Segunda Persona le llamaremos los metodos:
        //Metodo Calcular IMC(Indice De Masa Corporal)
        int IMC2 = Au2Persona.calcularIMC(P2);
        int Ideal2 = 0;
        int Sobre2 = 0;
        int Debajo2 = 0;
        switch (IMC2) {
            case 1:
                System.out.println("la persona " + P2.getNombre() + " tiene sobrepeso");
                Sobre2 = 1;
                break;
            case 0:
                System.out.println("la persona " + P2.getNombre() + " está en su peso ideal");
                Ideal2 = 1;
                break;
            case -1:
                System.out.println("la persona " + P2.getNombre() + " está por debajo de su peso ideal");
                Debajo2 = 1;
                break;
            default:
                System.out.println("No se Realizo el Calculo");
        }
        //Metodo esMayorDeEdad
        //Variables auxilares que alojan de la segunda persona el dato de edad mayor
        int Mayor2 = 0;
        int Menor2 = 0;
        if (Au2Persona.esMayorDeEdad(P2)) {
            System.out.println("La persona " + P2.getNombre() + " es de mayor Edad");
            Mayor2 = 1;
        } else {
            System.out.println("La persona " + P2.getNombre() + " es de menor Edad");
            Menor2 = 1;
        }

        //Para la Tercera Persona le llamaremos los metodos:
        //Salto de linea
        System.out.println("********************");
        servicioPersona Au3Persona = new servicioPersona();
        System.out.println("Tercera Persona");
        Persona P3 = Au3Persona.crearPersona();
        int IMC3 = Au3Persona.calcularIMC(P3);
        int Ideal3 = 0;
        int Sobre3 = 0;
        int Debajo3 = 0;
        switch (IMC3) {
            case 1:
                System.out.println("la persona " + P3.getNombre() + " tiene sobrepeso");
                Sobre3 = 1;
                break;
            case 0:
                System.out.println("la persona " + P3.getNombre() + " está en su peso ideal");
                Ideal3 = 1;
                break;
            case -1:
                System.out.println("la persona " + P3.getNombre() + " está por debajo de su peso ideal");
                Debajo3 = 1;
                break;
            default:
                System.out.println("No se Realizo el Calculo");
        }
        //Metodo esMayorDeEdad
        //Variables auxilares que alojan de la tercera persona el dato de edad mayor
        int Mayor3 = 0;
        int Menor3 = 0;
        if (Au3Persona.esMayorDeEdad(P3)) {
            System.out.println("La persona " + P3.getNombre() + " es de mayor Edad");
            Mayor3 = 1;
        } else {
            System.out.println("La persona " + P3.getNombre() + " es de menor Edad");
            Menor3 = 1;
        }

        //Para la Cuarta Persona le llamaremos los metodos:
        //Salto de linea
        System.out.println("********************");
        servicioPersona Au4Persona = new servicioPersona();
        System.out.println("Cuarta Persona");
        Persona P4 = Au4Persona.crearPersona();
        int IMC4 = Au4Persona.calcularIMC(P4);
        int Ideal4 = 0;
        int Sobre4 = 0;
        int Debajo4 = 0;
        switch (IMC4) {
            case 1:
                System.out.println("la persona " + P4.getNombre() + " tiene sobrepeso");
                Sobre4 = 1;
                break;
            case 0:
                System.out.println("la persona " + P4.getNombre() + " está en su peso ideal");
                Ideal4 = 1;
                break;
            case -1:
                System.out.println("la persona " + P4.getNombre() + " está por debajo de su peso ideal");
                Debajo4 = 1;
                break;
            default:
                System.out.println("No se Realizo el Calculo");
        }
        //Metodo esMayorDeEdad
        //Variables auxilares que alojan de la cuarta persona el dato de edad mayor
        int Mayor4 = 0;
        int Menor4 = 0;
        if (Au4Persona.esMayorDeEdad(P4)) {
            System.out.println("La persona " + P4.getNombre() + " es de mayor Edad");
            Mayor4 = 1;
        } else {
            System.out.println("La persona " + P4.getNombre() + " es de menor Edad");
            Menor4 = 1;
        }

        //Calculo De Pesos y Mayorias
        //Se crean dos variables auxiliares que alojan la cantidad de personas mayores y menores
        double Mayor = 0;
        double Menor = 0;

        //Comparamos las edades de las Cuatro Personas
        for (int i = 0; i < 4; i++) {
            //SI TODOS SON MAYORES
            if ((Mayor1 == 1 && Mayor2 == 1 && Mayor3 == 1 && Mayor4 == 1)) {
                //Entonces hay cuatro personas mayores
                Mayor += 1;
                //SI TODOS SON MENORES
            } else if ((Mayor1 == 0 && Mayor2 == 0 && Mayor3 == 0 && Mayor4 == 0)) {
                //Entonces hay cuatro personas Menores
                Menor += 1;

                //SI LAS DOS PRIMERAS PERSONAS SON MENORES Y LAS DOS ULTIMAS MAYORES
            } else if ((Mayor1 == 0 && Mayor2 == 0 && Mayor3 == 1 && Mayor4 == 1) || (Mayor1 == 1 && Mayor2 == 1 && Mayor3 == 0 && Mayor4 == 0)||(Mayor1 == 1 && Mayor2 == 0 && Mayor3 == 0 && Mayor4 == 1)||(Mayor1 == 0 && Mayor2 == 1 && Mayor3 == 1 && Mayor4 == 0)||(Mayor1 == 0 && Mayor2 == 1 && Mayor3 == 0 && Mayor4 == 1)||(Mayor1 == 1 && Mayor2 == 0 && Mayor3 == 1 && Mayor4 == 0) ) {
                //Entonces hay dos personas menores
                Menor += 0.5;
                //Entonces hay dos personas mayores
                Mayor += 0.5;

                //SI LAS TRES PRIMERAS PERSONAS SON MAYORES Y LA ULTIMA MENOR
            } else if ((Mayor1 == 1 && Mayor2 == 1 && Mayor3 == 1 && Mayor4 == 0) || (Mayor1 == 1 && Mayor2 == 1 && Mayor3 == 0 && Mayor4 == 1) || (Mayor1 == 1 && Mayor2 == 0 && Mayor3 == 1 && Mayor4 == 1) || (Mayor1 == 0 && Mayor2 == 1 && Mayor3 == 1 && Mayor4 == 1)) {
                //Entonces hay una sola persona menor
                Menor += 0.25;
                //Entonces hay tres personas mayores
                Mayor += 1 - 0.25;
                
                //SI LAS TRES PRIMERAS PERSONAS SON MENORES Y LA ULTIMA MAYOR
            } else if ((Mayor1 == 0 && Mayor2 == 0 && Mayor3 == 0 && Mayor4 == 1) || (Mayor1 == 0 && Mayor2 == 0 && Mayor3 == 1 && Mayor4 == 0) || (Mayor1 == 0 && Mayor2 == 1 && Mayor3 == 0 && Mayor4 == 0) || (Mayor1 == 1 && Mayor2 == 0 && Mayor3 == 0 && Mayor4 == 0)) {
                //Entonces hay una sola persona mayor
                Mayor += 0.25;
                //Entonces hay tres personas menores
                Menor += 1 - 0.25;
            }
        }

        //Se pasa a porcentaje
        double PorMayor = Mayor / 4;
        PorMayor = PorMayor * 100;
        double PorMenor = Menor / 4;
        PorMenor = PorMenor * 100;
        System.out.println("---------------------------------------------");
        System.out.println("El Porcentaje de Personas Mayores es: " + PorMayor + "%");
        System.out.println("---------------------------------------------");
        System.out.println("El Porcentaje de Personas Menores es:" + PorMenor + "%");
        System.out.println("---------------------------------------------");
        //Calculo de Pesos
        //Comparacion de pesos
        //Se crea variables auxiliares que alojan las cantidades de personas con los respectivos pesos
        double Ideal = 0, Debajo = 0, Sobre = 0;
        //bucle que recorre y analiza cada persona y su peso
        for (int i = 0; i < 4; i++) {
            
            //SI TODOS TIENEN EL PESO IDEAL
            if (Ideal1 == 1 && Ideal2 == 1 && Ideal3 == 1 && Ideal4 == 1) {
                //Entonces hay cuatro personas con peso ideal
                Ideal += 1;
                //SI TRES PERSONAS TIENEN EL PESO IDEAL
            } else if ((Ideal1 == 1 && Ideal2 == 1 && Ideal3 == 1 && Ideal4 == 0) || (Ideal1 == 1 && Ideal2 == 1 && Ideal3 == 0 && Ideal4 == 1) || (Ideal1 == 1 && Ideal2 == 0 && Ideal3 == 1 && Ideal4 == 1) || (Ideal1 == 0 && Ideal2 == 1 && Ideal3 == 1 && Ideal4 == 1)) {
                //entonces hay tres personas con el peso ideal
                Ideal += 1 - 0.25;
                //SI DOS PERSONAS TIENEN EL PESO IDEAL
            } else if ((Ideal1 == 1 && Ideal2 == 1 && Ideal3 == 0 && Ideal4 == 0) || (Ideal1 == 0 && Ideal2 == 0 && Ideal3 == 1 && Ideal4 == 1)||(Ideal1 == 1 && Ideal2 == 0 && Ideal3 == 0 && Ideal4 == 1)||(Ideal1 == 0 && Ideal2 == 1 && Ideal3 == 1 && Ideal4 == 0)||(Ideal1 == 1 && Ideal2 == 0 && Ideal3 == 1 && Ideal4 == 0)||(Ideal1 == 0 && Ideal2 == 1 && Ideal3 == 0 && Ideal4 == 1)) {
                //Entonces hay dos personas que tienen el peso ideal
                Ideal += 0.5;
                //SI SOLAMENTE HAY UNA PERSONA CON PESO IDEAL
            } else if ((Ideal1 == 0 && Ideal2 == 0 && Ideal3 == 0 && Ideal4 == 1) || (Ideal1 == 0 && Ideal2 == 0 && Ideal3 == 1 && Ideal4 == 0) || (Ideal1 == 0 && Ideal2 == 1 && Ideal3 == 0 && Ideal4 == 0) || (Ideal1 == 1 && Ideal2 == 0 && Ideal3 == 0 && Ideal4 == 0)) {
                //Entonces hay solamente una persona con peso ideal
                Ideal += 0.25;
            }
            
            //SI TODOS TIENEN SOBREPESO
            if (Sobre1 == 1 && Sobre2 == 1 && Sobre3 == 1 && Sobre4 == 1) {
                //Entonces las cuatro personas tiene sobrepeso
                Sobre += 1;
                //SI TRES PERSONAS TIENEN SOBREPESO
            } else if ((Sobre1 == 1 && Sobre2 == 1 && Sobre3 == 1 && Sobre4 == 0) || (Sobre1 == 1 && Sobre2 == 1 && Sobre3 == 0 && Sobre4 == 1) || (Sobre1 == 1 && Sobre2 == 0 && Sobre3 == 1 && Sobre4 == 1) || (Sobre1 == 0 && Sobre2 == 1 && Sobre3 == 1 && Sobre4 == 1)) {
                //Entonces Tres personas tienen SobrePeso
                Sobre += 1 - 0.25;
                //SI DOS PERSONAS TIENEN SOBREPESO
            } else if ((Sobre1 == 1 && Sobre2 == 1 && Sobre3 == 0 && Sobre4 == 0) || (Sobre1 == 0 && Sobre2 == 0 && Sobre3 == 1 && Sobre4 == 1)||(Sobre1 == 1 && Sobre2 == 0 && Sobre3 == 0 && Sobre4 == 1)||(Sobre1 ==0  && Sobre2 == 1 && Sobre3 == 0 && Sobre4 == 1)||(Sobre1 == 1 && Sobre2 == 0 && Sobre3 == 1 && Sobre4 == 0)) {
                //Entonces dos personas tienen sobrepeso
                Sobre += 0.5;
                //SI UNA SOLA PESONA TIENE SOBREPESO
            } else if ((Sobre1 == 0 && Sobre2 == 0 && Sobre3 == 0 && Sobre4 == 1) || (Sobre1 == 0 && Sobre2 == 0 && Sobre3 == 1 && Sobre4 == 0) || (Sobre1 == 0 && Sobre2 == 1 && Sobre3 == 0 && Sobre4 == 0) || (Sobre1 == 1 && Sobre2 == 0 && Sobre3 == 0 && Sobre4 == 0)) {
                //Entonces solamente una sola persona tiene sobrepeso
                Sobre += 0.25;
            }
            
            //SI TODOS TIENEN BAJO PESO
            if (Debajo1 == 1 && Debajo2 == 1 && Debajo3 == 1 && Debajo4 == 1) {
                //Entonces hay cuatro personas con bajo peso
                Debajo += 1;
                //SI TRES PERSONAS TIENEN BAJO PESO
            } else if ((Debajo1 == 1 && Debajo2 == 1 && Debajo3 == 1 && Debajo4 == 0) || (Debajo1 == 1 && Debajo2 == 1 && Debajo3 == 0 && Debajo4 == 1) || (Debajo1 == 1 && Debajo2 == 0 && Debajo3 == 1 && Debajo4 == 1) || (Debajo1 == 0 && Debajo2 == 1 && Debajo3 == 1 && Debajo4 == 1)) {
                //Entonces hay tres personas con bajo peso
                Debajo += 1 - 0.25;
                //SI DOS PERSONAS TIENEN BAJO PESO 
            } else if ((Debajo1 == 1 && Debajo2 == 1 && Debajo3 == 0 && Debajo4 == 0) || (Debajo1 == 0 && Debajo2 == 0 && Debajo3 == 1 && Debajo4 == 1)||(Debajo1 == 1 && Debajo2 == 0 && Debajo3 == 0 && Debajo4 == 1)||(Debajo1 == 0 && Debajo2 == 1 && Debajo3 == 0 && Debajo4 == 1)||(Debajo1 == 1 && Debajo2 == 0 && Debajo3 == 1 && Debajo4 == 0)) {
                //Entonces hay dos personas que tienen bajo peso
                Debajo += 0.5;
                //SI UNA PERSONA TIENE BAJO PESO
            } else if ((Debajo1 == 0 && Debajo2 == 0 && Debajo3 == 0 && Debajo4 == 1) || (Debajo1 == 0 && Debajo2 == 0 && Debajo3 == 1 && Debajo4 == 0) || (Debajo1 == 0 && Debajo2 == 1 && Debajo3 == 0 && Debajo4 == 0) || (Debajo1 == 1 && Debajo2 == 0 && Debajo3 == 0 && Debajo4 == 0)) {
                //Entonces hay solamente una persona con bajo peso
                Debajo += 0.25;
            }

        }
        //Se Pasa a porcentaje
        double PorIdeal = (Ideal / 4) * 100;
        double PorDebajo = (Debajo / 4) * 100;
        double PorSobre = (Sobre / 4) * 100;
        System.out.println("------------------------------------------------------");
        System.out.println("El Porcentaje de personas con peso Ideal es: " + PorIdeal + "%");
        System.out.println("------------------------------------------------------");
        System.out.println("El Porcentaje de personas con bajo peso es: " + PorDebajo + "%");
        System.out.println("------------------------------------------------------");
        System.out.println("El Porcentaje de personas con Sobrepeso es: " + PorSobre + "%");
        System.out.println("------------------------------------------------------");
        /*
        Puede que las combinaciones en el analisis de Edades y Pesos no de siempre correctamente
        */
    }

}
