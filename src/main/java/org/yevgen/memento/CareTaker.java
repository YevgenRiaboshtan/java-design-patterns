package org.yevgen.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private final Map<String, CircleMemento> savePoints = new HashMap<>();

    public void saveMemento(CircleMemento circleMemento, String savePointName) {
        System.out.println("Save state " + savePointName);
        savePoints.put(savePointName, circleMemento);
    }

    public CircleMemento getMemento(String savePointName) {
        System.out.println("Undo at " + savePointName);
        return savePoints.get(savePointName);
    }

    public void clearSavePoints() {
        System.out.println("Clearing all save points");
        savePoints.clear();
    }
}
