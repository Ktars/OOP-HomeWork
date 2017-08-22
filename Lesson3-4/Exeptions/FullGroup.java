package HW.Lesson3.Exeptions;

public class FullGroup extends Exception{
    public void printMessage(){
        System.err.println("Group is full");
    }
}
