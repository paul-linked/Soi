package Ropeways;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ropeways_Subtask1 {
    public void runApp() {

        PrintWriter writeMe = null;
        try {
            writeMe = new PrintWriter(new File("C:\\Users\\plundberg\\Desktop\\SOI\\ropeways\\output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //create answer file

        File input = new File("C:\\Users\\plundberg\\Desktop\\SOI\\ropeways\\ropeways-sub1-upsolve-attempt3.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //read file

//        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {        //go through runs

            int islands = sc.nextInt();
            int Difflengths = sc.nextInt();
            int[] heights = new int[islands];

            for (int j = 0; j < islands; j++) {
                heights[j] = sc.nextInt();
            }

            int ropeLength = sc.nextInt();


            int[] boringCounter = new int[islands];

            boringCounter[0]=0;

            for (int j = 1; j < islands; j++) {
                int mini = Integer.MAX_VALUE;
                for (int k = j-ropeLength; k < j; k++) {
                    if (k<0){continue;}
                    int thing = boringCounter[k];
                    if (heights[k]<=heights[j]){thing++;}
                    mini = Math.min(mini, thing); // take smaller value
                }
                boringCounter[j]=mini;
            }

            System.out.println("Case #" + i + ": " + boringCounter[islands-1]);
            writeMe.println("Case #" + i + ": " + boringCounter[islands-1]);
        }
        writeMe.close();
    }
}
