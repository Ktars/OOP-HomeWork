package HW.Lesson3.Exeptions;

import java.util.concurrent.ExecutionException;

public class NameIsNotFound extends ExecutionException {
    public void printMessage() {
        System.err.println("Name is not found");
    }
}
