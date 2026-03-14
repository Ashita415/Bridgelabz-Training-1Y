package com.gla.classandobject.Level2;
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book() {}
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String t = sc.nextLine();
        System.out.print("Enter Author: ");
        String a = sc.nextLine();
        System.out.print("Enter Price: ");
        double p = sc.nextDouble();

        Book b = new Book(t, a, p);
        b.display();
        sc.close();
    }
}
