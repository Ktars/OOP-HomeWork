package lesson2.hw.figure;

import lesson2.hw.Point;
import lesson2.hw.Shape;


public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    private double side;

    public Square(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Square() {
        super();
    }

    private void pointToLine(){
        side = Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
    }

    @Override
    public double getPerimeter() {
        this.pointToLine();
        return side*4;
    }

    @Override
    public double getArea() {
        this.pointToLine();
        return Math.pow(side,2);
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", side=" + side +
                '}';
    }
}
