package com.testAutomationCoach.cMethods;

public class GuitarraElectrica {
    String nombre;
    String modelo;
    String color;
    Guitarrista[] famoso;

    public GuitarraElectrica(String nombre, String modelo, String color) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        famoso = new Guitarrista[5];
    }

    public void afinarGuitarra() {
    }

    public void tunearGuitarra() {
    }

}
