/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
       bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
       resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
       Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int Num;
      int Suma = 0;
      byte Cont;
        Cont = 0;
      boolean Busqueda = false;
      do {
          
          System.out.println("Ingrese un numero");
          Num= leer.nextInt();
          Cont++;
          if (Num!=0) {
              if (Num<0){
                 Suma = Suma;
              }else{
                 Suma= Num + Suma; 
              }
          }else{
              Busqueda = true;
              break;
          }

      } while ((Cont!=20));
     if(Busqueda==true){
        System.out.println("Se capturó el numero cero");
     }
     if (Busqueda==false){
        System.out.println("La Suma de los numeros leidos es "+Suma);
     }           
    }
    
}