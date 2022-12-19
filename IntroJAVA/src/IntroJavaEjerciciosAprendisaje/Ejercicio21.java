/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

/**
 *
 * @author tu
 */
public class Ejercicio21 {

    /**
     * @param args Dadas dos matrices cuadradas de números enteros, la matriz M
     * de 10x10 y la matriz P de 3x3, se solicita escribir un programa en el
     * cual se compruebe si la matriz P está contenida dentro de la matriz M.
     * Para ello se debe verificar si entre todas las submatrices de 3x3 que se
     * pueden formar en la matriz M, desplazándose por filas o columnas, existe
     * al menos una que coincida con la matriz P. En ese caso, el programa debe
     * indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P.
     */
    public static void main(String[] args) {
        //Se definen las matrices
        int[][] MatrizM = new int[10][10];
        int[][] MatrizP = new int[3][3];
        llenarMatriz(MatrizM, MatrizP);
        MostrarArreglo(MatrizM, MatrizP);
        boolean ver = false;
        //Matriz 10*10
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                //Compara la matriz 10*10 con la matriz 3*3
                if ((i < 8) && (j < 8)) {

                    //El "segun" va ir variando para que asi vaya comparando cada cuadro de 3*3
                    switch (j) {
                        case 0:
                            //For porque se coloca una variable que recorre toda la matriz 3*3                           
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++) {

                                }
                            }

                            break;
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 6:

                            break;
                        case 7:

                            break;
                    }

                    //diagonal de ambas
                    //MatrizM[i][j]==MatrizP[a][b];
                    continue;
                }
            }
        }

    }

    public static void llenarMatriz(int[][] MatrizM, int[][] MatrizP) {
        //Le asigno valores a la matriz 10*10
        int num;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                MatrizM[i][j] = (int) (Math.random() * 30);

            }
        }
        //Le asigno valores a la matriz 3*3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizP[i][j] = (int) (Math.random() * 30);
            }
        }
    }

    public static void MostrarArreglo(int[][] MatrizM, int[][] MatrizP) {
        System.out.println("Matriz de 10*10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print("[" + MatrizM[i][j] + "]");
            }
            System.out.println("");
        }
        //Salto de linea
        System.out.println("");
        System.out.println("Matriz de 3*3");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("[" + MatrizP[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
//for (int a = 0; a < 7; a++) {
//            for (int b = 0; b < 7; b++) {
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++){
//                        if (matrizB [i][j] == matrizA[i+a][j+b]){
//                            contador+=1;
//                        }
//                    }
//                }
//                System.out.println("Coincidencias:"+contador);
//                contador=0;
//            }
//        }
