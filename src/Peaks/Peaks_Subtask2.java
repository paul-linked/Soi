package Peaks;

import java.util.Scanner;

public class Peaks_Subtask2 {
    public void runApp() {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {    //go thru runs
            int testpoints = sc.nextInt();
            int[] points = new int[testpoints];

            for (int j = 0; j < testpoints; j++) {  //populate array
                points[j] = sc.nextInt();
            }
            int counter = 0;
            for (int j = 0; j < points.length - 2; j++) {
                int first = points[j];
                int second = points[j + 1];
                int third = points[j + 2];
                if (first < second && second > third) {
                    counter++;
                }

            }
            System.out.println("Case #" + i + ": " + counter);
        }

    }
}

