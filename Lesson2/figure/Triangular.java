package lesson2.hw.figure;

import lesson2.hw.Point;
import lesson2.hw.Shape;

public class Triangular extends Shape {
    private Point a;
    private Point b;
    private Point c;

    private double sideA;
    private double sideB;
    private double sideC;


    public Triangular(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangular() {
        super();
    }

    private void pointToLine(){
        sideA = Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
        sideB = Math.sqrt(Math.pow(c.getX()-b.getX(),2)+Math.pow(c.getY()-b.getY(),2));
        sideC = Math.sqrt(Math.pow(a.getX()-c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
    }

    @Override
    public double getPerimeter() {
        this.pointToLine();
        return sideA+sideB+sideC;
    }

    @Override
    public double getArea() {
        this.pointToLine();
        if (sideA + sideB > sideC) {
            double p = this.getPerimeter() / 2;
            double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return area;
        } else {
            System.out.println("A triangle with given sides does not exist");
            return 0;
        }
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangular{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
