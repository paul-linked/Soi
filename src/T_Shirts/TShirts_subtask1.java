package T_Shirts;

import java.util.Scanner;

public class TShirts_subtask1 {
    public void runApp(){
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {

            int minSize = sc.nextInt();
            int maxSize = sc.nextInt();
            int currentSize = sc.nextInt();

            if (currentSize >= minSize && currentSize <= maxSize) {
                System.out.println("Case #" + i + ": Yes");
            } else {
                System.out.println("Case #" + i + ": No");
            }
        }
    }
}
