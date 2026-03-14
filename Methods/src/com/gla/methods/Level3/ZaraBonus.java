package com.gla.methods.Level3;
class ZaraBonus {

    public static int[][] generateData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    public static void display(double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Old Salary\tBonus\tNew Salary");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%.0f\t\t%.2f\t%.2f\n", result[i][0], result[i][1], result[i][2]);

            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
    public static void main(String[] args) {

        int[][] data = ZaraBonus.generateData(10);
        double[][] result = ZaraBonus.calculateBonus(data);
        ZaraBonus.display(result);

    }
}
