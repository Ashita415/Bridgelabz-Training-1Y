import java.util.*;
public class triangle
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
double height = sc.nextDouble();
double base = sc.nextDouble();
double area = 0.5*height*base;
System.out.println("Area " +area);
}
}