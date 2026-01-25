import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum=0;
int originalnumber = n;
while(originalnumber !=0)
{
int digit = originalnumber%10;
sum= sum+(digit*digit*digit);
originalnumber=originalnumber/10;
}
if(sum==n)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong Number");
}
}
}