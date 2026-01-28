import java.util.*;
class multiples
{
public static void main (String args [])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n<=0 || n>=100)
{
System.out.println("Enter positive number less than 100 only");
}
else
{
System.out.println("Multiples are");
for(int i=100;i>=1;i--)
{
if(i%n==0)
{
System.out.println(i);
}
}
}
}
}