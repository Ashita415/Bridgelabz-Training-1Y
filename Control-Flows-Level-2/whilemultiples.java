import java.util.*;
class whilemultiples
{
public static void main (String args [])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i = 100;
if(n<=0 || n>=100)
{
System.out.println("Enter positive number less than 100 only");
}
else
{
System.out.println("Multiples are");
while(i>=1)
{
if(i%n==0)
{
System.out.println(i);
}
i--;
}
}
}
}