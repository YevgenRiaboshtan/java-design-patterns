package org.yevgen.decorator;

public class Nissan implements Car {
    @Override
    public String getDescription() {
        return "Nissan Laurel";
    }

    @Override
    public long getPrice() {
        return 20000;
    }
}
