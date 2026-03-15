package com.company.main;

import java.util.Scanner;
import com.company.hr.Employee;
import com.company.payroll.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Employee ID: ");
        e.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter Department: ");
        e.setDepartment(sc.nextLine());

        System.out.print("Enter Salary: ");
        e.setSalary(sc.nextDouble());

        Payroll p = new Payroll();
        double finalSalary = p.calculateBonus(e);

        System.out.println("\nEmployee Details");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Salary after Bonus: " + finalSalary);
    }
}
