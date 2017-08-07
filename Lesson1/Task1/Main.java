package com.OOP;

public class Main {

    public static void main(String[] args) {

        Cat catOne = new Cat("Charlie", "White", 4);
        Cat catTwo = new Cat("Kris", "Black", 1);
        Cat catThree = new Cat("Loly", "Gray", 0);

        catOne.meow();
        catTwo.play();
        catThree.playCat(catTwo);

    }

}
