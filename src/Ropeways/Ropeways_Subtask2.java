package Ropeways;

import java.util.Scanner;

public class Ropeways_Subtask2 {
    public void runApp() {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {

            int islands = sc.nextInt();
            int difflengths = sc.nextInt();
            int[] heights = new int[islands];
            int[] ropeLengths = new int[difflengths];

            for (int j = 0; j < islands; j++) {
                heights[j] = sc.nextInt();
            }

            for (int j = 0; j < difflengths; j++) {
                ropeLengths[j] = sc.nextInt();
            }

            int[] boringCounter = new int[islands];
            boringCounter[0]=0;
            int [] outputs = new int[difflengths];

            for (int g = 0; g < difflengths; g++) {
                for (int j = 1; j < islands; j++) {
                    int mini = Integer.MAX_VALUE;
                    for (int k = j-ropeLengths[g]; k < j; k++) {
                        if (k<0){continue;}
                        int thing = boringCounter[k];
                        if (heights[k]<=heights[j]){thing++;}
                        mini = Math.min(mini, thing); // take smaller value
                    }
                    boringCounter[j]=mini;
                }
                outputs[g] = boringCounter[islands-1];
            }
            System.out.print("Case #" + i + ": ");

            for (int val:outputs) {
                System.out.print(val);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
