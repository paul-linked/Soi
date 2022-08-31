package T_Shirts;


import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class TShirts_Subtask3 {     // ONLY WORKS FOR SUBTASK 4 OOPS
    public void runApp() {

        PrintWriter writeMe = null;
        try {
            writeMe = new PrintWriter(new File("C:\\Users\\plundberg\\Desktop\\SOI\\tshirts\\output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //create answer file

        File input = new File("C:\\Users\\plundberg\\Desktop\\SOI\\tshirts\\tshirts-sub3-upsolve-attempt0.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   //read file


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
                if (people[0][j] > people[0][j+1]) {
                    int tempMin = people[0][j];
                    int tempMax = people[1][j];
                    people[0][j] = people[0][k];
                    people[1][j] = people[1][k];
                    people[0][k] = tempMin;
                    people[1][k] = tempMax;
                }
            }
        }   //Sort peoples min ascending


        Arrays.sort(shirtSizes);   //Sort shirts ascending


        int counter = 0;
        int posShirt = 0;
        for (int j = 0; j < numPeople && j < numShirts; j++) {

                if (people[0][j] <= shirtSizes[posShirt] && people[1][j] >= shirtSizes[posShirt]) {
                    counter++;
                    posShirt++;
                } else {
                    for (int k = posShirt; k < numShirts; k++) {
                        if (people[0][j] <= shirtSizes[k] && people[1][j] >= shirtSizes[posShirt]) {
                            counter++;
                            posShirt++;
                            k = numShirts;
                        }
                    }
                }
            }   //Count shirts


        writeMe.println("Case #"+i+": "+counter);
        System.out.println("Case #"+i+": "+counter);






    }

writeMe.close();
} }

