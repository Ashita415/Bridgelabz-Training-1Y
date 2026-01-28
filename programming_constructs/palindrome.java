import java.util.*;
class palindrome
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int temp = num;
int rem;
int rev = 0;
while(temp!=0)
{
rem = temp%10;
rev = rev*10+rem;
temp = temp/10;
}
if(temp==num)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}