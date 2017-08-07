package com.OOP;


public class Phone {
    private String model;
    private int number;

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Phone() {
        super();
    }

    public void registerNumber(){
        if (!Network.numberInDB(this.number))
            Network.addNumber(this);
    }

    public void call(int number){
        System.out.println(this.toString() + " is calling on number " + number);
        if (Network.numberInDB(number))
            System.out.println("Rings...");
        else
            System.out.println("Wrong number");
    }

    @Override
    public String toString() {
        return  model + "("+ number+ ")";
    }
}
