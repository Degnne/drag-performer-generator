package com.jeffreypbee;

import java.io.FileNotFoundException;

public class Main {

    private FileReader fileReader;
    private DragPerformerGenerator dragGenerator;
    private Menu menu = new Menu();

    private final int GENERATE_DRAG_PERFORMER = 1;
    private final int QUIT = 2;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        fileReader = new FileReader("src/main/resources/");
        dragGenerator = new DragPerformerGenerator(fileReader);

        while (true) {
            menu.displayMenu();
            int selection = menu.promptUserForInt();
            if (selection == GENERATE_DRAG_PERFORMER) {
                try {
                    menu.displayDragPerformer(dragGenerator.generate());
                } catch (FileNotFoundException e) {
                    menu.displayMessage("File Not Found");
                }
            } else if (selection == QUIT) {
                break;
            }
        }
    }
}