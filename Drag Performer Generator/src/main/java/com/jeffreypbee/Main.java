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
        fileReader = new FileReader("src/main/resources/");
        List<String> listOfNames = new ArrayList<>();
        try {
            listOfNames = fileReader.getListOfStrings("dragnames.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        List<String> listOfSkills = new ArrayList<String>();
        try {
            listOfSkills = fileReader.getListOfStrings("dragskills.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        for (String skill : listOfSkills) {
            System.out.println(skill);
        }
    }
}