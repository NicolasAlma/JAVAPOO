/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Usuario {

    Scanner leer = new Scanner(System.in);
    //Atributos
    private String nombre;
    private String Apellido;
    private int DNI;
    private Date Nacimiento;

    //Constructor Vacio
    public Usuario() {
    }

    //Constructor Con Parametros
    public Usuario(String nombre, String Apellido, int DNI, Date Nacimiento) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Nacimiento = Nacimiento;
    }
    //Setter & Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;   
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Nacimiento=" + Nacimiento + '}';
    }
}
