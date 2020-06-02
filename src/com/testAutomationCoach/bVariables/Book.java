package com.testAutomationCoach.bVariables;

class Book {
    String title; //La clase book tiene atributo title
    String author; //La clase book tiene atributo author
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

}


class BookTestDrive {
    public static void main(String [] args) {


        Book [] myBooks = new Book[3];  //se instancia la clase book con el arreglo de 3 objetos myBooks
        int x = 0; // Se inicializa variable x entera = 0
        myBooks[0] = new Book("The Grapes of Java", "bob"); // Se instancia MyBooks en la posicíon 0 = nuevo objeto Book
        myBooks[1] = new Book("The Java Gatsby", "sue"); // Se instancia MyBooks en la posicíon 1 = nuevo objeto Book
        myBooks[2] = new Book("The Java Cookbook", "ian"); // Se instancia MyBooks en la posicíon 2 = nuevo objeto Book



        while (x < 3) { //Mientras x sea menor a 3
            System.out.print(myBooks[x].title); //Imprime título en la posicíon x
            System.out.print(" by "); //Imprime la palabra "by"
            System.out.println(myBooks[x].author); //Imprime author en la posicíon x
            x = x + 1; //Incrementa x
        }
    }
}
