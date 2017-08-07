package com.OOP;

public class Main {

    public static void main(String[] args) {

        Triangle triangleOne = new Triangle(3,6,8);
        Triangle triangleTwo = new Triangle(12.2,5.153,8);
        Triangle triangleThree = new Triangle(2,5.153,8);


        triangleOne.area();
        triangleTwo.area();
        triangleThree.area();
    }
}
