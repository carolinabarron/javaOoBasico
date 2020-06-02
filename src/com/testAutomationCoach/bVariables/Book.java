package com.testAutomationCoach.bVariables;

class Book {
    String title; //La clase book tiene atributo title
    String author; //La clase book tiene atributo author
}


class BookTestDrive {
    public static void main(String [] args) {


        Book [] myBooks = new Book[3];  //se instancia la clase book con el arreglo de 3 objetos myBooks
        int x = 0; // Se inicializa variable x entera = 0
        myBooks[0] = new Book(); // Se instancia MyBooks en la posicíon 0 = nuevo objeto Book
        myBooks[1] = new Book(); // Se instancia MyBooks en la posicíon 1 = nuevo objeto Book
        myBooks[2] = new Book(); // Se instancia MyBooks en la posicíon 2 = nuevo objeto Book
        myBooks[0].title = "The Grapes of Java"; //Se asigna valor al atributo title a myBooks en la posicíon 0
        myBooks[1].title = "The Java Gatsby"; //Se asigna valor al atributo title a myBooks en la posicíon 1
        myBooks[2].title = "The Java Cookbook"; //Se asigna valor al atributo title a myBooks en la posicíon 2
        myBooks[0].author = "bob"; //Se asigna valor al atributo author a myBooks en la posicíon 0
        myBooks[1].author = "sue"; //Se asigna valor al atributo author a myBooks en la posicíon 1
        myBooks[2].author = "ian"; //Se asigna valor al atributo author a myBooks en la posicíon 2


        while (x < 3) { //Mientras x sea menor a 3
            System.out.print(myBooks[x].title); //Imprime título en la posicíon x
            System.out.print(" by "); //Imprime la palabra "by"
            System.out.println(myBooks[x].author); //Imprime author en la posicíon x
            x = x + 1; //Incrementa x
        }
    }
}
