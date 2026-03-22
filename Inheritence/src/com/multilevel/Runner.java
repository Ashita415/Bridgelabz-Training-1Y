package com.multilevel;

public class Runner {
        public static void main(String[] args) {

            Order o1 = new Order(101, "2026-03-01");
            Order o2 = new ShippedOrder(102, "2026-03-02", "TRK123");
            Order o3 = new DeliveredOrder(103, "2026-03-03", "TRK456", "2026-03-05");

            System.out.println(o1.getOrderStatus());
            System.out.println(o2.getOrderStatus());
            System.out.println(o3.getOrderStatus());
        }
}
