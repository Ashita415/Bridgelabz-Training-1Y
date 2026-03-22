package com.single;
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        System.out.println("Title: " + title +
                ", Year: " + publicationYear +
                ", Author: " + name +
                ", Bio: " + bio);
    }
}

