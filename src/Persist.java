package src;

import java.io.*;
import java.util.Scanner;

public class Persist {
    public static void main(String[] j) {
        File fobj = new File("C:\\Users\\adepu\\IdeaProjects\\javalessonsitab\\src\\file.txt");
        try {
            if (fobj.createNewFile()) {
                System.out.println("file created");
            }
            //fobj.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileWriter fw;
        try {
            fw = new FileWriter("C:\\Users\\adepu\\IdeaProjects\\javalessonsitab\\src\\file.txt");
            fw.write("RADHA");
            fw.write("RANI");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fr = new FileReader("C:\\Users\\adepu\\IdeaProjects\\javalessonsitab\\src\\file.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
