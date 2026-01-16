import java.util.*;
public class PCM
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int Maths= sc.nextInt();
int Physics= sc.nextInt();
int Chemistry= sc.nextInt();
int average = (Maths+Physics+Chemistry)/3;
System.out.println("Sam's average mark in PCM is " +average);
}
}