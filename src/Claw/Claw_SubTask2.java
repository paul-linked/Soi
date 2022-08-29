package Claw;

import java.util.ArrayList;
import java.util.Scanner;

public class Claw_SubTask2 {
    public void runApp() {
        Scanner sc = new Scanner(System.in);

        int runs = sc.nextInt();
        for (int i = 0; i < runs; i++) {

            int numCards = sc.nextInt();
            int[] cards = new int[numCards];

            for (int j = 0; j < numCards; j++) {
                cards[j] = sc.nextInt();
            }   //populate cards array

            ArrayList<String> operators = new ArrayList<>();

            int armPos = 0;
            int armHold = -1;

            while (true) {
                if ((cards[0] > cards[1] || cards[1] > cards[2] || armPos != -1)) {
                    if (armPos == 0) {
                        operators.add(">");
                        int temp = cards[0];
                        cards[0] = armHold;
                        armHold = temp;
                        armPos++;
                    } else if (armPos == 2) {
                        operators.add("<");
                        int temp = cards[2];
                        cards[2] = armHold;
                        armHold = temp;
                        armPos--;
                    } else {
                        if (cards[1] > cards[2]) {
                            operators.add(">");
                            int temp = cards[1];
                            cards[1] = armHold;
                            armHold = temp;
                            armPos++;
                        } else {
                            operators.add("<");
                            int temp = cards[1];
                            cards[1] = armHold;
                            armHold = temp;
                            armPos--;
                        }
                    }

                } else {
                    break;
                }
            }

//            operators.toString();
            System.out.print("Case #" + i + ":");
            System.out.println(operators);
//            for (int j = 0; j < operators.size(); j++) {
//                System.out.print(operators.get(j));
//            }
        }
    }
}
