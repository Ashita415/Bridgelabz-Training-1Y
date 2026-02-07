import java.util.*;
class Numbers
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
int arr[] = new int [5];
for(int i=0;i<arr.length;i++)
{
arr [i] = sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]>0)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]+ " is Positive and Even.");
}
else
{
System.out.println(arr[i]+ " is Positive and Odd.");
}
}
else if(arr[i]<0)
{
System.out.println(arr[i]+ " is Negative.");
}
else
{
System.out.println(arr[i]+ " is Zero.");
}
}
if(arr[0]==arr[4])
{
System.out.println(arr[0]+ " and " +arr[4]+ " are equal.");
}
else if(arr[0]<arr[4])
{
System.out.println(arr[4]+ " is greater than " +arr[0]+ " .");
}
else
{
System.out.println(arr[4]+ " is less than " +arr[0]+ " .");
}
}
}