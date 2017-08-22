import java.io.File;

public class Main {

    public static void main(String[] args) {

        File fileOne = new File("Input//fileOne.txt");
        File fileTwo = new File("Input//fileTwo.txt");
        File fileResult = new File("Output//result.txt");

        FileOperation.sameWords(fileOne,fileTwo,fileResult);
    }
}
