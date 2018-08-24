package org.yevgen.state;

public class CookRoboticState implements RoboticState {

    private final Robot robot;

    public CookRoboticState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
        robot.setCurrentState(robot.getOnRoboticState());
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("Cannot switched off while cooking");
    }
}
