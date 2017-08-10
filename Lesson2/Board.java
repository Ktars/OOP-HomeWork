package lesson2.hw;

import java.util.Arrays;

public class Board {
    private Shape board[] = new Shape[4];

    public Board(Shape[] board) {
        super();
        board = board;
    }

    public Board() {
        super();
    }

    private boolean ceckFreeSpace(){
        boolean ck = Arrays.asList(board).contains(null);
        return ck;
    }

    public void placeFigure(Shape shape,int boardPartNumber){
        if (this.ceckFreeSpace()){
            if (board[boardPartNumber]==null) {
                board[boardPartNumber] = shape;
            }
            else
                System.out.println("This part of the board is occupied by another figure");
        }
        else
            System.out.println("Board is full");
    }

    public void removeFigure(int boardPartNumber){
            if (board[boardPartNumber]!=null) {
                board[boardPartNumber] = null;
            }
            else
                System.out.println("Error: this part of the board is empty");
    }

    public double getSumArea() {
        double sum = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null)
                sum += board[i].getArea();
        }
        return sum;
    }

    public void print(){
        System.out.println("Board:");
        for (int i=0;i<this.board.length;i++){
            if (this.board[i]!=null)
                System.out.println("Part "+i+": "+this.board[i].toString());
        }
    }
}
