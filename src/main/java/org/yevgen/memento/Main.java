package org.yevgen.memento;

public class Main {

    /*
    Use the Memento Pattern in the following cases:
    • A snapshot of (some portion of) an object’s state must be saved so that it can be restored to that state later, and
    • A direct interface to obtaining the state would expose implementation details and break the object’s encapsulation.
     */
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        CircleOriginator circleOriginator = new CircleOriginator(10, 10, 10, careTaker);
        System.out.println("Init state: " + circleOriginator);

        circleOriginator.setRadius(20);
        circleOriginator.createSavePoint("POINT1");
        System.out.println("point1 state: " + circleOriginator);

        circleOriginator.setX(20);
        circleOriginator.setY(20);
        circleOriginator.createSavePoint("POINT2");
        System.out.println("point2 state: " + circleOriginator);

        circleOriginator.setRadius(30);
        System.out.println("state: " + circleOriginator);
        circleOriginator.undo();
        System.out.println("state after undo: " + circleOriginator);

        circleOriginator.undo("POINT1");
        System.out.println("undo to point1 state: " + circleOriginator);

        circleOriginator.undoAll();
        System.out.println("undoAll state: " + circleOriginator);
    }
}
