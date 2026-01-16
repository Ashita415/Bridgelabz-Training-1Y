import java.util.*;
public class earth
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
double radius = sc.nextDouble();
double pi = sc.nextDouble();
double volumekm = (4/3)*pi*radius*radius*radius;
double volumemiles = (4/3)*pi*radius*radius*radius*1.6;
System.out.println("The volume of earth in cubic kilometers is " +volumekm + " and cubic miles is " +volumemiles);
}
}