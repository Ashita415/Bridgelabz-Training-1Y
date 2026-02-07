import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            double physics, chemistry, maths;

            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                physics = sc.nextDouble();
            } while (physics < 0 || physics > 100);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chemistry = sc.nextDouble();
            } while (chemistry < 0 || chemistry > 100);

            do {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                maths = sc.nextDouble();
            } while (maths < 0 || maths > 100);

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            percentage[i] = (physics + chemistry + maths) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] +
                    ", Chemistry=" + marks[i][1] +
                    ", Maths=" + marks[i][2] +
                    ", Percentage=" + percentage[i] +
                    ", Grade=" + grade[i]);
        }

        sc.close();
    }
}
