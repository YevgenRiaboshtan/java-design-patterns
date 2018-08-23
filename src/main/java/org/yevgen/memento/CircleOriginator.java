package org.yevgen.memento;

public class CircleOriginator {

    private final static String INIT_SAVE_POINT = "INIT";

    private int radius;
    private int x;
    private int y;

    private String lastUndoSavePoint;
    private CareTaker careTaker;

    public CircleOriginator(int radius, int x, int y, CareTaker careTaker) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavePoint(INIT_SAVE_POINT);
    }

    public CircleOriginator(CareTaker careTaker) {
        this.careTaker = careTaker;
        createSavePoint(INIT_SAVE_POINT);
    }

    public int getRadius() {
        return radius;
    }

    public CircleOriginator setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public int getX() {
        return x;
    }

    public CircleOriginator setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public CircleOriginator setY(int y) {
        this.y = y;
        return this;
    }

    public void createSavePoint(String savePointName) {
        careTaker.saveMemento(new CircleMemento(radius, x, y), savePointName);
        lastUndoSavePoint = savePointName;
    }

    public void undo() {
        setOriginState(lastUndoSavePoint);
    }

    public void undo(String savePointName) {
        setOriginState(savePointName);
    }

    public void undoAll() {
        setOriginState(INIT_SAVE_POINT);
        careTaker.clearSavePoints();
    }

    private void setOriginState(String savePointName) {
        CircleMemento circleMemento = careTaker.getMemento(savePointName);
        this.radius = circleMemento.getRadius();
        this.x = circleMemento.getX();
        this.y = circleMemento.getY();
    }

    @Override
    public String toString() {
        return "CircleOriginator{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
