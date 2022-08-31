package Peaks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Peaks_Subtask1 {
        public void runApp() {
            PrintWriter writeMe = null;
            try {
                writeMe = new PrintWriter(new File("C:\\Users\\plundberg\\Desktop\\SOI\\peaks\\output.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }   //create answer file

            File input = new File("C:\\Users\\plundberg\\Desktop\\SOI\\peaks\\peaks-sub1-upsolve-attempt1.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(input);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }   //read file


            int runs = sc.nextInt();
            for (int i = 0; i < runs; i++) {

                int testpoints = sc.nextInt();
                int[] points = new int[testpoints];
                for (int j = 0; j < testpoints; j++) {
                    points[j] = sc.nextInt();
                }
                if (points[0] < points[1] && points[1] > points[2]) {
                    System.out.println("Case #" + i + ": yes");
                    writeMe.println("Case #" + i + ": yes");
                } else {
                    System.out.println("Case #" + i + ": no");
                    writeMe.println("Case #" + i + ": no");
                }
            }
            writeMe.close();

        }
}
