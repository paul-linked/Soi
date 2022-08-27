package T_Shirts;

import java.util.Scanner;

public class TShirts_Subtask3 {
    public void runApp() {
    Scanner sc = new Scanner(System.in);
    int runs = sc.nextInt();

    for (int i = 0; i < runs; i++) {

        int numPeople = sc.nextInt();
        int numShirts = sc.nextInt();
        int[][] people = new int[2][numPeople];
        int[] shirtSizes = new int[numShirts];

        for (int j = 0; j < 2; j++) { //Populate People array
            for (int k = 0; k < numPeople; k++) {
                people[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < numShirts; j++) { //Populate shirtSizes array
            shirtSizes[j] = sc.nextInt();
        }


        for (int j = 0; j < numPeople; j++) {
            for (int k = j+1; k < numPeople; k++) {
                if (people[0][j] > people[0][k]) {
                    int tempMin = people[0][j];
                    int tempMax = people[1][j];
                    people[0][j] = people[0][k];
                    people[1][j] = people[1][k];
                    people[0][k] = tempMin;
                    people[1][k] = tempMax;
                }
            }
        }   //Sort peoples min ascending


        for (int j = 0; j < numShirts; j++) {
            for (int k = j + 1; k < numShirts; k++) {
                if (shirtSizes[j] > shirtSizes[k]) {
                    int temp = shirtSizes[j];
                    shirtSizes[j] = shirtSizes[k];
                    shirtSizes[k] = temp;
                }
            }
        }   //Sort shirts ascending


        int counter = 0;
        int posShirt = 0;
        for (int j = 0; j < numPeople; j++) {
            if (numPeople > posShirt) {
                if (people[0][j] <= shirtSizes[posShirt]) {
                    counter++;
                    posShirt++;
                } else {
                    for (int k = posShirt; k < numShirts; k++) {
                        if (people[0][j] <= shirtSizes[k]) {
                            counter++;
                            posShirt++;
                            k = numShirts;
                        }
                    }
                }
            }
        }

        System.out.println("Case #"+i+": "+counter);






    }

} }

