package com.jeffreypbee;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private FileReader fileReader;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        fileReader = new FileReader("src/main/resources/dragnames.txt");
        List<String> listOfNames = new ArrayList<>();
        try {
            listOfNames = fileReader.getListOfNames();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        for (String name : listOfNames) {
            System.out.println(name);
        }
    }
}