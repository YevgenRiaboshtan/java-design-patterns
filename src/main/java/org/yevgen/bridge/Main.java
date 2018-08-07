package org.yevgen.bridge;

import org.yevgen.bridge.cars.Bmw;
import org.yevgen.bridge.cars.Mercedes;
import org.yevgen.bridge.colors.Black;
import org.yevgen.bridge.colors.Red;

public class Main {

    public static void main(String... args) {
        Car car1 = new Mercedes(new Black());
        Car car2 = new Mercedes(new Red());
        Car car3 = new Bmw(new Black());
        Car car4 = new Bmw(new Red());

        car1.paint();
        car2.paint();
        car3.paint();
        car4.paint();
    }
}
