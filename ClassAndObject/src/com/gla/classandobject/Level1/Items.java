package com.gla.classandobject.Level1;
import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Price: ");
        item.price = sc.nextDouble();

        System.out.println("\nItem Details:");
        item.displayItem();

        System.out.print("\nEnter Quantity: ");
        int quantity = sc.nextInt();

        double total = item.calculateTotalCost(quantity);
        System.out.println("Total Cost = " + total);

        sc.close();
    }
}
