package org.yevgen.decorator;

public class AdditionalSecurity extends CarDecorator {

    private final Car car;

    public AdditionalSecurity(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Additional security (200)";
    }

    @Override
    public long getPrice() {
        return car.getPrice() + 200;
    }
}
