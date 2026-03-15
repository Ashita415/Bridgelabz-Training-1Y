import static java.lang.Math.*;
import java.util.Scanner;

public class StaticDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.println("\n--- Static Methods Demonstration ---");

        System.out.println("abs(a) = " + abs(a));

        if(a >= 0)
            System.out.println("sqrt(a) = " + sqrt(a));
        else
            System.out.println("sqrt(a) = NaN");

        System.out.println("pow(a, b) = " + pow(a, b));
        System.out.println("max(a, b) = " + max(a, b));
        System.out.println("min(a, b) = " + min(a, b));

        sc.close();
    }
}
