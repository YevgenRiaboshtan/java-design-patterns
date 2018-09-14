package org.yevgen.iterator;

public class CarStorage {
    private Car[] cars;
    private int currentIndex = 0;

    public CarStorage(int capacity) {
        if (capacity > 0) {
            this.cars = new Car[capacity];
        } else {
            throw new IllegalArgumentException("capacity must be more than 0");
        }
    }

    public void addCar(Car car) {
        if (currentIndex < cars.length) {
            cars[currentIndex] = car;
            currentIndex++;
        } else {
            throw new RuntimeException("Storage is full");
        }
    }

    public Car[] getCars() {
        return cars;
    }
}
