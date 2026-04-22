package com.Question1;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Dune", 8.2, 2021),
                new Movie("Avatar 2", 7.8, 2022),
                new Movie("Oppenheimer", 8.9, 2023),
                new Movie("Tenet", 7.5, 2020)
        );

        List<Movie> top5 = movies.stream()
                .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                        .reversed()
                        .thenComparingInt(m -> m.releaseYear))
                .limit(5)
                .collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}
