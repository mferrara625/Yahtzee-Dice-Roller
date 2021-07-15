package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        Scanner scan = new Scanner(System.in);
        List<Dice> diceList = new ArrayList<>();
        Dice dice1 = new Dice(1);
        Dice dice2 = new Dice(2);
        Dice dice3 = new Dice(3);
        Dice dice4 = new Dice(4);
        Dice dice5 = new Dice(5);
        diceList.add(dice1);
        diceList.add(dice2);
        diceList.add(dice3);
        diceList.add(dice4);
        diceList.add(dice5);
        for (int rollNum = 0; rollNum < 3; rollNum++) {
            for (Dice dice : diceList) {
                if (!dice.isHeld)
                    dice.rollDice();
            }
            System.out.println(diceList);
            if (rollNum == 2) break;
            for (int i = 0; i < diceList.size(); i++) {
                System.out.print("Enter Dice Number to Hold Dice or enter 8 to continue: ");
                int input = scan.nextInt();
                if (input == 8)
                    break;
                for (Dice dice : diceList) {
                    if (dice.diceNum == input) {
                        dice.isHeld = true;
                        System.out.println("Dice " + input + " is held");
                    }

                }
            }
            for (int i = 0; i < diceList.size(); i++) {
                System.out.print("Enter Dice Number to Un-Hold Dice or enter 8 to continue to next roll: ");
                int input = scan.nextInt();
                if (input == 8)
                    break;
                for (Dice dice : diceList) {
                    if (dice.diceNum == input) {
                        dice.isHeld = false;
                        System.out.println("Dice " + input + " is un-held");
                    }

                }
            }
        }
    }
}
