package Ropeways;

import java.util.Scanner;

public class Ropeways_Subtask1 {
    public void runApp() {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {        //go through runs

            int islands = sc.nextInt();
            int numLengths = sc.nextInt();
            int[] heights = new int[islands];

            for (int j = 0; j < islands; j++) {
                heights[j] = sc.nextInt();
            }

            int ropeLength = sc.nextInt();
            int boringCounter = 0;

            for (int j = 0; j < islands-1; j++) {
                if (heights[j] > heights[j+1]) {
                    boringCounter++;
                }
            }
            System.out.println("Case #" + i + ": " + boringCounter);
        }
    }
}
