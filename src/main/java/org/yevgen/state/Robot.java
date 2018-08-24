package org.yevgen.state;

public class Robot implements RoboticState {

    private RoboticState onRoboticState;
    private RoboticState cookRoboticState;
    private RoboticState offRoboticState;
    private RoboticState standByRoboticState;

    private RoboticState currentState;

    public Robot() {
        onRoboticState = new OnRoboticState(this);
        cookRoboticState = new CookRoboticState(this);
        offRoboticState = new OffRoboticState(this);
        standByRoboticState = new StandByRoboticState(this);
        currentState = onRoboticState;
    }

    @Override
    public void walk() {
        currentState.walk();
        setCurrentState(getStandByRoboticState());
    }

    @Override
    public void cook() {
        currentState.cook();
        setCurrentState(getStandByRoboticState());
    }

    @Override
    public void off() {
        currentState.off();
    }

    public RoboticState getOnRoboticState() {
        return onRoboticState;
    }

    public RoboticState getCookRoboticState() {
        return cookRoboticState;
    }

    public RoboticState getOffRoboticState() {
        return offRoboticState;
    }

    public RoboticState getStandByRoboticState() {
        return standByRoboticState;
    }

    public void setCurrentState(RoboticState currentState) {
        this.currentState = currentState;
    }
}
