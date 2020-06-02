package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class EjemploDelTriangulo {

	public static void main(String[] args) {
		TrianguloRectangulo t = new TrianguloRectangulo(5,3);
		
		System.out.println("El area es " + t.sacarArea());
		System.out.println("El perimetro es " + t.sacarPerimetro());
		System.out.println(t);
		
		Input.print(Double.MAX_VALUE + "\n");
		Input.print(Float.MAX_VALUE);
	}
}
