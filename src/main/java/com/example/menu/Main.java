package com.example.menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readanyValueByKeyboard = 0;

        while (readanyValueByKeyboard != 4) {
            System.out.println("WEEKDAY MENU");
            System.out.println("--ENTER A NUMERICAL VALUE TO VIEW THE WORKING DAY AND ITS ALREADY ASSIGNED CASES--");
            System.out.println("ENTER YOUR VALUE ACCORDING TO 1.-DAY / 2.-EVENING / 3.-NIGHT / 4.-EXIT");

            readanyValueByKeyboard = scanner.nextInt();

            if (readanyValueByKeyboard == 1) {
                System.out.println("INTERNAL MENU 1");
                System.out.println("EARLY MORNING");
                System.out.println("1. WAKE UP");
                System.out.println("2. COOK");
                int morningChoice = scanner.nextInt();
                if (morningChoice == 1) {
                    System.out.println("WAKE UP");
                } else if (morningChoice == 2) {
                    System.out.println("COOK");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (readanyValueByKeyboard == 2) {
                System.out.println("INTERNAL MENU 2");
                System.out.println("AFTERNOON");
                System.out.println("1. GOING TO WORK IN THE OFFICE");
                System.out.println("2. BACK TO THE HOUSE");
                int afternoonChoice = scanner.nextInt();
                if (afternoonChoice == 1) {
                    System.out.println("GOING TO WORK IN THE OFFICE");
                } else if (afternoonChoice == 2) {
                    System.out.println("BACK TO THE HOUSE");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (readanyValueByKeyboard == 3) {
                System.out.println("INTERNAL MENU 3");
                System.out.println("NIGHT");
                System.out.println("1. GO SHOPPING AT THE SUPERMARKET");
                System.out.println("2. GO TO BED");
                int nightChoice = scanner.nextInt();
                if (nightChoice == 1) {
                    System.out.println("GO SHOPPING AT THE SUPERMARKET");
                } else if (nightChoice == 2) {
                    System.out.println("GO TO BED");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (readanyValueByKeyboard == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid value entered, please try again.");
            }
        }

        scanner.close();
    }
}
