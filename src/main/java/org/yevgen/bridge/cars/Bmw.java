package org.yevgen.bridge.cars;

import org.yevgen.bridge.Car;
import org.yevgen.bridge.Color;

public class Bmw extends Car {

    public Bmw(Color color) {
        super(color, "BMW");
    }

    @Override
    public void paint() {
        System.out.println("Paint " + brand + " to " + color.color());
    }
}
