package com.testAutomationCoach.aAbstraccion;

public class Perro {
    //variables de instancia, tamano, raza, nombre
    public double tamanio;
    public String raza;
    public String nombre;

    //constructor
    public Perro(double tamanioPerro, String razaPerro, String nombrePerro){
        this.tamanio = tamanioPerro;
        this.raza = razaPerro;
        this.nombre = nombrePerro;
    }

    public Perro() {

    }

    //comportamiento: ladrar, juguetear, comer, etc.

    public void ladrar() {}
    public void correr() {}
    public void comer() {}
}
