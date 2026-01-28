import java.util.*;
class power
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int p = sc.nextInt();
int result = 1;
if(p<0)
{
System.out.println("Enter postive value only");
}
else
{
for(int i=1; i<=p; i++)
{
result *=n;
}
System.out.println(n+ " raised to the power " +p+ " is " +result);
}
}
}