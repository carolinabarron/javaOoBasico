package com.testAutomationCoach.aEscuela;

public class Maestro extends Personal{

    Materia[] clases;

    public Maestro(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String direccion, String departamento, String puesto, int numeroEmpleado, char turno, String gradoEscolar) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, direccion, departamento, puesto, numeroEmpleado, turno, gradoEscolar);
    }

    public Maestro() {
        super();
    }

    //Constructor
  //  public Maestro(){
//    }

}


/*


String nombre, String apellidoPaterno, String apellidoMaterno,
                    int edad, String direccion, String departamento, String puesto,
                    int numeroEmpleado, char turno, String gradoEscolar){
        super(nombre, apellidoPaterno, apellidoMaterno, edad, direccion);

 */