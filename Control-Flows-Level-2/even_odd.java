import java.util.*;
class even_odd
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
if(n<=0)
{
System.out.println("Enter natural number only");
}
else
{
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i+ " is an Even Number");
}
else
{
System.out.println(i+ " is a Odd Number");
}
}
}
}
}