package com.gla.classandobject.Level2;
import java.util.Scanner;

class Book1 {
    String title;
    String author;
    double price;
    boolean available = true;

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void display() {
        System.out.println(title + " " + author + " " + price + " " + available);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book1 b = new Book1();

        System.out.print("Enter Title: ");
        b.title = sc.nextLine();
        System.out.print("Enter Author: ");
        b.author = sc.nextLine();
        System.out.print("Enter Price: ");
        b.price = sc.nextDouble();

        b.display();
        b.borrowBook();
        b.display();
        sc.close();
    }
}