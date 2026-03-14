package com.gla.classandobject.Level2;
import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    void displayProtected() {
        System.out.println("Accessing protected Account Holder from subclass: " + accountHolder);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter Account Number: ");
        sa.accountNumber = sc.nextLine();
        System.out.print("Enter Account Holder: ");
        sa.accountHolder = sc.nextLine();
        System.out.print("Enter Balance: ");
        sa.setBalance(sc.nextDouble());

        sa.display();
        sa.displayProtected();
        sc.close();
    }
}