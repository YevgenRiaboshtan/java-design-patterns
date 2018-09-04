package org.yevgen.decorator;

public class GpsNavigation extends CarDecorator {

    private final Car car;

    public GpsNavigation(Car car) {
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + ", GPS Navigation (70)";
    }

    @Override
    public long getPrice() {
        return car.getPrice() + 70;
    }
}
