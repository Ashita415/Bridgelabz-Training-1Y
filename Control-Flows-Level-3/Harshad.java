import java.util.*;
class Harshad
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
int temp = n;
while(temp>0)
{
int digit = temp%10;
sum +=digit;
temp = temp/10;
}
if(n%sum==0)
{
System.out.println("Harshad Number");
}
else
{
System.out.println("Not a Harshad Number");
}
}
}