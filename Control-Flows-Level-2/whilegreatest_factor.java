import java.util.*;
class whilegreatest_factor
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i = n-1;
int greatestfactor = 1;
while(i>=1)
{
if(n%i==0)
{
greatestfactor=i;
break;
}
i--;
}
System.out.println("Greatest Factor is "+ greatestfactor);
}
}