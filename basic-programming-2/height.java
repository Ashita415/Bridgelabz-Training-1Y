import java.util.*;
public class height
{
public static void main (String args [])
{
Scanner sc = new Scanner (System.in);
double height = sc.nextDouble();
double feet = height/12;
double inch = height/2.54;
System.out.println("Your Height in cm is " +height + " while in feet is " +feet + " and inches is " +inch);
}
}