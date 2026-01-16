import java.util.*;
public class handshakes
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int max = (n*(n-1))/2;
System.out.println("The number of possible handshakes are " +max);
}
}