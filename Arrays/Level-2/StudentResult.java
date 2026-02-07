import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int phy[] = new int[n];
        int chem[] = new int[n];
        int math[] = new int[n];
        double per[] = new double[n];
        String grade[] = new String[n];

        for (int i = 0; i < n; i++) {

            phy[i] = sc.nextInt();
            while (phy[i] < 0)
                phy[i] = sc.nextInt();

            chem[i] = sc.nextInt();
            while (chem[i] < 0)
                chem[i] = sc.nextInt();

            math[i] = sc.nextInt();
            while (math[i] < 0)
                math[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            per[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (per[i] >= 80)
                grade[i] = "A";
            else if (per[i] >= 70)
                grade[i] = "B";
            else if (per[i] >= 60)
                grade[i] = "C";
            else if (per[i] >= 50)
                grade[i] = "D";
            else if (per[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        System.out.println("Stu\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), phy[i], chem[i], math[i], per[i], grade[i]);
        }

        sc.close();
    }
}
