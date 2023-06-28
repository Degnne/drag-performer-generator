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

    public List<String> getListOfNames() throws FileNotFoundException {
        List<String> listOfNames = new ArrayList<String>();
        File fileObject = new File(filePath);
        Scanner scanner = new Scanner(fileObject);
        while (scanner.hasNextLine()) {
            listOfNames.add(scanner.nextLine());
        }
        return listOfNames;
    }

}
