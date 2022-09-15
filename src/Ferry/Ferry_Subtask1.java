package Ferry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ferry_Subtask1 {
    public void runApp(){
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

        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();

        for (int i = 0; i < runs; i++){
            int numIslands = sc.nextInt();
            int goingIslands = numIslands-1;

            int[][] oldRoutes = new int[2][goingIslands];
            int[][] newRoutes = new int[2][goingIslands];

            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < goingIslands; j++) {
                    oldRoutes[k][j] = sc.nextInt();
                }
            }   // populate old routes
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < goingIslands; j++) {
                    newRoutes[k][j] = sc.nextInt();
                }
            }   // populate new routes

            for (int j =0; j < goingIslands; j++) {
                if (oldRoutes[0][j] > oldRoutes[1][j]) {
                    int temp = oldRoutes[1][j];
                    oldRoutes[1][j] = oldRoutes[0][j];
                    oldRoutes[0][j] = temp;
                }
                if (newRoutes[0][j] > newRoutes[1][j]) {
                    int temp = newRoutes[1][j];
                    newRoutes[1][j] = newRoutes[0][j];
                    newRoutes[0][j] = temp;
                }
            } // make sure small number top

            int nonchange = 1;
            for (int j = 0; j < goingIslands; j++) {
                for (int k = 0; k < goingIslands; k++) {
                    if (oldRoutes[0][j] == newRoutes[0][k]) {
                        if (oldRoutes[1][j] == newRoutes[1][k]) {
                            nonchange++;
                        }
                    }
                }
            }
            System.out.print("Case #" + i + ": " + (numIslands - nonchange) + "\n");

        }
    }
}
