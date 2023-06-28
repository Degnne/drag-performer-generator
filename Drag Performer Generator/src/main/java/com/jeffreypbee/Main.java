package com.jeffreypbee;

public class Main {

    private FileReader fileReader;
    private DragPerformerGenerator dragGenerator;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        fileReader = new FileReader("src/main/resources/");
        dragGenerator = new DragPerformerGenerator(fileReader);
    }
}