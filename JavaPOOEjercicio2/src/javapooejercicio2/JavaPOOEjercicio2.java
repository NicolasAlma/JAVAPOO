/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooejercicio2;

import Entidades.Circunferencia;
import Servicios.circunferenciaServicios;


/**
 *
 * @author tu
 */
public class JavaPOOEjercicio2 {

    /**
     * @param args Declarar una clase llamada Circunferencia que tenga como
     * atributo privado el radio de tipo real. A continuación, se deben crear
     * los siguientes métodos: a) Método constructor que inicialice el radio
     * pasado como parámetro. b) Métodos get y set para el atributo radio de la
     * clase Circunferencia. c) Método para crearCircunferencia(): que le pide
     * el radio y lo guarda en el atributo del objeto. d) Método area(): para
     * calcular el área de la circunferencia (Area = PI * Radio^2). e)
     * Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * Radio)
     */
    public static void main(String[] args) {
       
       circunferenciaServicios CS = new circunferenciaServicios();
       
       Circunferencia CM = CS.crearCircunferencia();
       
       CS.area(CM);
       CS.perimetro(CM);
       
    }

}
