package com.implementing;

public class Runner1 {
        public static void main(String[] args) {
            Rentable r1 = new Car();
            Rentable r2 = new Bike();
            Rentable r3 = new Bus();

            r1.rent();
            r2.rent();
            r3.rent();

            r1.returnVehicle();
            r2.returnVehicle();
            r3.returnVehicle();
        }
}
