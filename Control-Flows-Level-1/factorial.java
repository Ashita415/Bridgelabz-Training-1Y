import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int i =1;
int factorial = 1;
if(num<=0)
{
System.out.println("Enter only positive number");
}
else
{
while(i<=num)
{
factorial = factorial*i;
i++;
}
System.out.println("Factorial: " +factorial);
}
}
}