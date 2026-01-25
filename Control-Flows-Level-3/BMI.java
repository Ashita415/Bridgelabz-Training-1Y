import java.util.*;
class BMI
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double weight = sc.nextDouble();
double heightCM = sc.nextDouble();
double heightM = heightCM/100.0;
double BMI = weight/(heightCM*heightCM);
if(BMI<=18.4)
{
System.out.println("Underweight");
}
else if(18.5<BMI && BMI<24.9)
{
System.out.println("Normal");
}
else if(25.0<BMI && BMI<39.9)
{
System.out.println("Overweight");
}
else if(BMI>40.0)
{
System.out.println("Obese");
}
}
}