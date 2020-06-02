package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;

	private int numRevoluciones;
	private double litrosGasolina;
	private double temperatura;



	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
		numRevoluciones = 0;
		litrosGasolina = 15;
		temperatura = 0.0;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	//comportamiento

	public void encender(){
	    this.numRevoluciones = 100;
	    this.litrosGasolina -=0.05;
	    this.temperatura +=2;

	};
	public void apagar(){
        this.numRevoluciones = 0;
        this.litrosGasolina -=0.05;
        this.temperatura -=10;
	};

	public void acelerar() {
	    if (numRevoluciones ==0.0){
            System.out.println("El auto está apagado");
        }
	    else {
            Input.print("run run\n");
            this.velocidadActual += 5.0;
            this.numRevoluciones += 1000;
            this.litrosGasolina -= 0.01;
            this.temperatura += 5.0;
        }
	}
	
	public void frenar() {
        if (numRevoluciones ==0.0){
            System.out.println("El auto está apagado");
        }
        else {
            Input.print("Screeeeech!\n");
            this.velocidadActual = 0;
            this.numRevoluciones -= 1000;
            this.litrosGasolina -= 0.001;
            this.temperatura += 0.01;
        }
	}
	
	public void retroceder() {
        if (numRevoluciones ==0.0){
            System.out.println("El auto está apagado");
        }
        else {
            Input.print("piii piii piii piii\n");
            this.velocidadActual -= -5;
            this.numRevoluciones += 1000;
            this.litrosGasolina -= 0.01;
            this.temperatura += 5.0;
        }
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}

	public int getNumRevoluciones() {
		return numRevoluciones;
	}

	public double getLitrosGasolina() {
		return litrosGasolina;
	}

	public double getTemperatura() {
		return temperatura;
	}
}
