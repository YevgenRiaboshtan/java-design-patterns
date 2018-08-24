package org.yevgen.state;

public class Main {

    /*
    Use the State pattern in either of the following cases:
    • An object’s behavior depends on its state, and it must change its behavior at run-time depending on that state.
    • Operations have large, multipart conditional statements that depend on the object’s state. This state is usually represented by
    one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern
    puts each branch of the conditional in a separate class. This lets you treat the object’s state as an object in its own right that can
    vary independently from other objects.
     */
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();
    }
}
