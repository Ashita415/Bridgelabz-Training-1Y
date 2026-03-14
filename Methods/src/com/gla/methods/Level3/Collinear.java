package com.gla.methods.Level3;
import java.util.Scanner;
public class Collinear {
    public static boolean checkSlope(int x1,int y1,int x2,int y2,int x3,int y3) {

        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        if(slopeAB == slopeBC && slopeBC == slopeAC) {
            return true;
        }
        return false;
    }
    public static boolean checkArea(int x1,int y1,int x2,int y2,int x3,int y3) {

        int area = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2);

        if(area == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if(checkSlope(x1,y1,x2,y2,x3,y3)) {
            System.out.println("Points are collinear (Slope Method)");
        } else {
            System.out.println("Points are NOT collinear (Slope Method)");
        }

        if(checkArea(x1,y1,x2,y2,x3,y3)) {
            System.out.println("Points are collinear (Area Method)");
        } else {
            System.out.println("Points are NOT collinear (Area Method)");
        }

    }
}
