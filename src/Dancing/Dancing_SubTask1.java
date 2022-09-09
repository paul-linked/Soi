package Dancing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Dancing_SubTask1 {
    public void runApp() {

        PrintWriter writeMe = null;
        try {
            writeMe = new PrintWriter(new File("C:\\Users\\plundberg\\Desktop\\SOI\\Dancing\\output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //create answer file

        File input = new File("C:\\Users\\plundberg\\Desktop\\SOI\\Dancing\\dancing-sub1-upsolve-attempt1.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //read file

//        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {

            int numMice = sc.nextInt();
            int[] times = new int[numMice];

            for (int j = 0; j < numMice; j++) {
                times[j] = sc.nextInt();
            }

            ArrayList<String> moves = new ArrayList<String>();

            int firstcount = 0;

            int totmoves = (int) Math.pow(numMice, 2);
            for (int j = 0; j < totmoves; j++) {
                if (j%3 == 0) {
                    if (firstcount%3 == 0) {
                        firstcount++;
                        moves.add("<");
                    }
                    else if(firstcount%3 == 1) {
                        firstcount++;
                        moves.add(">");
                    }
                    else {
                        firstcount++;
                        moves.add(".");
                    }
                }
                else {
                    if (moves.get(j-1).equals("<")) {
                        moves.add(">");
                    }
                    else if (moves.get(j-1).equals(">")) {
                        moves.add(".");
                    }
                    else {
                        moves.add("<");
                    }
                }
            }

            System.out.println("Case #" + i + ": " + numMice);
            writeMe.println("Case #" + i + ": " + numMice);
            for (int j = 0; j < numMice; j++) {
                System.out.print(times[j] + " ");
                writeMe.print(times[j] + " ");
                for (int k = j * 3; k < (j * 3) + 3; k++) {
                    System.out.print(moves.get(k));
                    writeMe.print(moves.get(k));
                }
                System.out.println();
                writeMe.println();
            }

        }
        writeMe.close();
    }
}
