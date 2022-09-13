package Ferry;

import java.util.Scanner;

public class Ferry_Subtask1 {
    public void runApp(){
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();

        for (int i = 0; i < runs; i++){
            int numIslands = sc.nextInt();

            int[][] oldRoutes = new int[2][numIslands];
            int[][] newRoutes = new int[2][numIslands];

            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < numIslands; j++) {
                    oldRoutes[k][j] = sc.nextInt();
                }
            }   // populate old routes
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < numIslands; j++) {
                    newRoutes[k][j] = sc.nextInt();
                }
            }   // populate new routes

            for (int j = 0; j < numIslands; j++) {
                for (int k = 0; k < numIslands; k++) {

                }
            }
        }
    }
}
