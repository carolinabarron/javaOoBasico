package com.testAutomationCoach.eHerencia.doctores;

import javax.print.Doc;

public class Doctor extends ProfesionalDeSalud{

    public String especialidad;

    public Doctor(String nombre, String profesion, String especialidad){
        super(nombre, profesion);
        this.especialidad = especialidad;

    }

    public Doctor(){
        super();
        this.especialidad = null;
    }

    public void prescribirMedicina() {}

    public String getEspecialidad() {
        return null;
    }
}
