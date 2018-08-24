package org.yevgen.state;

public class OnRoboticState implements RoboticState {

    private final Robot robot;

    public OnRoboticState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
        robot.setCurrentState(robot.getCookRoboticState());
    }

    @Override
    public void off() {
        robot.setCurrentState(robot.getOffRoboticState());
        System.out.println("Robot is switched off");
    }
}
