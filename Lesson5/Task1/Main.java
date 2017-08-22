package HW.Lesson5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        MyFileFilter mFF = new MyFileFilter("txt", "pdf");

        File folderIn = new File("Input");

        File[] fileList = folderIn.listFiles(mFF);

        for (File file : fileList) {
            System.out.println(file);
            try {
                File fileout = new File("Output//"+file.getName());
                FileOperation.copyFile(file, fileout);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}