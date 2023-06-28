package com.jeffreypbee;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DragPerformerGenerator {

    private final int MAX_STAT_VALUE = 10;
    private FileReader fileReader;

    public DragPerformerGenerator(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public DragPerformer generate() throws FileNotFoundException {
        DragPerformer dragPerformer = new DragPerformer();
        dragPerformer.setDragName(randomDragName(getDragNames()));
        dragPerformer.setSkills(randomDragSkills(getDragSkills()));
        dragPerformer.setAesthetics(randomDragAesthetics(getDragAesthetics()));
        return dragPerformer;
    }

    private List<String> getDragNames() throws FileNotFoundException {
        List<String> listOfNames = new ArrayList<>();
        listOfNames = fileReader.getListOfStrings("dragnames.txt");
        return listOfNames;
    }

    private List<String> getDragSkills() throws FileNotFoundException {
        List<String> listOfSkills = new ArrayList<String>();
        listOfSkills = fileReader.getListOfStrings("dragskills.txt");
        return listOfSkills;
    }

    private List<String> getDragAesthetics() throws FileNotFoundException {
        List<String> listOfDragAesthetics = new ArrayList<String>();
        listOfDragAesthetics = fileReader.getListOfStrings("dragaesthetics.txt.txt");
        return listOfDragAesthetics;
    }

    private String randomDragName(List<String> listOfNames) {
        String name = "";
        name = listOfNames.get((int)(Math.random() * listOfNames.size()));
        return name;
    }

    private Map<String, Integer> randomDragSkills(List<String> listOfSkills) {
        Map<String, Integer> dragSkills = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : dragSkills.entrySet()) {
            entry.setValue((int)(Math.random() * MAX_STAT_VALUE));
        }
        return dragSkills;
    }

    private List<String> randomDragAesthetics(List<String> listOfAesthetics) {
        List<String> aesthetics = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            aesthetics.add(listOfAesthetics.get((int)(Math.random() * listOfAesthetics.size())));
        }
        return aesthetics;
    }

}
