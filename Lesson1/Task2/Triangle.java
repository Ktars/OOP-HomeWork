package com.OOP;


public class Triangle {

   private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void area() {
        double p;
        double S;

        if (sideOne + sideTwo > sideThree) {
            p = (sideOne + sideTwo + sideThree) / 2;
            S = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
            System.out.println(S);
        } else {
            System.out.println("A triangle with given sides does not exist");
        }
    }
}
