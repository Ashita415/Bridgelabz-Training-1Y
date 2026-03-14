package com.gla.classandobject.Level2;
import java.util.Scanner;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {}
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println(guestName + " " + roomType + " " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Guest Name: ");
        String g = sc.nextLine();
        System.out.print("Enter Room Type: ");
        String r = sc.nextLine();
        System.out.print("Enter Nights: ");
        int n = sc.nextInt();

        HotelBooking booking = new HotelBooking(g, r, n);
        booking.display();
        sc.close();
    }
}
