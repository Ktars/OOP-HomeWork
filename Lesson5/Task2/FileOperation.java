import java.io.*;
import java.util.*;


public class FileOperation {

    private static String fileInStr(File file) {

        try (BufferedReader f = new BufferedReader(new FileReader(file))) {

            StringBuilder str = new StringBuilder();
            String strBuffer = "";
            for (; (strBuffer = f.readLine()) != null; ) {
                str.append(strBuffer).append(" ");
            }
            return str.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void sameWords(File fileOne, File fileTwo, File resultFile){

        String strOne = FileOperation.fileInStr(fileOne);
        String strTwo = FileOperation.fileInStr(fileTwo);

        String[] txtArr1 = strOne.split("[- ,;:.!?\\s]+");
        String[] txtArr2 = strTwo.split("[- ,;:.!?\\s]+");

        HashSet<String> resultList = new HashSet<String>();

        for(String s1: txtArr1){
            for(String s2: txtArr2){
                if(s1.equals(s2)){
                    resultList.add(s1);
                }
            }
        }

        String result = "";
        for(String s: resultList){
            result += s + " ";
        }

        try(BufferedWriter f = new BufferedWriter(new FileWriter(resultFile))){
            f.write(result);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
