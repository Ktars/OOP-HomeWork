package com.OOP;

public class Main {

    public static void main(String[] args) {
        Phone P1 = new Phone("iPhone", 123456);
        Phone P2 = new Phone("Samsung", 375832);
        Phone P3 = new Phone("Meizu", 533123);


        P1.registerNumber();
        P2.registerNumber();

        P1.call(375832);
        P2.call(124234);
        P3.call(123456);
    }
}
