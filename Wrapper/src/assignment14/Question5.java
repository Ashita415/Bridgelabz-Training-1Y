package assignment14;

public class Question5 {
    public static void main(String[] args)
    {
        int num1=Integer.parseInt("123");
        System.out.println("Integer.parseInt (\"123\") ="+num1);

        double num2=Double.parseDouble("3.14");
        System.out.println("Double.parseDouble (\"3.14\")= "+num2);

        boolean num3= Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean (\"true\"="+num3);

        String num4=Integer.toBinaryString(10);
        System.out.println("Integer.toBinaryString(10) ="+num4);

        boolean num5=Character.isDigit('5');
        System.out.println("Character.isDigit ('5') =+num5");

        char num6=Character.toUpperCase('a');
        System.out.println("Character.toUpperCase('a')="+num6);
    }
}
