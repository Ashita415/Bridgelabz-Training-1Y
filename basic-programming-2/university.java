import java.util.*;
public class university
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
int fee = sc.nextInt();
int discount_percent = sc.nextInt();
int discount = (fee * discount_percent)/100;
int discount_price = fee - discount;
System.out.println("The dicount amount is INR " +discount + " and final discounted fee is INR " +discount_price);
}
}