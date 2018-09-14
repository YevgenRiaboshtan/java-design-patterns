package org.yevgen.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CarIterator implements Iterator<Car> {

    private Car[] cars;
    private int currentPosition = -1;

    public CarIterator(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return currentPosition + 1 < cars.length && cars[currentPosition + 1] != null;
    }

    @Override
    public Car next() {
        if (currentPosition + 1 < cars.length && cars[currentPosition + 1] == null) {
            throw new NoSuchElementException();
        }
        return cars[++currentPosition];
    }

    @Override
    public void remove() {
        if (currentPosition < 0 ) {
            throw new IllegalStateException("Illegal position");
        }
        if (cars[currentPosition] != null) {
            for (int i = currentPosition; i < cars.length - 1; i++) {
                cars[i] = cars[i+1];
            }
            cars[cars.length - 1] = null;
            currentPosition--;
        }
    }
}
