package com.Question3;
import java.util.*;
import static java.util.stream.Collectors.*;

public class Runner {
    public static void main(String[] args) {
        List<Insurance> claims = Arrays.asList(
                new Insurance("Health", 5000),
                new Insurance("Health", 7000),
                new Insurance("Vehicle", 12000),
                new Insurance("Vehicle", 15000),
                new Insurance("Life", 20000),
                new Insurance("Health", 3000)
        );

        Map<String, Double> avgByType = claims.stream()
                .collect(groupingBy(
                        c -> c.type,
                        averagingDouble(c -> c.amount)
                ));

        avgByType.forEach((type, avg) ->
                System.out.println(type + " -> " + avg)
        );
    }
}
