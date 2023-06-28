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
        System.out.println("Please Enter a Number");
        String userInput = in.nextLine();
        input = Integer.parseInt(userInput);
        return input;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayDragPerformer(DragPerformer performer) {
        System.out.println(performer.getDragName());
        System.out.println(performer.getAesthetics().get(0) + " & " + performer.getAesthetics().get(1));
        for (Map.Entry<String, Integer> entry : performer.getSkills().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
