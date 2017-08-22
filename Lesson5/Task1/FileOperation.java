package HW.Lesson5;

import java.io.*;

public class FileOperation {

    public static void copyFile(File in, File out) throws IOException{
        if (in==null || out==null){
            throw new IllegalArgumentException("Null file pointer");
        }
        try (InputStream fis = new FileInputStream(in);
             OutputStream fos = new FileOutputStream(out)){
            byte [] buffer = new byte[1024*1024];
            int n = 0;
            for (;(n=fis.read(buffer))>0;){
                fos.write(buffer,0,n);
            }

        }catch (IOException e){
            throw e;
        }
    }
}
