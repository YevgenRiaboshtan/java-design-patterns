package org.yevgen.decorator;

public class WinterTires extends CarDecorator {

    private final Car car;

    public WinterTires(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Winter tires (100)";
    }

    @Override
    public long getPrice() {
        return car.getPrice() + 100;
    }
}
