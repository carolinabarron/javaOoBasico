package com.testAutomationCoach.bVariables;

class Hobbit {


    String name;


    public static void main(String [] args) {


        Hobbit[] h = new Hobbit[3]; //Declara "h" un array de objetos Hobbit - inicializa un array de 3 objetos
        int z = 0; //Declara entero z y lo inicializa en 0


        while (z < 3) { //Mientras z sea menor a 4
            z = z + 1; //Incrementa z en 1
            h[z] = new Hobbit(); //El array de objetos h en la posición z = nueva instancia de Hobbit --Q no estaba ya declarado en línea 12?
            h[z].name = "bilbo"; //objeto h en la posición z, atributo nombre= "bilbo"
            if (z == 1) { //Si z es igual a 1
                h[z].name = "frodo"; // Asigna al atributo nombre del objeto h posición 1 = Frodo
            }
            if (z == 2) { //Si z es igual a 2
                h[z].name = "sam"; //Asignale al atributo nombre del objeto h posición 2 = Sam
            }
            System.out.print(h[z].name + " is a "); //el nombre guardado en h - posición z es impreso como "Nombre" is a
            System.out.println("good Hobbit name"); //imprime en la misma línea "good Hobbit name"
        }
    }
}

//Exception: ArrayIndexOutOfBoundsException: 3
//Line18 - posición 3 no es válida, se declaró arreglo de 3 - posiciones 0, 1, 2