package T_Shirts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TShirts_subtask1 {
    public void runApp(){

        PrintWriter writeMe = null;
        try {
            writeMe = new PrintWriter(new File("C:\\Users\\plundberg\\Desktop\\SOI\\tshirts\\subtask 1\\output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //create answer file

        File input = new File("C:\\Users\\plundberg\\Desktop\\SOI\\tshirts\\subtask 1\\tshirts-sub1-upsolve-attempt0.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //read file

        //Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {

            int minSize = sc.nextInt();
            int maxSize = sc.nextInt();
            int currentSize = sc.nextInt();

            if (currentSize >= minSize && currentSize <= maxSize) {
                System.out.println("Case #" + i + ": Yes");
            } else {
                System.out.println("Case #" + i + ": No");
            }
        }
    }
}
