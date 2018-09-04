package org.yevgen.decorator;

public class ParkingCamera extends CarDecorator {

    private final Car car;

    public ParkingCamera(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Parking camera (120)";
    }

    @Override
    public long getPrice() {
        return car.getPrice() + 120;
    }
}
