package com.testAutomationCoach.eHerencia.doctores;

public class ProfesionalDeSalud {

    protected String nombre;
    protected String profesion;

    public ProfesionalDeSalud(String nombre, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public ProfesionalDeSalud() {

    }

    public void tratarPaciente() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


}
