import java.util.Scanner;

public class Peaks_Subtask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {    //go thru runs
            int testpoints = sc.nextInt();
            int length = sc.nextInt();
            int[] points = new int[testpoints];

            for (int j = 0; j < testpoints; j++) {  //populate array
                points[j] = sc.nextInt();
            }
            int maxPeaks = 0;
            for (int j = 0; j < testpoints; j++) {
                int peaks = 0;
                for (int k = j; k < length-2; k++) {
                    int first = points[k];
                    int second = points[k+1];
                    int third = points[k+2];
                    if (first < second && second > third) {
                        peaks++;
                    }
                if (peaks > maxPeaks) {
                    maxPeaks = peaks;
                }

                }
            }



            System.out.println("Case #" + i + ": " + maxPeaks);
        }
    }

}

