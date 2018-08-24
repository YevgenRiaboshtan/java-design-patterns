package org.yevgen.state;

public class OffRoboticState implements RoboticState {

    private final Robot robot;

    public OffRoboticState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
        robot.setCurrentState(robot.getOnRoboticState());
    }

    @Override
    public void cook() {
        System.out.println("Cannot cook at off state");
    }

    @Override
    public void off() {
        System.out.println("Already switched off");
    }
}
