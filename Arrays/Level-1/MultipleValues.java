import java.util.*;
class MultipleValues 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
double arr[] = new double[10];
double sum = 0.0;
int i = 0;
while (true) 
{
double num = sc.nextDouble();
if (num <= 0) 
{
break;
}
if (i == 10) 
{
break;
}
arr[i] = num;
i++;
}
for (int j = 0; j < i; j++) 
{
sum = sum + arr[j];
}
System.out.println("Sum of all numbers = " + sum);
}
}
