/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaEjerciciosAprendisaje;

import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Ejercicio17 {

    /**
     * @param args Recorrer un vector de N enteros, contabilizando cuántos
     * números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5
     * dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        //Do para que el vector no se muy grande
        do {
            System.out.println("Ingrese un numero para el tamaño del vector(Hasta 10)");
            num = leer.nextInt();
        } while ((num >= 11) || (num < 1));
        
        //Define y asigna al vector valores hasta de 5 digitos
        int[] vector = new int[num];
        int num1;
        int ver;
        for (int i = 0; i < num; i++) {
            do {

                System.out.println("Ingrese un numero al vector de cualquier digito hasta 5");
                num1 = leer.nextInt();
                ver = num1 % 100000;   
            } while ((ver > 10000)||(num1==100000));
            vector[i] = num1;
            
        }
        System.out.println("El vector es: ");
        //Escribe el vector
        for (int i = 0; i < num; i++) {
            System.out.print("["+vector[i]+"]");
        }
        //Salto de linea
        System.out.println("");
        
        //contabiliza el vector
        double cociente;
        int resto;
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        for (int i = 0; i < num; i++) {
            //Para digitos de 1
            cociente=vector[i] / 10;
            resto=vector[i] % 10;
            if ( (resto==(vector[i]))&&(cociente==0) ) {
               uno++; 
            }
            //Para digitos de 2
            ///Para los multiplos de 10
            if ((resto==0)&&(cociente<10)&&(cociente>0)) {
                dos++;
            } 
            //Para todos los numeros de digito de 2
            if ((cociente<10)&&(cociente>0)&&((resto<=cociente)||(resto>=cociente))) {
                dos++;
            }
            //Para los digitos de 3
            //Para los multiplos de 100
            if ((cociente>=10)&&(cociente<100)&&(resto==0)) {
               tres++;
            }
            //Para todos los numeros de digito de 3
            if ((cociente>resto) && ((cociente>=10)&&(cociente<100))) {
                tres++;
            }
            //Para los digitos de 4
            //para los multiplos de 1000
            if ((resto==0)&&((cociente<=100)&&(cociente<1000)) ) {
               cuatro++;
            }
            //Para todos los numeros de digito de 4
            if ((cociente>resto)&&((cociente>=100)&&(cociente<1000))) {
                cuatro++;
            }
            
            
            
        }  
        System.out.println("La cantidad de digitos de uno es: "+uno);
        System.out.println("La cantidad de digitos de dos es: "+dos);
        System.out.println("La cantidad de digitos de tres es: "+tres);
        System.out.println("La cantidad de digitos de cuatro es: "+cuatro);
        
    }
    

}
