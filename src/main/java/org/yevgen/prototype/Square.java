package org.yevgen.prototype;

public class Square extends Shape {

    public Square() {
        super("Square");
        System.out.println("Square huge create process");
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
