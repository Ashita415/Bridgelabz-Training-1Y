package com.bank.main;

import java.util.Scanner;
import com.bank.util.*;
import static java.lang.Math.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InterestCalculator ic = new InterestCalculator();

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = ic.calculateSimpleInterest(p, r, t);
        double ci = ic.calculateCompoundInterest(p, r, t);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}