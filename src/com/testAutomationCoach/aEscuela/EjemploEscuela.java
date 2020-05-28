package com.testAutomationCoach.aEscuela;

public class EjemploEscuela {
    public static void main(String[] args) {
        Alumno arlene = new Alumno();
        arlene.nombre = "Arlene";
        arlene.apellidoPaterno = "Aviles";
        arlene.apellidoMaterno = "Alvarado";
        arlene.edad = 42;
        arlene.grupo = 'a';
        arlene.grado = 1;
        Alumno gerardo = new Alumno();

        Maestro omar = new Maestro();

        Maestro panadero = new Maestro();

        Salon virtual = new Salon();

        Edificio watson = new Edificio();
        Bano bain = new Bano();
        Prefecto martha = new Prefecto();

        Escuela cervantes = new Escuela();
        cervantes.instalaciones = new Edificio[2];
        cervantes.instalaciones[0] = watson;
        cervantes.instalaciones[1] = new Edificio();

        cervantes.maistro = new Maestro[3];
        cervantes.maistro[0] = omar;
        cervantes.maistro[1] = panadero;
        cervantes.maistro[2] = new Maestro();

        cervantes.prefes = new Prefecto[2];
        cervantes.prefes[0] = martha;
        cervantes.prefes[1] = new Prefecto();

        virtual.grupes = new Grupo[1];
        Salon primeroA = new Salon();

        Grupo g = new Grupo();
        g.asistentes = new Alumno[2];
        g.asistentes[0] = arlene;
        g.asistentes[1] = gerardo;

        virtual.grupes[0] = g;

        g.maestros = cervantes.maistro;
//        g.maestros[0] = omar;
//        g.maestros[1] = panadero;
//        g.maestros[2] = cervantes.maistro[2];



    }
}
