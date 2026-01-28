import java.util.*;
class count
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int count = 0;
int m=n;
while(m!=0){
 m=m/10;
 count++;
}
System.out.println(count);
}
}