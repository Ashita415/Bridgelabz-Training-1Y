package com.hybrid;
public class Runner {
    public static void main(String[] args) {
        Worker w1 = new Chef("Alice", 101, "Italian");
        Worker w2 = new Waiter("Bob", 102, 5);
        w1.performDuties();
        w2.performDuties();
    }
}
