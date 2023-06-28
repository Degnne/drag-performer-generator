package com.jeffreypbee;

import java.util.List;

public class DragPerformer {

    private String dragName;
    private String homeTown;
    private List<String> skills;

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

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
