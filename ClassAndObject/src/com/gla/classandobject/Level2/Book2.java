package com.gla.classandobject.Level2;
import java.util.Scanner;

class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }

    static class EBook extends Book2 {
        void displayProtected() {
            System.out.println("Accessing protected Title from subclass: " + title);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            EBook eb = new EBook();

            System.out.print("Enter ISBN: ");
            eb.ISBN = sc.nextLine();
            System.out.print("Enter Title: ");
            eb.title = sc.nextLine();
            System.out.print("Enter Author: ");
            eb.setAuthor(sc.nextLine());

            eb.display();
            eb.displayProtected();
            sc.close();
        }
    }
}
