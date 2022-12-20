/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
 */
package javapooejercicio10;


import java.util.Arrays;

/**
 *
 * @author tu
 */
public class JavaPOOEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.
         */
        //Se crean los arreglos correspondientes
        double[] arreyA = new double[50];
        double[] arreyB = new double[20];
        /*
        El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
         */
        //Bucle que rellena el vector A
        for (int i = 0; i < 50; i++) {
            arreyA[i] = (Math.random() * 10);
        }

        //Bucle que muestra el vector A sin cortar decimales
        System.out.println("El Arreglo tiene los siguentes numeros:");
        for (int i = 0; i < 50; i++) {
            System.out.print(" (" + arreyA[i] + ") ");
        }

        //Salto de linea
        System.out.println("");
        System.out.println("");

        //Bucle que muestra el vector A cortando decimales
        System.out.println("Mostrado en decimales mas cortos queda y redondeado:");
        for (int i = 0; i < 50; i++) {
            System.out.print(" [" + String.format("%.1f", arreyA[i]) + "] ");
        }

        //Salto de linea
        System.out.println("");
        System.out.println("");
        //el arreglo A se debe ordenar de menor a mayor
        //Metodo arrays que ordena el arreglo A
        Arrays.sort(arreyA);

        //Se muestra el arreglo por consola ordenado y con los decimales mas cortos
        System.out.println("El Arreglo A ordenado de menor a mayor(Con los decimales cortos): ");
        for (int i = 0; i < 50; i++) {
            System.out.print(" {" + String.format("%.1f", arreyA[i]) + "} ");
        }

        //Salto de linea
        System.out.println("");
        System.out.println("");

        /*
        copiar los primeros 10 números ordenados al arreglo B de 20 elementos y
        rellenar los 10 últimos elementos con el valor 0.5.
         */
        //Metodo arraycopy que copia los primeros diez valores del primer arreglo al segundo
        System.arraycopy(arreyA, 0, arreyB, 0, 10);
        //
        System.out.println("El Arreglo B con los primeros diez valores del Arreglo A");
        for (int i = 0; i < 20; i++) {
            System.out.print(" {" + String.format("%.1f", arreyB[i]) + "} ");
        }
        
        System.out.println("");
        System.out.println("");
        for (int i = 10; i < 20; i++) {
            arreyB[i]=0.5;
        }
        /*
        Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
        */
     

        System.out.println("-------------ArregloA{ORDENADO}-------------");
        
        for (int i = 0; i < 50; i++) {
            System.out.print(" {" + String.format("%.1f", arreyA[i]) + "} ");
        }
        
        //Salto del linea
        System.out.println("");
        System.out.println("-------------ArregloB{COMBINADO}-------------");
        for (int i = 0; i < 20; i++) {
            System.out.print(" {" + String.format("%.1f", arreyB[i]) + "} ");
        }
        //Salto de linea
        System.out.println("");
        
    }

}
