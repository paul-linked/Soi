package T_Shirts;

import java.util.Scanner;

public class TShirts_Subtask2 {
    public void runApp() {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {
            int numPeople = sc.nextInt();
            int[] minSizes = new int[numPeople];
            int[] maxSizes = new int[numPeople];

            for (int j = 0; j < numPeople; j++) { // populate min sizes
                minSizes[j] = sc.nextInt();
            }
            for (int j = 0; j < numPeople; j++) { // populate max sizes
                maxSizes[j] = sc.nextInt();
            }

            int shirtSize = sc.nextInt();
            int counter = 0;

            for (int j = 0; j < numPeople; j++) {
                if (shirtSize >= minSizes[j] && shirtSize <= maxSizes[j]) {
                    counter++;
                }
            }

            System.out.println("Case #" + i + ": " + counter);


        }
    }
}
