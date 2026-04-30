package com.MobilePhoneContactApp;

public class Runner {
    public static void main(String[] args) {
        Contact c1=new Contact("Ashita ",945822100);
        Contact c2=new BusinessContact("Joe",837001464,"jyp music");
        System.out.println("--- Regular Contact ---");
        c1.displayDetail();
        System.out.println("---Business Contact---");
        c2.displayDetail();
    }
}
