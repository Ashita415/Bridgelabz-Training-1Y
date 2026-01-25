import java.util.*;
class three
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
int amar_age = sc.nextInt();
int akbar_age = sc.nextInt();
int anthony_age = sc.nextInt();
double amar_height = sc.nextDouble();
double akbar_height = sc.nextDouble();
double anthony_height = sc.nextDouble();
if(amar_age<akbar_age && amar_age<anthony_age)
{
System.out.println("Amar is youngest");
}
else if(akbar_age<amar_age && akbar_age<anthony_age)
{
System.out.println("Akbar is youngest");
}
else
{
System.out.println("Anthony is youngest");
}
if(amar_height>akbar_height && amar_height>anthony_height)
{
System.out.println("Amar is tallest");
}
else if(akbar_height>amar_height && akbar_height>anthony_height)
{
System.out.println("Akbar is tallest");
}
else
{
System.out.println("Anthony is tallest");
}
}
}