import java.util.*;
class OddEven
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();
int odd[] = new int[num/2+1];
int even[] = new int[num/2+1];
int evenindex = 0;
int oddindex = 0;
if(num<=0)
{
System.out.print("Error");
return;
}
for(int i=1;i<num;i++)
{
if(i%2==0)
{
even[evenindex++]=i;
}
else
{
odd[oddindex++]=i;
}
}
for(int i=0;i<evenindex;i++)
{
System.out.println("Even Array:- " +even[i]);
}
for(int i=0;i<oddindex;i++)
{
System.out.println("Odd Array:- " +odd[i]);
}
}
}