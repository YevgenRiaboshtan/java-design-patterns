package org.yevgen.prototype;

public class Circle extends Shape {

    public Circle() {
        super("Circle");
        System.out.println("Circle huge create process");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
