package com.Question1;

public class Movie {
    String title;
    double rating;
    int releaseYear;

    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return title + " (" + releaseYear + ") - " + rating;
    }
}
