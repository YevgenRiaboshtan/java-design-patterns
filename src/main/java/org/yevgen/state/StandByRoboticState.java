package org.yevgen.state;

public class StandByRoboticState implements RoboticState {

    private final Robot robot;

    public StandByRoboticState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("In standby state...");
        robot.setCurrentState(robot.getOnRoboticState());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("In standby state...");
        robot.setCurrentState(robot.getCookRoboticState());
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("In standby state...");
        robot.setCurrentState(robot.getOffRoboticState());
        System.out.println("Robot is switched off");
    }
}
