package com.testAutomationCoach.cMethods;


public class EjemploFamososGuitarristas {
    public static void main(String[] args) {
        Guitarrista[] listaGuitarrista = new Guitarrista[5];
        int x = 0;
        listaGuitarrista[0] = new Guitarrista("Jimmy Hendrix", "Solista");
        listaGuitarrista[1] = new Guitarrista("James Hetfield", "Metallica");
        listaGuitarrista[2] = new Guitarrista("Slash", "Guns&Roses");
        listaGuitarrista[3] = new Guitarrista("Dave Mustaine", "Megadeth");
        listaGuitarrista[4] = new Guitarrista("Jimmy Page", "Led Zeppelin");

        GuitarraElectrica g = new GuitarraElectrica("Fender", "Modelo1", "bicolor");
        g.famoso = listaGuitarrista;


        Guitarrista peter = new Guitarrista("Slash", "Guns&Roses");
        // peter.nombre = "BenitoJuarez";
        // listaGuitarrista[2] = peter;

        for (int i = 0; i < g.famoso.length; i++) {
            Guitarrista actual = g.famoso[i];
            if (actual.nombre.equals(peter.nombre)) {
                System.out.println("el guitarrista " + peter.nombre + " toca la guitarra " + g.nombre);
                break;
            }

        }


    }
}

