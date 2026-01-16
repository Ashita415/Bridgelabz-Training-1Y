import java.util.*;
public class student
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
int pens = sc.nextInt();
int student = sc.nextInt();
int per_student = pens/student;
int remaining = pens%student;
System.out.println("The Pen Per Student is " +per_student + " and the remaining pen not distributed is " +remaining);
}
}