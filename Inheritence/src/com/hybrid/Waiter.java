package com.hybrid;
class Waiter extends Person implements Worker {
    int tableNumber;

    Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving table " + tableNumber + ".");
    }
}
