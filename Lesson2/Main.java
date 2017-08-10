package lesson2.hw;

import lesson2.hw.figure.Circle;
import lesson2.hw.figure.Square;
import lesson2.hw.figure.Triangular;

public class Main {

    public static void main(String[] args) {
        Board Board = new Board();
        Triangular triangularOne = new Triangular(new Point(2,5), new Point(6,10), new Point(4,2));
        Square squareOne = new Square(new Point(0,0),new Point(0,5),new Point(5,5),new Point(5,0));
        Circle circleOne = new Circle(new Point(5,5),new Point(10,10));
        Circle circleTwo = new Circle(new Point(2,3),new Point(15,11));

        Board.placeFigure(triangularOne,0);
        Board.placeFigure(squareOne,1);
        Board.placeFigure(circleOne,2);
        Board.placeFigure(circleTwo,3);

        System.out.println(Board.getSumArea());
        Board.print();

        Board.removeFigure(3);

        System.out.println();
        System.out.println(Board.getSumArea());
        Board.print();
    }
}
