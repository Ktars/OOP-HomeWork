package lesson2.hw.figure;

import lesson2.hw.Point;
import lesson2.hw.Shape;

public class Circle extends Shape{

    private Point centre;
    private Point pointOnCircle;
    private double radius;

    public Circle(Point centre, Point pointOnCircle) {
        super();
        this.centre = centre;
        this.pointOnCircle = pointOnCircle;
    }

    public Circle() {
        super();
    }

    private void getRadius(){
        radius = Math.sqrt(Math.pow(pointOnCircle.getX()-centre.getX(),2)+Math.pow(pointOnCircle.getY()-centre.getY(),2));
    }

    @Override
    public double getPerimeter() {
        this.getRadius();
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        this.getRadius();
        return 2*Math.PI*Math.pow(radius,2);
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Point getPointOnCircle() {
        return pointOnCircle;
    }

    public void setPointOnCircle(Point pointOnCircle) {
        this.pointOnCircle = pointOnCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre +
                ", pointOnCircle=" + pointOnCircle +
                ", radius=" + radius +
                '}';
    }
}
