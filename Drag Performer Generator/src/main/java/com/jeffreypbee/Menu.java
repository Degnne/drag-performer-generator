package com.jeffreypbee;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    private Scanner in = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("1) Generate New Drag Performer");
        System.out.println("2) Quit");
    }

    public int promptUserForInt() {
        int input = 0;
        while (true) {
            System.out.println("Please Enter a Number");
            String userInput = in.nextLine();
            try {
                input = Integer.parseInt(userInput);
                break;
            } catch (NumberFormatException e) {
                displayMessage("Incorrect Input");
            }
        }
        return input;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayDragPerformer(DragPerformer performer) {
        System.out.println();
        System.out.println("====================");
        System.out.println(performer.getDragName());
        System.out.println(performer.getAesthetics().get(0) + " & " + performer.getAesthetics().get(1));
        System.out.println();
        for (Map.Entry<String, Integer> entry : performer.getSkills().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("====================");
        System.out.println();
    }

}
