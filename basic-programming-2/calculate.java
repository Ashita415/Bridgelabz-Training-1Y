import java.util.*;
public class calculate
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
double cp = sc.nextDouble();
double sp = sc.nextDouble();
double profit = sp-cp;
double profit_percentage = (profit/cp)*100;
System.out.println("The Cost Price is INR " +cp + " and Selling Price is INR " +sp);
System.out.println("The Profit is INR " +profit + " and Profit Percentage is " +profit_percentage);
}
}