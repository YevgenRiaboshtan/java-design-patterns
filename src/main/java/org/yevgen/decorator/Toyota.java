package org.yevgen.decorator;

public class Toyota implements Car {
    @Override
    public String getDescription() {
        return "Toyota Mark II";
    }

    @Override
    public long getPrice() {
        return 10000;
    }
}
