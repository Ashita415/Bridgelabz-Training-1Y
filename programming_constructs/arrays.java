import java.util.*;
public class arrays
{
public static void main(String[] args) 
{
int[] arr=new int[5];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
System.out.println("Length of the Array :- "+arr.length);
System.out.println("Using to String ");
System.out.println(Arrays.toString(arr));
System.out.println("\nUsing to for Loop");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
System.out.println("Using for each loop :- ");
for(int num :arr)
{
System.out.println(num);
}
System.out.println("Reverse the array :- ");
for(int i=arr.length-1;i >= 0;i--)
{
System.out.println(arr[i]);
}
System.out.println("Even numbers in Array :- ");
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]);
}
}
}
}