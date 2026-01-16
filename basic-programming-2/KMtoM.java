import java.util.*;
public class KMtoM
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
double kilometer = sc.nextDouble();
double miles = kilometer*1.6;
System.out.println("The total miles is " +miles +" mile for the given " +kilometer + " km");
}
}