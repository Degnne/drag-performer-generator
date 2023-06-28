package com.jeffreypbee;

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

}
