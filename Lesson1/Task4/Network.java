package com.OOP;

public class Network {

    private static Phone numberDB[] = new Phone[10];


    public static void addNumber(Phone phone){
        for (int i = 0; i<numberDB.length; i++){
            if (numberDB[i] == null){
                numberDB[i] = phone;
                break;
            }
        }
    }

    public static boolean numberInDB(int number) {
        for (int i = 0; i < numberDB.length; i++) {
            if (numberDB[i] != null)
                if (numberDB[i].getNumber() == number)
                     return true;
        }
        return false;
    }


}
