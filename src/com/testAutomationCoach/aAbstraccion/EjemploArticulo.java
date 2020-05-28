package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {
    public static void main(String[] args){
        Articulo laptop = new Articulo();
        laptop.nombre = "Lenovo T460s";
        laptop.existencia = 20;
        laptop.peso = 2;
        laptop.descripcion = "ASDASDA";
        laptop.estrellasCalificacion = 5;
        laptop.departamento = "Tecnologia";
        laptop.marca = "Lenovo";
        libs.Input.print("Nombre " + laptop.nombre + "\n");
        libs.Input.print("existencia " + laptop.existencia+ "\n");
        libs.Input.print("Peso " + laptop.peso + "\n");
        libs.Input.print("descripcion " + laptop.descripcion + "\n");
        libs.Input.print("estrellasCalificacion " + laptop.estrellasCalificacion + "\n");
        libs.Input.print("departamento " + laptop.departamento + "\n");
        libs.Input.print("marca " + laptop.marca + "\n");


    }
}
