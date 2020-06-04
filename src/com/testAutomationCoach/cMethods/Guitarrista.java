package com.testAutomationCoach.cMethods;

public class Guitarrista {
    //arreglo de guitarristas
    String nombre;
    String agrupacion;

    public Guitarrista(String nombre, String agrupacion) {
        this.nombre = nombre;
        this.agrupacion = agrupacion;
    }

    public boolean equals(Guitarrista g) {
        boolean x = false;
        return this.nombre.equals(g.nombre) && this.agrupacion.equals(g.agrupacion);
    }
}
