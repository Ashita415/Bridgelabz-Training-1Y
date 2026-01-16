import java.util.Scanner;
public class ageofHarry
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int birthyear = sc.nextInt();
int currentyear = sc.nextInt();
int age = currentyear - birthyear;
System.out.println("Harry's age in 2024 is "+ age);
}
}