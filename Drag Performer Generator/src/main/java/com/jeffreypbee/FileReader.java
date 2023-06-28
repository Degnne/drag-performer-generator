package com.jeffreypbee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getListOfStrings(String fileName) throws FileNotFoundException {
        List<String> listOfStrings = new ArrayList<String>();
        File fileObject = new File(filePath + fileName);
        Scanner scanner = new Scanner(fileObject);
        while (scanner.hasNextLine()) {
            listOfStrings.add(scanner.nextLine());
        }
        return listOfStrings;
    }
}
