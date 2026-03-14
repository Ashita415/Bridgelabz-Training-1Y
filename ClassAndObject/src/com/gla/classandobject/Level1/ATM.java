package com.gla.classandobject.Level1;
import java.util.Scanner;
class ATM {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM acc = new ATM();

        System.out.print("Enter Account Holder Name: ");
        acc.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();

        System.out.print("Enter Amount to Deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter Amount to Withdraw: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        acc.displayBalance();

        sc.close();
    }
}
