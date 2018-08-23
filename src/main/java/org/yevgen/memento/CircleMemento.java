package org.yevgen.memento;

public class CircleMemento {
    private int radius;
    private int x;
    private int y;

    public CircleMemento(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
