package com.testAutomationCoach.eHerencia.animals;

import com.testAutomationCoach.libs.Coordenadas;

import java.io.File;

public class Animal {
	protected File picture;
	protected File ruido;
	protected char comida; //Carne o Vegetales o ambos
	protected int nivelHambre; //1-100
	protected String habitat; //selva, bosque, desierto, etc.
	protected Coordenadas location;
	
	public void hacerRuido() {}
	public void comer() {}
	public void dormir() {}
	public void recorrerTerreno() {}

}
