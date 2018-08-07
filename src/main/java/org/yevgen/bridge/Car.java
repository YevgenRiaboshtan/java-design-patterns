package org.yevgen.bridge;

public abstract class Car {

    protected final Color color;
    protected final String brand;

    protected Car(Color color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    abstract public void paint();
}
