import java.util.*;
class bonus
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
double sal = sc.nextDouble();
int ser = sc.nextInt();
if(ser>5)
{
double bonus = sal*0.05;
System.out.println("Bonus Amount = " +bonus);
}
else
{
System.out.println("No bonus");
}
}
}