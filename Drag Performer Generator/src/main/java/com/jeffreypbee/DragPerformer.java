package com.jeffreypbee;

import java.util.List;
import java.util.Map;

public class DragPerformer {

    private String dragName;
    private String homeTown;
    private List<String> aesthetics;
    private Map<String, Integer> skills;

    public String getDragName() {
        return dragName;
    }

    public void setDragName(String dragName) {
        this.dragName = dragName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public List<String> getAesthetics() {
        return aesthetics;
    }

    public void setAesthetics(List<String> aesthetics) {
        this.aesthetics = aesthetics;
    }

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }
}
