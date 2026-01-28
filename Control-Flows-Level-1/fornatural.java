import java.util.*;
class fornatural
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();
if(num<=0)
{
System.out.println("Enter a natural number");
}
else
{
int sum1 = num*(num+1)/2;
int sum =0;
for (int i = 1; i<=num; i++)
{
sum +=i;
}
if(sum1==sum)
{
System.out.println("Both Results are equal");
}
else
{
System.out.println("Both Results are not equal");
}
}
}
}