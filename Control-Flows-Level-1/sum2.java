import java.util.*;
class sum2
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
double value = sc.nextDouble();
double total=0.0;
while(value != 0)
{
total = total+value;
System.out.print("Enter again: ");
value = sc.nextDouble();
if(value<=0)
{
	break;
}
total = total+value;
}
System.out.println("Total = "+total);
}
}