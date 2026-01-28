import java.util.*;
class natural
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();
int i = 1;
{
if(num<=0)
{
System.out.println("Enter a natural number");
}
else
{
int sum1 = num*(num+1)/2;
int sum =0;
while(i<=num)
{
sum+=i;
i++;
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
}