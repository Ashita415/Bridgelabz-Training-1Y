import java.util.*;
class FizzBuzz
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num<0)
{
System.out.println("Invalid");
return;
}
String result[]=new String[num];
for(int i=1;i<=num;i++)
{
if(i%3==0 && i%5==0)
{
System.out.println(result[i-1]="FizzBuzz");
}
else if(i%3==0)
{
System.out.println(result[i-1]="Fizz");
}
else if(i%5==0)
{
System.out.println(result[i-1]="Buzz");
}
else
{
System.out.println(result[i]=String.valueOf(i));
}
}
}
}