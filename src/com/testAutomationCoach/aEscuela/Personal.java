package com.testAutomationCoach.aEscuela;

public class Personal extends Persona{
    String departamento;
    String puesto;
    int numeroEmpleado;
    char turno;
    String gradoEscolar;

    public Personal(String nombre, String apellidoPaterno, String apellidoMaterno,
                    int edad, String direccion, String departamento, String puesto,
                    int numeroEmpleado, char turno, String gradoEscolar){
        super(nombre, apellidoPaterno, apellidoMaterno, edad, direccion);
        this.departamento = departamento;
        this.puesto = puesto;
        this.numeroEmpleado = numeroEmpleado;
        this.turno = turno;
        this.gradoEscolar = gradoEscolar;


        //Métodos

    }


    public Personal() {

    }
}
