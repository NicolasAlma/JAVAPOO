/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author tu
 */
public class Circunferencia {
    //Atributos
    private double Radio;
    //Construcor vacio
    public Circunferencia() {
    }
    //Constructores con parametros
    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }
    
    //Get and Set
    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    //Metodo ToString
    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + Radio + '}';
    }
    
    
    
    
    
}
