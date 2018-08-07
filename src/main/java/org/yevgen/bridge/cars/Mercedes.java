package org.yevgen.bridge.cars;

import org.yevgen.bridge.Car;
import org.yevgen.bridge.Color;

public class Mercedes extends Car {

    public Mercedes(Color color) {
        super(color, "Mercedes");
    }

    @Override
    public void paint() {
        System.out.println("Paint " + brand + " to " + color.color());
    }
}
