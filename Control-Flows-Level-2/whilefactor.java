import java.util.*;
class whilefactor
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i=1;
if(n<=0)
{
System.out.println("Enter positive number only");
}
else
{
System.out.println("Factors are");
}
while(i<n)
{
if(n%i==0)
{
System.out.println(i);
}
i++;
}
}
}