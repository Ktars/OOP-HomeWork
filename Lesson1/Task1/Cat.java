package com.OOP;

public class Cat {

    private String name;
    private String color;
    private int age;       // full age

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }



    public Cat() {
        super();
    }

    public void meow(){
        if (age<=1){
            System.out.println(name+": mew-mew");
        }
        else
            System.out.println(name+": Meow-Meow");
    }

    public void play(){
            System.out.println(name+" plays with the ball");
    }

    public void playCat(Cat nCat){
        String nameCat = nCat.name;
        System.out.println(name+ " plays with " +nameCat);
        nCat.meow();
    }

}
