package Claw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Claw_subTask1 { //passed all tests
    public void runApp() {
        PrintWriter writeMe = null;
        try {
            writeMe = new PrintWriter(new File("C:\\Users\\plundberg\\Desktop\\SOI\\Claw\\output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //create answer file

        File input = new File("C:\\Users\\plundberg\\Desktop\\SOI\\Claw\\clawsort-sub1-upsolve-attempt0.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //read file


//        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();

        for (int i = 0; i < runs; i++) {

            int numCards = sc.nextInt();
            int[] cards = new int[numCards];

            for (int j = 0; j < numCards; j++) {
                cards[j] = sc.nextInt();
            }   //populate cards array

            String[] operate = sc.next().split("(?!^)");

//            int counter = 0;
            int armPos = 0;
            int armHold = cards[0];
            for (int j = 0; j < operate.length-2; j++) {
                if (operate[j].equals(">")) {
                    armPos++;
                }
                else {
                    armPos--;
                }
                int temp = cards[armPos];
                cards[armPos] = armHold;
                armHold = temp;

            }

            System.out.print("Case #" + i + ":");
            writeMe.print("Case #" + i + ":");
            for (int j = 0; j < numCards; j++) {
                System.out.print(" "+ cards[j]);
                writeMe.print(" "+ cards[j]);
            }
            System.out.println();
            writeMe.println();
        }
        writeMe.close();
    }
}
