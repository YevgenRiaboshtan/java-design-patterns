package org.yevgen.prototype;

public class Rectangle  extends Shape{

    public Rectangle() {
        super("Rectangle");
        System.out.println("Rectangle huge create process");
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
