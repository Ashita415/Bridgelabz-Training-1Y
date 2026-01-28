import java.util.*;
class whilepower
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int p = sc.nextInt();
int result = 1;
int i = 1;
if(p<0)
{
System.out.println("Enter postive value only");
}
else
{
while(i<=p)
{
result *=n;
i++;
}
System.out.println(n+ " raised to the power " +p+ " is " +result);
}
}
}