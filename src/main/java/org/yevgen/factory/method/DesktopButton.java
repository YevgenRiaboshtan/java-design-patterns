package org.yevgen.factory.method;

public class DesktopButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Desktop button");
    }
}
